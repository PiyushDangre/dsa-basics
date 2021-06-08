package searching;

/**
 * - Problem is to count occurences of array in sorted array.
 * - If we search linearly for the array element then the complexoty would be O(n).
 * - We can do this much easily by using binary search in O(logn).
 * - We just have to find the index of last occurence and first occurence, and then find the difference between them. The difference is the no. of outlets.
 * - The whole problem is solved using binary search.
 * 
 * @author Piyush Dangre
 *
 */
public class CountOccurencesInSortedArray {

	public static int countOccurences(int arr[], int k) { 
		
		int first = searchFirst(arr, k);
		
		if(first != -1) {
			return (searchLast(arr, k) - first + 1);
		}else {
			return 0 ;
		}
		
	}
	
	public static int searchFirst(int arr[], int k) {
		
		int n = arr.length ;
		int low = 0 ; int high = n-1 ;
		int mid  = 0 ;
		
		while(low <= high) {
			mid = (high + low) / 2;
			
			if(arr[mid] < k) {
				low = mid + 1;
			}else if (arr[mid] > k){
				high = mid -1 ;
			}else {
				// Code has entered this block means it has found the equal element. Now we have to just ensure if it is the first occurence or not.
				if(mid ==  0 || arr[mid] != arr[mid-1]) {
					return mid;
				}else {
					high = high-1;
				}
			}
		}
		
		return -1;
	}
	
	public static int searchLast(int arr[], int k) {
		int n=arr.length;
		int low = 0;
		int high=n-1;
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid] > k) {
				high = mid -1;
			}else if(arr[mid] < k) {
				low = mid + 1 ; 
			}else {
				if(mid == n-1 || arr[mid] != arr[mid+1]) {
					return mid ;
				}else {
						low = mid + 1;
				}
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {10,10,20,20,20,40,40} ;
		int k = 40 ;
		int noOfOccur = countOccurences(arr, k);
		System.out.println("No. of occurences are "+ noOfOccur);
	}
}

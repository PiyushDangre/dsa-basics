package searching;

/**
 * - Find the index of first occurence of an element within a sorted array.
 * - Using Binary search technique will reduce the complexity of the solution to O(logn) rather than O(n)
 * - We can use binary search as array is sorted.
 * 
 * @author Piyush Dangre
 *
 */
public class IndexOfFirstOccurence {
	
	public static int search(int arr[], int k) {
		
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
	
	public static void main(String[] args) {
		int arr[] = {5,10,10,20,20};
		int k = 20;
		int firstOccur = search(arr, k);
		System.out.println("First occurence is "+firstOccur);
	}
}

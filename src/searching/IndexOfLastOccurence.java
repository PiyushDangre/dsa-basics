package searching;

/**
 * This is in similar fashion as in IndexOfFirstOccurence program.
 * Remember for binary search to work, array has to be sorted.
 * 
 * @author Piyush Dangre
 *
 */
public class IndexOfLastOccurence {

	public static int search(int arr[], int k) {
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
		int arr[] = {5,10,10,10,10,20,20};
		int k=20;
		int index = search(arr, k);
		System.out.println("Last occurence is at index "+index);
	}
}

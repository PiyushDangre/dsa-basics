package arrays;

/**
 * - Given an array of integers, find out the element which is in majority.
 * - By majority we mean element that occurs more than n/2 time where n is size of array.
 * @author Piyush Dangre
 *
 */
public class MajorityElement {

	/**
	 * This is naive solution requires O(n^2) complexity.
	 * Loop through each element.
	 * @param arr
	 * @return
	 */
	public static int naiveSolution(int arr[]) {
		int n = arr.length;
		int res = -1 ;
		
		// loop through
		for(int i=0; i<n;i++) {
			int count = 0;
			int majorityElement = -1 ;
			for(int j=0;j<n; j++) {
				if(arr[i] == arr[j]) {
					count++;
					majorityElement = arr[j];
				}
			}
			
			if(count > n/2) {
				res = majorityElement;
				break;
			}
		}
		
		return res;
	}
	
	public static void main(String args[]) {
		int arr[] = {8,7,6,8,6,6,6};
		System.out.println("Majority element by naive method is "+naiveSolution(arr));
	}
}

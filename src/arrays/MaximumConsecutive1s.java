package arrays;

/**
 * - This is a simple program to calculate the maximum number of consecutive 1s in a given array.
 * 
 * @author Piyush Dangre
 *
 */
public class MaximumConsecutive1s {
	public static void main(String[] args) {
		int arr[] = {1,1,1,1,0,0,1,1,1} ;
		int maxOnes = consecutiveOnes(arr);
		System.out.println("The max consecutive ones are "+maxOnes+" in number.");
	}
	
	/**
	 * - We maintain two pointers - count is the cosecutivenumber of ones.
	 * - maxCount is the result we want to return, that is maximum of all counts.
	 * - start traversing from left, maintain the count for every 1.
	 * - for every non 1 value reset count and find the maximum of counts, and assign it to maxCount.
	 * - return maxCount.
	 * - for the case when all values are 1, return Math.max(count, maxCount) each time.
	 * 
	 * @param arr
	 * @return
	 */
	public static int consecutiveOnes(int arr[]) {
		int count = 0 ;
		int maxCount = 0 ;
		int n = arr.length ;
		
		for(int i = 0 ; i<n; i++) {
			if(arr[i]==1) {
				count++;
			}else {
				maxCount = Math.max(count, maxCount);
				count = 0;
			}
		}
		
		return Math.max(count, maxCount);
	}

}

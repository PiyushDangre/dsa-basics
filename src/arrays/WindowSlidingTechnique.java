package arrays;

/**
 * - We are given an array and int k . We have to find the maximum sum of k consecutive elements within the array.
 * @author Piyush Dangre
 *
 */
public class WindowSlidingTechnique {

	/**
	 * - Naive solution
	 * @param arr
	 * @return
	 */
	public static int mySolution(int[] arr, int num) {
		int res = 0 ;
		int n=arr.length;
		
		for(int i=0; i<n ; i++) {
			if(i==n-num) {
				break;
			}
			int currSum = 0;
			for(int j=i; j < i+num; j++) {
				currSum = currSum + arr[j];
			}
			res = Math.max(currSum, res);
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,8,30,-5,20,7} ;
		int k = 3 ;
		int res = mySolution(arr, k);
		System.out.println(res);
		
	}
}

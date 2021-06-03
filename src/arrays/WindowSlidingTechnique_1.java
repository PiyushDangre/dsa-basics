package arrays;

/**
 * - We are given an array and int k . We have to find the maximum sum of k consecutive elements within the array.
 * @author Piyush Dangre
 *
 */
public class WindowSlidingTechnique_1 {

	/**
	 * - Naive solution
	 * 
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
	
	/**
	 * - We use window sliding technique.
	 * - In this we consider the starting sum of first k elements to be the max sum.
	 * - Then in a loop we keep adding one element from the right of the window of first k elements, and subtract the start of the window at the same time.
	 * - We do the above step to the current max sum.
	 * - At the same time we keep comparing if we have surpassed the max sum. In the end, we are left with max sum.
	 * - This is a O(n-k) complexity solution. Better than naive solution displayed above.
	 * 
	 * @param arr
	 * @param k
	 * @return
	 */
	public static int maxSumOfConsecutiveElements(int arr[], int k) {
		
		int max_sum = 0 ;
		int curr_sum = 0 ;
		
		for(int i=0; i< k; i++) {
			max_sum += arr[i];
		}
		
		curr_sum = max_sum ;
		
		for(int i = k; i < arr.length ; i++) {
			curr_sum = curr_sum + arr[i] - arr[i-k] ; // Here the arr[i-k] points always to the first element of current window.
			max_sum = Math.max(curr_sum, max_sum);
		}
		
		return max_sum; 
	}
	
	public static void main(String[] args) {
		int arr[] = {1,8,30,-5,20,7} ;
		int k = 3 ;
		int res = mySolution(arr, k);
		System.out.println(res);
		
		System.out.println("Max sum using window sliding technique is "+ maxSumOfConsecutiveElements(arr, k));
		
	}
}

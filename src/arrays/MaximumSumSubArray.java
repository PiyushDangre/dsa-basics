package arrays;

/**
 * - We have an array where we have to find the maximum sum any subarray would be able to create.
 * - There are two solutions listed, naive and efficient.
 * 
 * @author Piyush Dangre
 *
 */
public class MaximumSumSubArray {

	/**
	 * - This is naive solution
	 * - We have O(n^2) worst case complexity.
	 * - We start from the leftmost element. for each element we add that with every other element of array.
	 * - maintain this sum in loop in curr pointer. check if this sum has passed maxSum each time.
	 * - Thus we get maximum sub array sum in the end.
	 * @param arr
	 * @return
	 */
	public static int naiveMaxSumSubArray(int arr[]) {
		int maxSum = 0;
		int n = arr.length;

		for (int i = 0; i < n; i++) {

			int curr = 0;

			for (int j = i; j < n; j++) {
				curr = curr + arr[j];
				maxSum = Math.max(curr, maxSum);
			}
		}

		return maxSum;
	}

	/**
	 * - This is efficient solution where we have O(n) complexity.
	 * - Traverse from the 2nd element.
	 * - Mark sum until now(maxSum) and res as the value of first element.
	 * - for every element, check which is the maximum from that element or that element + previously calculated sum until now.
	 * - The key choice is either to extend the previous sub array or start a new subarray
	 * @param arr
	 * @return
	 */
	public static int maxSubArraySum(int arr[]) {

		int n = arr.length;
		int maxSum = arr[0];
		int res = arr[0];

		for (int i = 1; i < n; i++) {
			maxSum = Math.max(maxSum + arr[i], arr[i]);
			res = Math.max(res, maxSum);
		}

		return res;
	}

	public static void main(String[] args) {
		int arr[] = { 1, -2, 3, -1, 2 };
		int maxSum = naiveMaxSumSubArray(arr);
		System.out.println("The value of maximum subarray sum is " + maxSum + " by naive method");

		int maxSumbyMethod = maxSubArraySum(arr);
		System.out.println("The value of maximum subarray sum is " + maxSumbyMethod);
	}

}

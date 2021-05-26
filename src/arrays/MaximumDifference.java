package arrays;

import java.util.Arrays;

public class MaximumDifference {

	/**
	 * -	We traverse from the left side
	 * -	On each iteration, we check if the new no. is lower than the current minimum no. that we have.
	 * -	If we have a lower number, that means we check the difference.
	 * -	We check if the difference is greater than the current maximum difference that we have.
	 * -	In the end we are left with max difference. 
	 * @param arr
	 * @return
	 */
	public static int maxDifference(int arr[]) {
		int n = arr.length;
		int min = arr[0];
		int maxDiff = arr[1] - arr[0];

		for (int i = 0; i < n; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else {
				int diff = arr[i] - min;
				maxDiff = Math.max(maxDiff, diff);
			}
		}

		return maxDiff;
	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 40, 8, 20, 20, 1, 40, 90, 90 };
		System.out.println("Maximum difference is ");
		System.out.println(maxDifference(arr1));
	}
}

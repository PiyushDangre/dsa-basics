package arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	/**
	 * - We are playing with two pointers here.
	 * 
	 * @param arr
	 */
	public static void removeDuplicatesFromSortedArray(int arr[]) {
		int arrLength = arr.length;
		int res = 1;

		for (int i = 1; i < arrLength; i++) {
			if (arr[i] != arr[res - 1]) {
				arr[res] = arr[i];
				res++;
			}
		}

	}

	public static void main(String[] args) {

		int[] arr1 = { 10, 20, 20, 20, 40, 50, 70, 70, 70 };
		System.out.println("Before removal - " + Arrays.toString(arr1));
		removeDuplicatesFromSortedArray(arr1);
		System.out.println("After removal - " + Arrays.toString(arr1));

	}

}

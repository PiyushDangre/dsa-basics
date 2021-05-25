package arrays;

import java.util.Arrays;

public class LeftRotateArrayByDElements {

	/**
	 * -	We are basically using a temp array to store first d values
	 * -	Then shift each element d places to the left
	 * -	Then we replace last d elements of the array with the temp array elements
	 * @param arr
	 * @param d
	 */
	public static void leftRotateArrayByDElements(int[] arr, int d) {

		int[] temp = new int[d];

		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}

		for (int i = d; i < arr.length; i++) {
			arr[i - d] = arr[i];
		}

		for (int i = 0; i < d; i++) {
			arr[arr.length - d + i] = temp[i];   // This one takes time to think
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 0, 0, 0, 20, 0, 40, 90, 0 };
		System.out.println("Before rotation - " + Arrays.toString(arr1));
		leftRotateArrayByDElements(arr1, 2);
		System.out.println("After rotation - " + Arrays.toString(arr1));

	}

}

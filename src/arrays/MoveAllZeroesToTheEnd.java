package arrays;

import java.util.Arrays;

/**
 * -	We have to move all the zeroes present in the array to the rightmost position, That is, at the end.
 * @author user
 *
 */
public class MoveAllZeroesToTheEnd {

	/**
	 * Count variable here is just the count of non zero elements
	 * 
	 * @param arr
	 */
	public static void moveAllZeroesToEnd(int[] arr) {
		int arrLength = arr.length;
		int count = 0;
		for (int i = 0; i < arrLength; i++) {
			if (arr[i] != 0) {
				swap(count, i, arr);
				count++;
			}
		}
	}

	public static void swap(int a, int b, int arr[]) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 0, 0, 0, 20, 0, 40, 90, 0 };
		System.out.println("Before removal - " + Arrays.toString(arr1));
		moveAllZeroesToEnd(arr1);
		System.out.println("After removal - " + Arrays.toString(arr1));

	}
}

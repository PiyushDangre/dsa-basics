package arrays;

import java.util.Arrays;

public class LeftRotateArrayByDElements {

	/**
	 * - 	This is first method where we are using additional temporary array.
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
	
	/**
	 * -	This is the 2nd method of the left rotation
	 * -	Basically we first reverse the array until index d-1
	 * -	Then we reverse subset of array from d index to the end element
	 * - 	Then whatever array we have, we reverse that fully. This gives left rotated array.
	 * @param arr
	 * @param d
	 */
	public static void leftRotateArrayByReversalMethod(int arr[], int d) {
		reverseArray(arr, 0, d-1);
		reverseArray(arr, d, arr.length - 1);
		reverseArray(arr, 0, arr.length - 1);
	}
	
	/**
	 * -	Simple function to reverse array elements provided high and low pointers.
	 * -	High pointer has to point to end element
	 * -	Low pointer has to point to the start element from where reversal needs to be performed.
	 * @param arr
	 * @param low
	 * @param high
	 */
	public static void reverseArray(int[] arr, int low, int high) {
		while(low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp ;
			low ++ ;
			high -- ;
		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 0, 0, 0, 20, 0, 40, 90, 0 };
		System.out.println("Before rotation - " + Arrays.toString(arr1));
		leftRotateArrayByDElements(arr1, 2);
		System.out.println("After rotation using 1st method - " + Arrays.toString(arr1));
		
		int[] arr2 = { 10, 20, 0, 0, 0, 20, 0, 40, 90, 0 };
		System.out.println("Before rotation array 2- " + Arrays.toString(arr2));
		leftRotateArrayByReversalMethod(arr2, 2);
		System.out.println("After rotation using reversal method - " + Arrays.toString(arr2));

	}

}

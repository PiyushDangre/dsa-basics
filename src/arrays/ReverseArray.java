package arrays;

import java.util.Arrays;

public class ReverseArray {
	
	/**
	 * -	Basically we are maintaining two different pointers.
	 * -	One pointer starts from the 0th index and another from the n-1 th index
	 * -	Remember that the (n-1)th index is the last element of an array always.
	 * -	n is the total size of the array.
	 * -	We are swapping the positions of the elements here. 
	 * @param arr
	 */
	public static void reverseArray(int[] arr) {
		
		int low = 0 ;
		int high = arr.length - 1 ; // Last index of array
		
		while(low < high) {
			int temp  = arr[low] ;
			arr[low] = arr[high];
			arr[high] = temp ;
			low++ ; 
			high-- ;
		}
	}
	

	public static void main(String[] args) {
		
		// let array be 108 , 90 , 7 , 45, 77, 88
		int[] arr1 = {108 , 90 , 7 , 45, 77, 88};
		System.out.println(Arrays.toString(arr1));
		reverseArray(arr1);
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2 = {200,200,300,488};
		System.out.println(Arrays.toString(arr2));
		reverseArray(arr2);
		System.out.println(Arrays.toString(arr2));
	}
}

package arrays;

/**
 * - Find the sum of given range of indices within an array. - The solution
 * should be O(1). - The idea is to create another array of same number of
 * elements. - This array should have elements such that element at index i
 * should be equal in value to the sum of all elements till index i. - Then
 * finding the sum of elements in a given index range just becomes order of 1
 * operation.
 * 
 * @author Piyush Dangre
 *
 */
public class PrefixSumTechnique_1 {

	public static int findSumInRange(int start, int end, int[] arr) {

		// First create the prefix sum array
		int prefixArr[] = new int[arr.length];
		int elementSum = arr[0];
		prefixArr[0] = elementSum;

		for (int i = 1; i < arr.length; i++) {
			prefixArr[i] = elementSum + arr[i];
			elementSum = prefixArr[i];
		}

		// Once the prefix sum array is created, the sum operation is just get operation
		// over array with O(1) complexity
		int sum = 0;
		if (start != 0) {
			sum = prefixArr[end] - prefixArr[start - 1];
		} else {
			sum = prefixArr[end];
		}

		return sum;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 8, 3, 9, 6, 5, 4 };
		int sum = findSumInRange(1, 4, arr);
		System.out.println("Sum of given range is "+sum);
	}

}

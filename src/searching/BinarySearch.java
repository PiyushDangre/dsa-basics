package searching;

/**
 * - Simple implementation of binary search 
 * - The array has to be sorted.
 * - This is iterative approach
 * 
 * @author Piyush Dangre
 *
 */
public class BinarySearch {

	public static int binarySearch(int arr[], int k) {

		int n = arr.length;
		int low = 0;
		int high = n - 1;

		while (low <= high) {
			int mid = (low + high) / 2;

			if (arr[mid] == k) {
				return mid;
			} else if (arr[mid] < k) {
				low = mid + 1;
			} else if (arr[mid] > k) {
				high = mid - 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 43, 55, 88 };
		int k = 55;
		int index = binarySearch(arr, k);
		System.out.println("Element found at index " + index);
	}
}

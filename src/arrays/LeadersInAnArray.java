package arrays;

import java.util.Arrays;

public class LeadersInAnArray {

	/**
	 * - Leader element in an array is the one which has no element to its right,
	 * which is greater than itself. - That means starting from leftmost element,
	 * see if any of the element on right is greater. - If any one also element is
	 * greater, then that is not leader. - If any one element is equal, even then
	 * that element is not leader. - This means that the end element is always a
	 * leader. - The approach in this program is that start from the end as we know
	 * rightmost element is aleways leader. - Then check if any of the left element
	 * is greater than it. If yes then new leader found. - Keep checking this in
	 * loop. That's it.
	 * 
	 * @param arr
	 */
	public static void printLeadersInArray(int arr[]) {

		int n = arr.length;

		// RIGHT most element(last element) will always be a leader
		System.out.println(arr[n - 1]);

		int currentLeader = arr[n - 1];

		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] > currentLeader) {
				System.out.println(arr[i]);
				currentLeader = arr[i];
			}
		}
	}

	public static void main(String[] args) {
		// let array be 108 , 90 , 7 , 45, 77, 88
		int[] arr1 = { 108, 90, 7, 45, 77, 88 };
		printLeadersInArray(arr1);
	}

}

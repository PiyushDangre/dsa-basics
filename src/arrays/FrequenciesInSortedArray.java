package arrays;

public class FrequenciesInSortedArray {

	/**
	 * -	This solution is little different to what was explained in course
	 * -	Traverse from left. Maintain two pointers currentFrequency and lastElement traversed.
	 * -	check if same element then increment frequency. If not then reset frequency to one. and make lastElement the new element.
	 * -	Start from consideration of currFreq as 1 and the lastElement as 1st element of array.
	 * @param arr
	 */
	public static void printFrequencies(int arr[]) {
		
		int n = arr.length;
		int currFreq = 1;
		int lastElement = arr[0];

		for (int i = 1; i < n; i++) {
			if (lastElement == arr[i]) {
				currFreq++;
			} else {
				System.out.println("Frequency of " + arr[i - 1] + " is " + currFreq);
				currFreq = 1;
				lastElement = arr[i];
			}

		}

		System.out.println("Frequency of " + arr[n - 1] + " is " + currFreq);
	}

	public static void main(String[] args) {
		// let array be { 90, 90 , 90 , 100, 102, 120, 120 }
		int[] arr1 = { 0, 0, 4, 90, 90, 90, 100, 102, 120, 120, 131 };
		printFrequencies(arr1);
	}
}

package arrays;

/**
 * - We have an array which consists of groups of 1s and 0s.
 * - We have to flip either 0s to 1s or 1s to 0s in order to make the array consist of only one element.
 * - Problem statement is to make the array of same element with minimum number of flips.
 * @author Piyush Dangre
 *
 */
public class MinimumGroupFlips {

	/**
	 * - This is my naive solution to calculate the number of groups of both 1 and 0 respectively.
	 * - Then the lesser group has to be flipped.
	 * @param arr
	 */
	public static void mySolution(int arr[]) {

		int n = arr.length;
		int count_ones = 0;
		int count_zeroes = 0;
		int currElement = arr[0];

		if (currElement == 0) {
			count_zeroes = 1;
		} else {
			count_ones = 1;
		}

		for (int i = 1; i < n; i++) {
			if (arr[i] != currElement) {
				if (arr[i] == 0) {
					count_zeroes++;
				} else {
					count_ones++;
				}
				currElement = arr[i];
			}
		}

		System.out.println("1 groups are " + count_ones);
		System.out.println("0 groups are " + count_zeroes);

		if (count_ones < count_zeroes) {
			for (int i = 0; i < n; i++) {
				if (arr[i] == 1) {
					System.out.println("Change index " + i);
				}
			}
		}

		if (count_ones > count_zeroes) {
			for (int i = 0; i < n; i++) {
				if (arr[i] == 0) {
					System.out.println("Change index " + i);
				}
			}
		}
	}

	/**
	 * - This approach relies on the fact that the difference between the number of groups of consecutive 1 or 0 is always going to be 1.
	 * - So the second group that we encounter will always be either in majority or will be equal to the first group in number.
	 * - Then we are just left with printing the index that needs flipping.
	 * @param arr
	 */
	public static void minimumFlips(int arr[]) {
		int n = arr.length ;
		
		for(int i=1; i<n;i++) {
				if(arr[i] != arr[i-1]) {
					if(arr[i] != arr[0]) {
						System.out.println("From "+i+" to ");
					}else {
						System.out.println(i-1);
					}
				}
		}
		
		// This is to handle the case when the element at edge will not be equal to arr[0]
		if(arr[n-1] != arr[0]) {
			System.out.println(n-1);
		}
	}
	
	public static void main(String[] args) {
		// let array
		int arr[] = { 0,0,1,1,0,0,1,0,0};
		mySolution(arr);
		System.out.println("Minimum flips by using minimumFlips() method -");
		minimumFlips(arr);

	}
}

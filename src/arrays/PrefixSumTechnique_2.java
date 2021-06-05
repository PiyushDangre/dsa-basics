package arrays;

/**
 * - The problem statememnt is to find if there is such an element where equilibrium is achieved within array
 * - This means the sum of elements on left side of that element shoould be equal to sum of elements on right side.
 * @author Piyush Dangre
 *
 */
public class PrefixSumTechnique_2 {

	/**
	 * My Solution
	 * - We create a prefix sum array first.
	 * - Then traverse over the array while calculating the sums on left and right of each element.
	 * - If we find equality between these two sums, we return true.
	 * @param arr
	 * @return
	 */
	public static boolean findIfEquilibrium(int[] arr) {

		// First create the prefix sum array
		int prefixArr[] = new int[arr.length];
		int elementSum = arr[0];
		prefixArr[0] = elementSum;

		for (int i = 1; i < arr.length; i++) {
			prefixArr[i] = elementSum + arr[i];
			elementSum = prefixArr[i];
		}

		int left_sum, right_sum = 0;
		boolean isEquilibrium = false;
		for (int i = 0; i < prefixArr.length; i++) {

			if (i == 0) {
				left_sum = 0;
				right_sum = prefixArr[prefixArr.length - 1] - prefixArr[i];
			} else if (i == arr.length - 1) {
				right_sum = 0;
				left_sum = prefixArr[arr.length - 2];
			} else {
				left_sum = prefixArr[i - 1];
				right_sum = prefixArr[arr.length - 1] - prefixArr[i];
			};
			
			if(left_sum == right_sum) {
				isEquilibrium = true ;
			}
		
		}

		return isEquilibrium;
	}
	
	/**
	 * This is more efficient solution
	 * - We calculate the sum of all elements of array first time.
	 * - Then we traverse the array, we maintain the left sum
	 * - for each element we calculate the right sum by subtracting the left sum from total sum of array elements.
	 * - If we find the equality within these two sums, we return true.
	 * @param arr
	 * @return
	 */
	public static boolean findEquilibrium(int arr[]) {
		
		// Step 1 is to calculate total sum
		int sum = 0 ;
		int n=arr.length ;
		for(int i=0; i<n; i++) {
			sum+=arr[i];
		}
		
		// Step 2 - Traverse array
		int left_sum = 0;
		int right_sum = 0 ;
		for(int i=0; i < n ; i++) {
			right_sum = sum - left_sum - arr[i];
			if(left_sum == right_sum) {
				return true;
			}
			left_sum = left_sum + arr[i];
		}
		
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 4, 8, -9, 20, 6 }; // prefix array will be {3,7,15,6,26,32}
		boolean isEquilibrium = findIfEquilibrium(arr);
		System.out.println("There is equilibrium in given array - "+isEquilibrium);
		
		isEquilibrium = findEquilibrium(arr);
		System.out.println("There is equilibrium in given array - "+isEquilibrium);
		
	}

}

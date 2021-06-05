package arrays;

/**
 * Print the first m n-bonacci numbers.
 * Like fibonacci, we have n-bonacci. In fibonacci, every element is sum of last two elements.
 * In n-bonacci, every element is sum of last n elements.
 * 
 * @author Piyush Dangre
 *
 */
public class WindowSlidingTechnique_2 {

	/**
	 * O(m)
	 * @param n
	 * @param m
	 * @param arr
	 */
	public static void printnbonaccinos(int n, int m, int arr[]) {
		// here it's to be understood that window size  will be n.
		
		int element = 0 ;
		
		for(int i=0; i<n; i++) {
			element = element + arr[i];
		}
		
		System.out.print(element+", ");
		
		for(int i=n ; i< m+n-1 ; i++) {
			element = element + arr[i] - arr[i-n];
			System.out.print(element+", ");
		}
		
		
	}
	
	public static void main(String[] args) {
		int[] arr = {0,0,1,1,2,4,7,13};
		printnbonaccinos(3, 3, arr);
	}
}

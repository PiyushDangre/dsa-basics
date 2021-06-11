package searching;

/**
 * - This problem uses binary search to find square root of element in efficient manner
 * - Complexity is O(logn) instead of linear fashion O(n)
 * @author Piyush Dangre
 *
 */
public class SquareRoot {
	
	/**
	 * To find square root of an element
	 * @param arr
	 * @param k
	 * @return
	 */
	public static int sqrt(int k) {
		int high = k ;
		int low = 1 ;
		int ans = -1 ;
		while(low <= high) {
			int mid  = (high + low)/2 ;
			int sqrt = mid  * mid ;
			
			if(sqrt == k) {
				return mid ;
			}else if(sqrt > k){
				high = mid - 1 ;
			}else {
				low = mid + 1 ;
				ans = mid ;
			}
		}
		
		return ans ;
	}
	
	public static void main(String[] args) {
		// Find square root of given no.
		int k = 64 ;
		int sqrt = sqrt(k);
		System.out.println("Square root of "+k+" is "+sqrt);
		
	}
}

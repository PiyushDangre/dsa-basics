package arrays;

/**
 * - Find the longest subarray which has alternative odd-even pairs.
 * 
 * @author Piyush Dangre
 *
 */
public class LongestEvenOddSubArray {

	/**
	 * - This approach is using Kadane's algorithm.
	 * - That means we have to at each point take decision whether to extend the subarray or start new subarray.
	 * - Traverse from the left. For each element, check if the previous element and this element forms an edd even pair.
	 * - If yes then increment curr counter. And also check if is is the max length.
	 * - If no reset the curr counter.
	 * - Return result in the end.
	 * - This is efficient solution as it takes O(n) complexity.
	 * @param arr
	 * @return
	 */
	public static int longestEvenOddSubArray(int arr[]) {
		
		int n = arr.length ;
		int curr = 1 ;
		int res = 1 ;
		
		for(int i=1; i<n ; i++) {
			if((arr[i] % 2 == 0 && arr[i-1] % 2 != 0) || (arr[i]%2 != 0 && arr[i-1]%2 == 0)) {
				curr++;
				res=Math.max(res, curr);
			}else {
				curr=1;
			}
		}
		return res;
	}
	
	/**
	 * - Naive solution has O(n^2) complexity
	 * @param arr
	 * @return
	 */
	public static int naiveSolution(int arr[]) {
		return 0;
	}
	
	public static void main(String[] args) {
		int arr[]  = {5,10,20,6,3,8} ;
		int longestOddEvenSubArrayLength = longestEvenOddSubArray(arr);
		System.out.println("Longest ever length for odd even contiguous array is "+longestOddEvenSubArrayLength);
	}
}

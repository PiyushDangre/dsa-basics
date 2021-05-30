package arrays;

/**
 * - Circular sub array is a subarray with connected last and first elements combined of the array.
 * 
 * @author Piyush Dangre
 *
 */
public class MaximumCircularSubArraySum {

	/**
	 * - This is Naive solution.
	 * - We are using modular function to calculate index of subarray in circular fashion.
	 * - We maintain curr_sum for calculating sum of current subarray.
	 * - We maintain curr_max to store overall maximum sum of circular subarray. 

	 * @param arr
	 * @param n
	 * @return
	 */
	 public static int naiveMaxCircularSum(int arr[], int n)
	    {
	    	int res = arr[0];

	    	for(int i = 0; i < n; i++)
	    	{
	    		int curr_max = arr[i];
	    		int curr_sum = arr[i];

	    		for(int j = 1; j < n; j++)
	    		{
	    			int index = (i + j) % n; // This has been done to calculate the index of subarray in a circular manner.

	    			curr_sum += arr[index];

	    			curr_max = Math.max(curr_max, curr_sum);
	    		}

	    		res = Math.max(res, curr_max);
	    	}
	    	return res;
	    }
	 
	 /**
	  * - For better explanation, refer 'Method 3' shown in following youtube link :-
	  * - https://www.youtube.com/watch?v=Q1TYVUEr-wY
	  * 
	  * 
	  * @param arr
	  * @return
	  */
	 public static int maxCircularSum(int arr[]) {
		
		 int n = arr.length ;
		 
		 int array_sum = 0 ;
		 
		 // Step 1 - First we call normal kedane's algorithm to find max sum of normal subarray (not circular ones)
		 int maxSumNormal = maxSumSubArray(arr);
		 
		 // Step 2 - This condition is necessary to get right output
		 if(maxSumNormal < 0) {
			 return maxSumNormal;
		 }
		 
		 // Step 3 - Now calculate sum of all array elements. Also in the same loop, invert the array elements.
		 for(int i=0; i<n; i++) {
			 array_sum += arr[i] ;
			 arr[i] = -arr[i];
		 }
		 
		 // Step 4 - Subtract minimum normal subarray sum from overall array sum. This means add max sum subarray.
		 int maxSumCircular = array_sum + maxSumSubArray(arr);
		 
		 // Step 5 - return maximum out of two sums - normal and circular.
		 return Math.max(maxSumCircular, maxSumNormal);
	 }
	 
	 /**
	  * - This is using normal Kadane's algorithm
	  * - This method is part of efficient method of solving this problem.
	  * @param arr
	  * @return
	  */
	 public static int maxSumSubArray(int arr[]) {
		 
		 int  n = arr.length;
		 int res = arr[0];
		 int maxSum = arr[0];
		 
		 for(int i=1; i<n; i++) {
			 maxSum = Math.max(maxSum+arr[i], arr[i]);
			 res=Math.max(maxSum, res);
		 }
		 
		 return res;
	 }

	    public static void main(String args[]) 
	    { 
	       int arr[] = {5, -2, 3, 4}, n = 4;

	       System.out.println("Naive max cirxular array sum is " +naiveMaxCircularSum(arr, n));
	       
	       System.out.println("Max circular subarray sum by efficient method is "+maxCircularSum(arr));

	    } 
}

package arrays;

public class MaximumCircularSubArraySum {

	/**
	 * This is Naive solution

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
	    			int index = (i + j) % n;

	    			curr_sum += arr[index];

	    			curr_max = Math.max(curr_max, curr_sum);
	    		}

	    		res = Math.max(res, curr_max);
	    	}
	    	return res;
	    }
	 

	    public static void main(String args[]) 
	    { 
	       int arr[] = {5, -2, 3, 4}, n = 4;

	       System.out.println(naiveMaxCircularSum(arr, n));

	    } 
}

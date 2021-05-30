package arrays;

/**
 * -	Given an array of stock prices per day.
 * -	We have to find the maximum profit that it can make. 
 * -	We have to buy the stock when it hits the bottom. Sell it when it reaches peak. This will maximise profit.
 * 
 * @author Piyush Dangre
 *
 */
public class StockBuyAndSellProblem {

	/**
	 * - 	Start traversing from the left
	 * -	Check if the stock price is increasing, if yes, then calculate the profit and add it to profit value.
	 * -	If the stock price is decreasing then do nothing.
	 * -	In the end, return the profit price.
	 * @param arr
	 * @return
	 */
	public static int buySellStock(int arr[]) {
		int profit = 0 ;
		int n = arr.length ;
		for(int i = 1 ; i < n ; i++) {
			if(arr[i] > arr[i-1]) {
				profit = profit + (arr[i] - arr[i-1]);
			}
		}
		return profit;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,5,2,7,3,8,3,9};
		int profit = buySellStock(arr);
		System.out.println("Maximum profit is "+ profit);
	}
}

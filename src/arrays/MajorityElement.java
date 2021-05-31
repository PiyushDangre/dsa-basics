package arrays;

/**
 * - Given an array of integers, find out the element which is in majority.
 * - By majority we mean element that occurs more than n/2 time where n is size of array.
 * @author Piyush Dangre
 *
 */
public class MajorityElement {

	/**
	 * This is naive solution requires O(n^2) complexity.
	 * Loop through each element.
	 * @param arr
	 * @return
	 */
	public static int naiveSolution(int arr[]) {
		int n = arr.length;
		int res = -1 ;
		
		// loop through
		for(int i=0; i<n;i++) {
			int count = 0;
			int majorityElement = -1 ;
			for(int j=0;j<n; j++) {
				if(arr[i] == arr[j]) {
					count++;
					majorityElement = arr[j];
				}
			}
			
			if(count > n/2) {
				res = majorityElement;
				break;
			}
		}
		
		return res;
	}
	
	/**
	 * - This solution uses Moore's Voting algorithm.
	 * - Better explanation can be found at following YouTube video
	 * - https://www.youtube.com/watch?v=n5QY3x_GNDg
	 * 
	 * - In this algorithm , what we are doing basically is cancelling the non matching elements by matching elements.
	 * - Doing this in the end givesus the remaining majority element.
	 * - We maintain two pointers - majorityElement and count
	 * - We traverse from left and assume count to be one and the first element as majority element.
	 * - Then for each matching element we increment count by 1.
	 * - if element is non matching, then decrement count byb 1.
	 * - if count becomes 0 then reset values of majorityElement and count.
	 * 
	 * - In the later part of this solution we need to find whether the element is actual majority or not by comparing with n/2.
	 * @param arr
	 * @return
	 */
	public static int majorityElement(int arr[]) {
		int n = arr.length ;
		int count = 1 ;
		int majorityElement = arr[0];
		
		for(int i=1; i<n;i++) {
			if(arr[i] == majorityElement) {
				count++;
			}else {
				count-- ;
			}
			
			if(count == 0) {
				count = 1;
				majorityElement = arr[i];
			}
		}
		
		// 2nd part of solu[tion only to verify if the element is actual majority
		int actualCount = 0 ;
		for(int i=0; i<n; i++) {
			if(arr[i] == majorityElement) {
				actualCount++;
			}
		}
		
		// if element not majority, then return -1
		if(actualCount <= n/2) {
			majorityElement = -1; 
		}
		
		return majorityElement;
	}
	
	public static void main(String args[]) {
		int arr[] = {8,7,6,8,6,6,6};
		System.out.println("Majority element by naive method is "+naiveSolution(arr));
		System.out.println("Majority element using Moore's voting algorithm is "+ majorityElement(arr));
	}
}

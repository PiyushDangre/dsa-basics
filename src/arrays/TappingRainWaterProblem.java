package arrays;

/**
 * - The problem statement is to calculate the amount of water that is getting stored between the pillars with unit of length equal to each element in the array.
 * - Each element value represents the height of the pillar in units.
 * - The first most and last most elements will not store any water as it will flow away.
 * - The middle elements between first and last element will be able to save water.
 * - For each element, we will have to calculate the left max and right max element.
 * - The water saved by each element will be min(lmax, rmax) - (element)
 *
 * @author Piyush Dangre
 *
 */
public class TappingRainWaterProblem {

	public static int calculateTapWater(int arr[]) {
		int res = 0 ;
		int n = arr.length;
		
		// Define two new arrays to store left max and right max of corresponding index element. 
		int lmax[] = new int[n];
		int rmax[] = new int[n];
		
		lmax[0] = arr[0] ;
		for(int i=1; i<=n-1; i++) {
			lmax[i]=Math.max(arr[i], arr[i-1]);
		}
		
		rmax[n-1] = arr[n-1];
		for(int i=n-2;i>=0;i--) {
			rmax[i]=Math.max(arr[i], arr[i+1]);
		}
		
		for(int i=1; i<n-1;i++ ) {
			res = res + (Math.min(lmax[i], rmax[i]) - arr[i]);
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		int arr[] = {5,0,6,2,3} ;
		int res = calculateTapWater(arr);
		System.out.println("The stored tap water is "+res+" units.");
		
	}
}

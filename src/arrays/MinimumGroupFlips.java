package arrays;

public class MinimumGroupFlips {

	public static void mySolution(int arr[]) {
		
		
		int n = arr.length;
		int count_ones = 0 ; 
		int count_zeroes = 0 ;
		int currElement = arr[0];
		
		if(currElement == 0) {
			count_zeroes =  1;
		}else {
			count_ones = 1;
		}
		
		for(int i=1; i<n; i++) {
			if(arr[i] != currElement) {
				if(arr[i] == 0) {
					count_zeroes++;
				}else {
					count_ones++;
				}
				currElement = arr[i];
			}
		}
	
		System.out.println("1 groups are "+ count_ones);
		System.out.println("0 groups are "+ count_zeroes);
		
		if(count_ones < count_zeroes) {
			for(int i=0; i<n;i++) {
				if(arr[i] == 1) {
					System.out.println("Change index "+i);
				}
			}
		}
		
		if(count_ones > count_zeroes) {
			for(int i=0; i<n;i++) {
				if(arr[i] == 0) {
					System.out.println("Change index "+i);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// let array
		int arr[] = {1,1,0,0,0,1,1,0,0,1,1,1};
		mySolution(arr);
		
	}
}

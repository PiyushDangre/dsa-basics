package basicMaths;

public class DivisorsOfNumber {
	
	public static void main(String[] args) {
		System.out.println("---- Naive Solution");
		findDivisors(546932);
		System.out.println("---- Efficient Solution");
		findDivisorsNotInOrder(100);
	}
	
	/**
	 * Naive solution. Check each number till n.
	 * @param n
	 */
	public static void findDivisors(int n) {		
		for(int i = 1 ; i <= n ; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
	}
	
	/**
	 * Efficient Solution.
	 * -- Divisors always come in pairs
	 * -- One of the divisor in the pair is always less than the sqrt(n)
	 * -- Complexity  is 0(sqrt(n))
	 * @param n
	 */
	public static void findDivisorsNotInOrder(int n) {
		
		for(int i = 1 ; i * i <= n ; i++) {
			if(n % i == 0) {
				System.out.println(i);
				
				if(i != n/i) {
					System.out.println(n/i);
				}
			}
		
		}
	}
	
}

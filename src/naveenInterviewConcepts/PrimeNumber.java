package naveenInterviewConcepts;

public class PrimeNumber {
	
	// 2 is the lowest prime number
	
	// num = 20 -- print the prime numbers from 1 - 20
	
	public static boolean isPrimeNum(int num) {
		
		//edge/corner check
		
		if(num<=1) {
			return false;
		}
		
		for(int i =2; i <num ; i++) {
			if(num % i ==0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void getPrimeNumbers(int num) {
		System.out.println("Prime number upto num " +num);
		for(int i = 2; i<num ;i++) {
			if(isPrimeNum(i)) {
				System.out.println( i + "  ");
			}
		}
	}

	public static void main(String[] args) {
		
	System.out.println(isPrimeNum(2));
	System.out.println(isPrimeNum(4));
	System.out.println(isPrimeNum(3));
	System.out.println(isPrimeNum(5));
	System.out.println(isPrimeNum(9));
	System.out.println(isPrimeNum(0));
	System.out.println(isPrimeNum(-1));
	System.out.println(isPrimeNum(1));
	System.out.println(isPrimeNum(-4));
	
	System.out.println("****************");
	
	getPrimeNumbers(20);
	
	
	
	}

}

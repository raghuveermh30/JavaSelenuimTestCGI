package naveenInterviewConcepts;

public class ReverseTheInteger {

	public static void main(String[] args) {
		
		long num = 12345;
		long rev = 0;
		
		//Using proper algorithm
		while(num!=0) {
		rev =	rev * 10 + num % 10;
		num = num/10;
			
		
		}
		
		System.out.println("Reverse number is :" +rev);
		
		//Using String Buffer
		int num1 = 1234;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}

}
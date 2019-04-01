package naveenInterviewConcepts;

public class PalindromeNumber {
	
	public static void isPalindromeNum(int num) {
		
		System.out.println("Given num is : " +num);
		
		int r =0;
		int sum =0;
		int temp;
		
		temp = num;
		
		while(num>0) {
			r =num%10; //get the remainder of the number
			sum = (sum*10)+r;
			num = num/10;
		}
		
		if(temp == sum) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not a palindrome");
		}
		
	}

	public static void main(String[] args) {
		
		isPalindromeNum(151);
		isPalindromeNum(111);
		isPalindromeNum(121);
		isPalindromeNum(110);
		isPalindromeNum(0);

	}

}

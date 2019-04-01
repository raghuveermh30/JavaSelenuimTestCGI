package naveenInterviewConcepts;

public class StringPalindrome {

	public static void isPalindrome(String inputString) {
		
		System.out.println("The input String is " + inputString);
		
		String b = "";
		
		int n = inputString.length();
		
			for(int i=n-1;i>=0;i--) {
				b = b+inputString.charAt(i);
			}
			
			if(inputString.equalsIgnoreCase(b)) {
				System.out.println("The Entered string is Palindrome");
			}
			else {
				System.out.println("The Entered String is not Palindrome");
			}
			
	}
	
	public static void main(String[] args) {
		
		isPalindrome("Teet");
		isPalindrome("Raghu");
		isPalindrome("Java");
		isPalindrome("Selenuim");
		isPalindrome("NeveroddorEVen");
		
	}

}

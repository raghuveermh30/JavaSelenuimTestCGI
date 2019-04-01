package naveenInterviewConcepts;

import java.util.Scanner;

public class SwapStringsWithOutTemp {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first String");
		String s1 = sc.next();
		
		System.out.println("Enter the second String");
		String s2 = sc.next();
		
		System.out.println("Before swapping  :");
		
		System.out.println("s1 : " +s1);
		System.out.println("s2 : "+s2);
		
		//swapping logic
		
		s1 = s1+s2;
		
		s2 = s1.substring(0, (s1.length()-s2.length()));
		
		s1 = s1.substring(s2.length());
		
		System.out.println("****************");
		System.out.println("After swapping : ");
		System.out.println("s1 : " +s1);
		System.out.println("s2 : " +s2);
		
		
	}
}

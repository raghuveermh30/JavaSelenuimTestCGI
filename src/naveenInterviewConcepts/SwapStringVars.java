package naveenInterviewConcepts;

public class SwapStringVars {

	public static void main(String[] args) {

		String a = "Java";
		String b = "Selenuim";
				
		System.out.println("Before swapping  :");
		System.out.println("The value of A is : "+a);
		System.out.println("The value of B is : "+b);
		
		//First method using subString
		
		//1. append
		/*
		a =a+b;// JavaSelenuim
		//2 store initial string a in string b
		
		b =a.substring(0, (a.length()-b.length()));
		
		//3. store initial String b in String a
		a = a.substring(b.length());*/
		
		System.out.println("After swapping  :");
		System.out.println("The value of A is : "+a);
		System.out.println("The value of B is : "+b);
		
		System.out.println("*******");
		
		
		
		
		
		
		
		
		
	}

}

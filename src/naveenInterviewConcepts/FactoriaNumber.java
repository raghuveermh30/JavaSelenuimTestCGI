package naveenInterviewConcepts;

public class FactoriaNumber {

	//1. Without recursive  -- using Simple For loop
	public static int isFactorial(int num) {
		System.out.println("The Eneterd Number is : " +num);
		
		int fact =1;
		
		if(num ==0) {
			return 1;
		}
		for(int i=1; i<=num;i++) {
			fact = fact*i;
		}
		System.out.println("The factorial  for the entered number "+fact);
		return fact;
		
		
		
		
	}
	
	//2 . Recursive function -- A function is calling itself
	
	public static int fact(int num) {
		if(num ==0) {
			return 1;
		}
		
		else{
			return(num* fact(num-1));
		}
		
		
	}
	public static void main(String[] args) {
		
		isFactorial(4);	
		System.out.println(isFactorial(0));	
		System.out.println(fact(5));
		System.out.println(fact(4));
		System.out.println(fact(10));
		System.out.println(fact(3));
		System.out.println(fact(1));
		System.out.println(fact(0));
		
		

	}

}

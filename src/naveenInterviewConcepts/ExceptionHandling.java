package naveenInterviewConcepts;

public class ExceptionHandling {
	/*int a = 10;
	static ExceptionHandling obj;*/
	public static void main(String[] args) {
		
		

		//Uncautght Exception
		/*int  i = 9/0;
		System.out.println(i);*/
		
		//Caught Exception -- JVM will get to know that this is the caught exception
		//Thread.sleep(3000L);

		
		
	//	obj = null;
		//System.out.println(obj.a);
		
		//1.try - catch block
		// It is used to handle the exception 
		//it is also used to reporting the Exception
		
		try {
			int i=9/0; //this code will throw an exception
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Hey -- divided by zero");
		}
		
		
			System.out.println("AC");
			System.out.println("AC");
			System.out.println("AC");
	}

}

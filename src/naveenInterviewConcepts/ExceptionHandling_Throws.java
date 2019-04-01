package naveenInterviewConcepts;

public class ExceptionHandling_Throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Throws keyword is also used to handle the exception
		// It won't report anything like Try catch
		// Throws keyword is always used when we have method chaining
		
		ExceptionHandling_Throws obj = new ExceptionHandling_Throws();
		obj.sum();
		
		//here main method is also throwing the exception while running the program, JVM will catch this exception
		
		// The execution of the program  will terminate
		
		//Here We cannot create the Report, JVM will give reports in the form of Exception names
		
		System.out.println("HEllo");
	}
	
	
	public void sum() {
		try{
			div(); //here sum method is catching the exception 
		}
		catch(Throwable e) { // Throwable is the child of Object class
			e.printStackTrace();
		}
	}

public void div() throws ArithmeticException{
	int i = 9/0;	// Exception is here
	System.out.println(i);
	
	}
	
}

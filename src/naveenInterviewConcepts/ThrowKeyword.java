package naveenInterviewConcepts;

public class ThrowKeyword {

	public static void main(String[] args)  {
		
		// Throw keyword is used to throw an exception delibratley
		// we can create our own exception using throw keyword
		// throw keyword always souronded with Try-Catch Block
		
		
		System.out.println("ABC");
		
		try {
			throw new Exception("Raghu Exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		System.out.println("PQR");
		
		String Exec_Flag = " ";
		if(Exec_Flag.equals(" ")) {
			try {
				throw new Exception("Exec flag  is Blank Exception");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Test");
		

	}

}

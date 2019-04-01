package naveenInterviewConcepts;

public class ReverseTheString {

	public static void main(String[] args) {
		
		String s = "Selenuim";
		
		int len = s.length();//8
		
		String rev = "";
		
		// Using for loop
		
		for(int i=len-1;i>=0;i--) {
			rev = rev+s.charAt(i); //miuneleS
		}
		
		System.out.println(rev);
		
		
		//using StringBuffer class
		
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
	}
	
	

}

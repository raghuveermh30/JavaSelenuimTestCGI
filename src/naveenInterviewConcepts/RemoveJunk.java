package naveenInterviewConcepts;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s = "*&*^&^& latin String 0123455";
		
		//Regular Expression = [^a-zA-Z0-9]

		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}

package naveenInterviewConcepts;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "The rains has started here";
		String str1 = "The rains haS started here";
		
		//Length of the string
		
		System.out.println("Length of  the string-->" +str.length());
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('s')); //first occurance
		
		//to check the second S index
		
		System.out.println(str.indexOf('s',str.indexOf('s')+1));
		
		// third occurance of S
		
		
		System.out.println(str.indexOf('s',13));
		
		System.out.println(str.indexOf("has"));
		
		System.out.println(str.indexOf("hello")); //-1
		
		//String comparasion
		
		System.out.println(str.equals(str1)); //case senstive
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		//subString
		
		System.out.println(str.substring(0, 9));
		
		//trim
		
		String  s = "  Hello  World  ";
		System.out.println(s.trim());
		System.out.println(s.replace(" ", ""));
		
		/*//split
		
		String s1 = "Hello_World_Test_Selenuim";
		String s2[] =s1.split("_");
		
		for(int i=0;i<s2.length;i++) {
			System.out.print(s2[i]);
		}
		*/
		
		
		String x = "Java";
		String y = "selenuim";
		int a = 100;
		int b = 200;
		
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		
		
		
	String i =Integer.toString(a);
	System.out.println(i);
		
		
	}

}

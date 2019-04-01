package test;

public class MethodOverloadingTest {

	public static void main(String[] args) {
		m(null);
	}
	
	public static void m(String s) {
		System.out.println("String version");
	}
	
	public static void m(Object o) {
		System.out.println("Object");
	}

	
	
}

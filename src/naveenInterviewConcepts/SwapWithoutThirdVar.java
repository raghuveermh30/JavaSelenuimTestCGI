package naveenInterviewConcepts;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int x = 10;
		int y =20;
		
		int t;
		*/
	/*	//1. Using third variable
		t=x;
		x=y;
		y=t;
		
		System.out.println("After swapping vale of x is :" +x);
		System.out.println("After swapping value of y is : " +y);
		*/
		System.out.println("***************");
		
		//2. Without using third variable
		
	/*	x = x+y;
		y = x-y;
		x= x-y;
		
		System.out.println("After swapping vale of x is :" +x);
		System.out.println("After swapping value of y is : " +y);
		*/
		//3. one more solution
		
		System.out.println("******");
		
	/*	x = x*y;
		y = x/y;
		x = x/y;
		
		System.out.println("After swapping x : " +x);
		System.out.println("After swapping y : " +y);*/
		
		//4. Using XOR opertaion
		
		int x = 5; //0101
		
		int y = 10; //1010
		
		x =x^y;
		y = x^y;
		x = x^y;
		
		
		
		System.out.println("After swapping x : " +x);
		System.out.println("After swapping y : " +y);
		
		
		
		
	}

}

package naveenInterviewConcepts;

public class ArmStrongNumber {

	//ArmStrong Number
	//153
	// 1*1*1 =1
	//5*5*5 = 125
	//3*3*3 = 27
	// 1 +125 +27 = 153
	
	//407
	//1 == 1*1*1 = 1
	//0
	//370,371
	
	public static void isArmStrongNumber(int num) {
		
		System.out.println("The Entered Number is : " +num);
		int cube = 0;
		int rem;
		int temp;
		
		temp = num;
		
		while(num>0) {
			rem = num%10;
			num = num/10;
			cube = cube+(rem*rem*rem);
		}
		
		if(temp == cube) {
			System.out.println("The Entered number is ArmStrong Number " );
		}
		else {
			System.out.println("The Entered Number is not an ArmStrong Number");
		}
	}
	
	
	public static void main(String[] args) {
		
		isArmStrongNumber(153);
		isArmStrongNumber(407);
		isArmStrongNumber(0);
		isArmStrongNumber(370);
		isArmStrongNumber(371);
		isArmStrongNumber(121);

	}

}

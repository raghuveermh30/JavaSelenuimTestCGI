package naveenInterviewConcepts;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		//int a[] = {1,2,3,4,5,7,8};
		
		int a[] = {-1,1,2,3,4,5,6};//j=-1
		
		//1+2+4+5 = 12
		//1+2+3+4+5 = 13
		//15-12 = 3 --Missing Number
		
		//22
		//28
		//28-22 = 6 --missing number
		
		int sum = 0;
		
		for(int i=0; i<a.length;i++) {
			sum = sum+a[i];
		}
		
		System.out.println(sum);


		int sum1=0;
		
		for(int j=-1;j<=6;j++) {
			sum1= sum1+j;
		}
		
		System.out.println(sum1);
		
		System.out.println("Missing number is " +(sum1-sum));
	}
	
	
	

}

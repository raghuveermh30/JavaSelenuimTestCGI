package naveenInterviewConcepts;

import java.util.Arrays;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
		
		
		// int numbers[] =  {10, 20, 24, 5, 6, 8};
		
		int numbers[] = {-10,5};
		 
		 for(int i = 0;i<numbers.length;i++) {
				System.out.println(numbers[i]);
			}
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest = numbers[i];
			
			}
			
			else if(numbers[i] <=smallest) {
				 smallest =numbers[i] ;
			}
		}
		
		
		
		
		System.out.println("Largest number is" +largest);
		System.out.println("smallest number is" +smallest);
		
	}

}

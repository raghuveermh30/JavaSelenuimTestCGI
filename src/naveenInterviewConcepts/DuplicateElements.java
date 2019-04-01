package naveenInterviewConcepts;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {
	
	//for the clear explaination of the logics check StringIMutable document

	public static void main(String[] args) {
		
		String names[] = {"java","javascript","C","Ruby","java","C"};
		
		//compare each element
		// for for loop the time complexity is O(n*n) == Time complexity will be higher i.e o(n^2)
		
		for(int i=0;i<names.length;i++) {
			for(int j=i+1; j<names.length;j++) {
				
				if(names[i].equals(names[j])) {
					System.out.println("Duplicates are in the String --->" +names[i]);
				}
			}
		}
		
		System.out.println("**************");
		
		//Using HashSet :: Java collections
		//It stores the unique value -- O(n)
		
		
		
			Set<String> store = new HashSet<String>();
			for(String name : names) {
				if(store.add(name) == false) {
					System.out.println("Duplicates are in the String -->" +name);
				}
			}
			
			System.out.println("***************");
			
		//Using HashMap O(2n)
			
			Map<String, Integer> map = new HashMap<String, Integer>();
			
			for(String name : names) {
				Integer count =map.get(name);
				if(count ==null) {
					map.put(name, 1);
				}
				else {
					map.put(name, ++count);
				}
			}
			
			//get the values from the Hashmap
			
		Set<Entry<String, Integer>> entrySet = 	map.entrySet();
		
		for(Entry<String,Integer> entry :entrySet) {
			if(entry.getValue()>1) {
				System.out.println("Duplicates are in the string" +entry.getKey());
			}
		}
			
			
	}

}

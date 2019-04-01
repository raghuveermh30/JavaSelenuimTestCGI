/**
 * 
 */
package test;

import java.util.ArrayList;

/**
 * @author raghuveer.mh
 *
 */
public class CollecArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList ar1 = new ArrayList();
		ar1.add(100);
		ar1.add("true");
		
		for(int i =0; i<ar1.size(); i++) {
			
		System.out.println(ar1.get(i));
		
		}
		
		
	}

}

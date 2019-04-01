package com.dataDrivenTest;

import com.qa.ExcelUtility.Xls_Reader;

public class Snippet {
	
	public static void main(String args[]) {
		
	
	Xls_Reader reader = new Xls_Reader("C:\\Users\\raghuveer.mh\\eclipse-workspace\\Java_test\\src\\com\\testdata\\HalfEbayTestData.xlsx");
	
			String firstName = reader.getCellData("RegTestData", "firstname", 2);
			System.out.println(firstName);
}
}

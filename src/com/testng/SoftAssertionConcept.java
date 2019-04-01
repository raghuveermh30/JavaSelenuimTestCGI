/**
 * 
 */
package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



/**
 * @author raghuveer.mh
 *
 */
public class SoftAssertionConcept {
	
	
	/*Hard Assertion/Hard validation is getting failed -- immideiatly the test case will marked as failed and the test case will be terminated
	Soft Assertion/Soft validation is getting failed --test case will not marked as Passed as well as test case next lines will be executed
	assertAll()-- to mark the test case as failed if any soft assertion is getting failed*/
	
	@Test
	public void test() {
		
		SoftAssert softAsert = new SoftAssert();
		
		System.out.println("Open browser");
		System.out.println("enter the url");
		System.out.println("enter user name");
		System.out.println("enter password");
		System.out.println("click on submit");
		System.out.println("validate home page");
		softAsert.assertEquals(true, false, "Home page title is missing");
		System.out.println("navigate to deals page");
		System.out.println("create the new deal");
		//Assert.assertEquals(true, false);  Hard Assertions
		
		softAsert.assertEquals(true, false, "Not able to create the deal");
		System.out.println("Navigate to contact pgae");
		System.out.println("cretae the new contact");
		softAsert.assertEquals(true, false,"Not able to create the contact");
		softAsert.assertAll();
	}

}

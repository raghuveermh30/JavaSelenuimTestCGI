package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/**
 * @author raghuveer.mh
 * 
 * 
 * Steup system properties chrome
Launch chrome browser
Login to app
enter url
google title page
logout from app
close browser
delete all cookies
 *
 */


								/*@BeforeMethod		
								@Test -1
								@AfterMethod
								
								
								@BeforeMethod
								@Test -2
								@AfterMethod
								
								@BeforeMethod
								@Test -3
								@AfterMethod*/


/*-- Sequence of Annotations execution
 * 
 * @BeforeSuite ---Setup system properties chrome
@BeforeTest--Launch chrome browser
@BeforeClass--Login to app
@BeforeMethod --enter url
@Test--google Logo Test case
@AfterMethod--logout from app
@BeforeMethod --enter url
@Test---google title page
@AfterMethod--logout from app
@BeforeMethod --enter url
@Test --Search  case
@AfterMethod--logout from app
@AfterClass--close browser
@AfterTest---delete all cookies
@AfterSuire -- Generate the reports

*
*/
public class TestNGBasics {
	
	// Pre conditions-- annotations are starting as Before
	@BeforeSuite
	public void setUp() {  //1
		System.out.println("@BeforeSuite ---Setup system properties chrome");
	}
	
	@BeforeTest
	public void launchBrow() { //2
		System.out.println("@BeforeTest--Launch chrome browser");
	}
	
	@BeforeClass
	public void login() { //3
		System.out.println("@BeforeClass--Login to app");
	}
	
	@BeforeMethod()
	public void enterUrl() //4
	{
		System.out.println("@BeforeMethod --enter url");
	}
	
	
	
	//Test case -- starting with @Test
	@Test
	public void googleTitle() { //5
		System.out.println("@Test---google title page");
	}
	
	@Test
	
	public void searchTest() {
		System.out.println("@Test --Search  case");
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("@Test--google Logo Test case");
	}
	
	//Post Conditions -- Starting with @After
	@AfterMethod
	public void logout() { //6
		System.out.println("@AfterMethod--logout from app");
	}
	
	
	
	@AfterClass
	public void closeBrowser() { //7
		System.out.println("@AfterClass--close browser");
	}
	
	@AfterTest
	public void deleteAllCookies() { //8
		System.out.println("@AfterTest---delete all cookies");
	}
	
	
	@AfterSuite
	public void generateTestReport() { //9
		System.out.println("@AfterSuite--Generate test Reports");
	}
	
	
}

package naveenSessions;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTestClass {
	
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		SingletonInSelenuim instanceDriver =	SingletonInSelenuim.getInstance();
		instanceDriver.openBrowser();
	}
	
	
	@Test
	public void test() {
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

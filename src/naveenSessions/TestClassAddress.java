/**
 * 
 */
package naveenSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import test2.AdressPage;
import test2.LoginPage;

/**
 * @author raghuveer.mh
 *
 */

public class TestClassAddress {
	
	WebDriver driver;
	
	@Test
	public void test() {
		
		LoginPage login = new LoginPage(driver);
		login.login();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		login.clickSignUp();
		driver.manage().timeouts().implicitlyWait(40L, TimeUnit.SECONDS);
		
		AdressPage addressPage = new AdressPage(driver);
		addressPage.goToAddress();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		addressPage.clickOnNewAddress();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		addressPage.updateMandatoryFileds();
		addressPage.createAddress(driver);
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		addressPage.goToAddress();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		addressPage.clickDestroy();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		addressPage.handleAlert();
		
	}
	
	@BeforeTest
	  public void beforeTest() {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://a.testaddressbook.com/sign_up");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
	  }

	@AfterTest
	
	public void signOut() {
		AdressPage addressPage = new AdressPage(driver);
		addressPage.signOut();
		
		
	}

}




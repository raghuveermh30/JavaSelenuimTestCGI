/**
 * 
 */
package test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

/**
 * @author raghuveer.mh
 *
 */
public class LoginPage extends LoginUIMap{
	
	LoginUIMap locators = new LoginUIMap();
	
	
	public LoginPage(WebDriver driverA) {
		driver = driverA;
		
	}
	
	public void login() {
		locators.email(driver).sendKeys("raghuveermh30@gmail.com");
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
		locators.password(driver).sendKeys("admin");
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
		
	}
	
	public void clickSignUp() {
		locators.signUp(driver).click();
	}
	
	public void clickSignIn() {
		locators.signIn(driver).click();
	}
	

}

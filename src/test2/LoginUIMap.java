/**
 * 
 */
package test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author raghuveer.mh
 *
 */
public class LoginUIMap {
	
	public WebDriver driver;
	
	public static WebElement element;
	
	
	public WebElement email(WebDriver driver) {
	
		element = driver.findElement(By.xpath("//div[@class = 'form-group row']/input[@type = 'email']"));
		return element;
	}
	
	public WebElement password(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class = 'form-group row']/input[@placeholder = 'Password']"));
		return element;
	}
	
	public WebElement signUp(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class = 'form-group row']/input[@value= 'Sign up']"));
		return element;
	}
	
	public WebElement signIn(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class = 'form-group row']/input[@value= 'Sign in']"));
		return element;
	}

}

/**
 * 
 */
package test2;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author raghuveer.mh
 *
 */
public class AdressUIMap {
	
	public WebDriver driver;
	
	public static WebElement element;
	
	public WebElement adressLink(WebDriver driver) {
		element = driver.findElement(By.linkText("Addresses"));
		return element;	
	}
	
	public WebElement newAddress(WebDriver driver) {
		element = driver.findElement(By.linkText("New Address"));
		return element;
	}
	
	public WebElement firstName(WebDriver driver) {
		element = driver.findElement(By.id("address_first_name"));
		return element;
	}
	
	public WebElement lastName(WebDriver driver) {
		element = driver.findElement(By.id("address_last_name"));
		return element;
	}
	
	public WebElement address1(WebDriver driver) {
		element = driver.findElement(By.id("address_street_address"));
		return element;
	}
	
	public WebElement address2(WebDriver driver) {
		element = driver.findElement(By.id("address_secondary_address"));
		return element;
	}
	
	public WebElement city(WebDriver driver) {
		element = driver.findElement(By.id("address_city"));
		return element;
	}
	
	public WebElement state(WebDriver driver) {
		element = driver.findElement(By.id("address_state"));
		Select sel = new Select(element);
		sel.selectByVisibleText("Kentucky");
		return element;
	}
	
	public WebElement zipCode(WebDriver driver) {
		element = driver.findElement(By.id("address_zip_code"));
		return element;
	}
	
	public WebElement country(WebDriver driver) {
		element = driver.findElement(By.id("address_country_false"));
		return element;
	}
	
	public WebElement birthDay (WebDriver driver) {
		element = driver.findElement(By.id("address_birthday"));
		return element;
	}
	
	public WebElement age(WebDriver driver) {
		element = driver.findElement(By.id("address_age"));
		return element;
	}
	
	public WebElement website(WebDriver driver) {
		element = driver.findElement(By.id("address_website"));
		return element;
	}
	
	public WebElement uploadPhoto(WebDriver driver) {
		driver.findElement(By.id("address_picture")).sendKeys("C:\\Users\\raghuveer.mh\\Desktop\\profile pic.jpg");
		return element;
		
	}
	
	public WebElement phone(WebDriver driver) {
		element = driver.findElement(By.id("address_phone"));
		return element;
	}

	public WebElement commonIntrest(WebDriver driver) {
		element = driver.findElement(By.id("address_interest_read"));
		element.click();
		return element;
	}
	
	public WebElement note (WebDriver driver) {
		element = driver.findElement(By.id("address_note"));
		return element;
	}
	
	public WebElement createAddress(WebDriver driver) {
		element = driver.findElement(By.name("commit"));
		return element;
	}
	
	public WebElement validateMsg(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class = 'alert alert-notice' and contains(text(), 'Address was successfully created.')]"));
		return element;
	}
	
	public WebElement signOut(WebDriver driver) {
		element = driver.findElement(By.linkText("Sign out"));
		return element;
	}
	
	public WebElement destroy(WebDriver driver) {
		element = driver.findElement(By.linkText("Destroy"));
		return element;
	}
}

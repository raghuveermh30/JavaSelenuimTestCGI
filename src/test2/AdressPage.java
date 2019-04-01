/**
 * 
 */
package test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

/**
 * @author raghuveer.mh
 *
 */
public class AdressPage extends AdressUIMap{
	
	public AdressPage(WebDriver driverB) {
		driver = driverB;
	}
	
	AdressUIMap loc2 = new AdressUIMap();
	
	public void updateMandatoryFileds() {
		
		loc2.firstName(driver).sendKeys("sfsdsad");
		loc2.lastName(driver).sendKeys("sdsds");
		loc2.address1(driver).sendKeys("gfdgdf");
		loc2.address2(driver).sendKeys("jkjkjkj");
		loc2.city(driver).sendKeys("jkjkjk");
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		loc2.state(driver);
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		loc2.zipCode(driver).sendKeys("65769");
		loc2.country(driver).click();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		loc2.birthDay(driver).sendKeys("30091995");
		loc2.age(driver).sendKeys("23");
		loc2.website(driver).sendKeys("http://www.amazon.in");
		loc2.uploadPhoto(driver).sendKeys("C:\\Users\\raghuveer.mh\\Desktop\\profile pic.jpg");
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		loc2.commonIntrest(driver).click();
		loc2.note(driver).sendKeys("djncdjnd");
		
		
			
	}
	
	public void checkValidationMsg() {
		loc2.validateMsg(driver).isDisplayed();
	}
	
	public void goToAddress() {
		loc2.adressLink(driver).click();
	}
	
	public void clickDestroy() {
		loc2.destroy(driver).click();
	}
	
	public void handleAlert()
	{
		Alert alert = driver.switchTo().alert();
		alert.accept();	
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
	}
	
	public void signOut() {
		loc2.signOut(driver).click();
		
	}
	
	public void clickOnNewAddress() {
		loc2.newAddress(driver).click();
	}
	
	public void clickOnCreateAddress() {
		loc2.createAddress(driver).click();
	}
	
	

}

package naveenSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		/*
		 Concept : we are explictly waiting for the specific element
		 Page is fully loaded but not all the elements are not loaded some elements are still pending
		 we are giving for the specific element not for all the element on the basis for the condition
		 
		 It will work for all buttons, checkboxes and links
		 
	*/
		
		clickOn(driver, driver.findElement(By.id("u_0_3")), 10);
	}
	
	public static void clickOn(WebDriver driver, WebElement locator , int timeOut) {
		new WebDriverWait(driver, timeOut).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}

}

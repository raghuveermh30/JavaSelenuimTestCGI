package naveenInterviewConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronisationInSelenuim {

	public static void main(String[] args) {
		
		


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		 
		 driver.get("http://www.flipkart.com");
		 driver.manage().window().maximize();
		 
		 WebElement email =	 driver.findElement(By.name("email"));
		 WebElement password = driver.findElement(By.id("pass"));
		 
		 sendKeys(driver, email, 30L, "2345678");
		 sendKeys(driver, password, 30L, "dsdsd");
		  

	}

	public static void sendKeys(WebDriver driver, WebElement ele, long timeout, String value) {
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys(value);
	}
}

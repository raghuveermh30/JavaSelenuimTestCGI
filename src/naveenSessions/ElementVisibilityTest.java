package naveenSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/register/");
		driver.manage().window().maximize();
		Thread.sleep(3000L);
		
		//1. isDisplayed() method -- this is applicable to all
		Boolean b1 =driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(b1);
		Thread.sleep(3000L);

		
		//2. isEnabled
		Boolean b2 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b2);
		Thread.sleep(3000L);
		
		//select the checkbox
		driver.findElement(By.name("agreeTerms")).click();
		Thread.sleep(3000L);
		
		
		
		Boolean b3 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b3);
		Thread.sleep(3000L);
		
		
		//3. isSelected()-- This is only applicable for checkBox, radio button, dropdown
		Boolean b4 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b4);
		Thread.sleep(3000L);
		Boolean b5 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(b5);
		Thread.sleep(2000L);
		
	
		driver.close();
		

	}

}

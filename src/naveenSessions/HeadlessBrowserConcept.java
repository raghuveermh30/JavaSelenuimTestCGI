package naveenSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowserConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
	//	WebDriver	driver = new ChromeDriver();
		
		//Htmlunitdriver is not part of selenuim 3.x, to use this concept we have to download the  HTML Unit driver jar file
		// there is no browser launching. 
		// In 2.53 it was the part of the selenuim jar
		
	/*	// This is also called GHOST driver or HEADLESS Browser. 
		Headless Browsers
	1. HTMLUnitDriver-java
	2. Phantam JS -javascript
		*/
		//Advantages
		//1. Testing is happening behind the screen--No browser launching
		//2. Execution of the test case is very fast--Performnace is high
		
		/*Limitations
		1. Not suitable for user actions- mouse movements, double click, drag and drop
		
		*/
		WebDriver driver = new HtmlUnitDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
		
		
		
		driver.get("https://www.freecrm.com/index.html?e=1");
		driver.manage().window().maximize();
		Thread.sleep(3000L);
		System.out.println("Before login" +driver.getTitle());
		driver.findElement(By.name("username")).sendKeys("raghuveermh30");
		driver.findElement(By.name("password")).sendKeys("R@ghumh3017");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		Thread.sleep(3000L);
		System.out.println("After login" +driver.getTitle());
		
		driver.close();
		

	}

}

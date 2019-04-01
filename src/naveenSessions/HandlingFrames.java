/**
 * 
 */
package naveenSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author raghuveer.mh
 *
 */
public class HandlingFrames {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html?e=1");
		driver.manage().window().maximize();
		Thread.sleep(3000L);
		driver.findElement(By.name("username")).sendKeys("raghuveermh30");
		driver.findElement(By.name("password")).sendKeys("R@ghumh3017");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		Thread.sleep(3000L);
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]")).click();
		
		
		
		driver.close();
		

	}

}

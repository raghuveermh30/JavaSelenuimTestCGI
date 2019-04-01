package naveenSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicWebTables {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/index.html?e=1");
		driver.manage().window().maximize();
		Thread.sleep(3000L);
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		//driver.findElement(By.name("password")).sendKeys("R@ghumhdfds");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		Thread.sleep(4000L);
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]")).click();
		Thread.sleep(3000L);
		
		//Method 1
		
		String before_xpath = "//*[@id=\"vContactsForm\"]/table/tbody/tr[";
		String after_xpath = "]/td[1]/input";
		
		String CheckBox = "//*[@id=\"vContactsForm\"]/table/tbody/tr[6]/td[1]/input"; //for 3 red row
		
		
		
		//Method 2 
		//a[contains(text(), 'fasdasd dasdas')]//parent::td//preceding-sibling::td//input[@name = 'contact_id']--for checkbox
		//a[contains(text(), 'ereeded xsaxa')]//parent::td//a[@_name = 'ereeded xsaxa'] -- for fetching the row details
		
		
		
	}

}

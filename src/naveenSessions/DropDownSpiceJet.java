package naveenSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownSpiceJet {

	public static void main(String[] args) {



		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		List<WebElement> dropdown = driver.findElements(By.id("gh-cat-box"));
		System.out.println("Total number of dropdown" +dropdown.size());
		
		for(int i=0;i<= dropdown.size();i++) {
		String abc =	dropdown.get(i).getText();
		System.out.println(abc);
		
		}
		//--Starts with function driver.findElement(By.xpath("//input[starts-with(@id = ' ']")).sendKeys("test");
		//--Ends  with functions driver.findElement(By.xpath("//input[ends-with(@id = ' ']")).sendKeys("test");
		driver.close();

		//for links custom xpath
		// all the links html tag will start with a
		//r absolute xpath the scripts will become very slow
		
		//disadvantage of absolute xpath
		//1. Performance will be slow
		//2. Not reliable
		//3. can change at any time
		
		driver.findElement(By.xpath("//a[Contains(text(), 'My Account')]")).click();
	}

}

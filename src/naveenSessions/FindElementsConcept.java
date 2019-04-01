package naveenSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {
	
	//count of the links
	//get the text of the links

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		
	List<WebElement> links =	driver.findElements(By.tagName("a"));
	System.out.println("Total number of links " +links.size());
	
	for(int i=0; i<=links.size();i++) {
String abc =links.get(i).getText();
System.out.println(abc);
	}
		
driver.close();
	}

}

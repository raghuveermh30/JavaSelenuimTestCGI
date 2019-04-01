package naveenSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchType {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("testing");
		//  List<WebElement> list = driver.findElements(By.xpath("//div[@class='sbl1']"));
		 List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		
		System.out.println("total number of suggestions---->" +list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().contains("testing tools")) {
				list.get(i).click();
				break;
				
				
				
			}
		}
		
		Thread.sleep(3000L);
driver.close();
	}

}

package naveenSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateKeyWordConcepts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");

		
		
		/*driver.navigate().to("www.amazon.com");
		Thread.sleep(2000L);
		
		driver.navigate().back();
*/		
		
		driver.navigate().refresh();
		
		//driver.navigate.to is used to what ever the app url is there and if we want to move to some external url then we have to 
		// use navigate
		
	

	}

}

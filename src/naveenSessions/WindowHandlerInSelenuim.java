package naveenSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlerInSelenuim {
	
	public static void main(String args[]) {
		
		/*to handling popups
		1. Alert - Javascript pop up -- Alert API (accept, dismiss)
		2. File Upload pop up -- browse buttons -- Sendkeys(input type should be file type)
		3. Bowser window popup -- Advertisement popup --WindowHandler API -- (getWindowHandler())
			
			*/
	
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver	driver = new ChromeDriver();
		driver.get("http://a.testaddressbook.com/sign_up");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
		
		Set<String> handler = driver.getWindowHandles();
		//the property of the SET object is it doesnot stores the values on the indexes, Iterator methods has been used
		// Iterator will point to the just above the next location. 
		
		Iterator<String> it = handler.iterator();
		
		String ParentWindow = it.next();
				System.out.println("parent window is" +ParentWindow );
				
				String childWindow = it.next();
				System.out.println("Child window" +childWindow);
				
				driver.switchTo().window(childWindow);
				
				System.out.println("Child window title" +driver.getTitle());
				
				driver.close();
				//close refers to the specific browser window
				//quit is used to close all the browser
				
				driver.switchTo().window(ParentWindow);
				
				System.out.println("Parent window title" +driver.getTitle());
				
				
		

}
}
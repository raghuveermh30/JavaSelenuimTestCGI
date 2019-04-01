/**
 * 
 */
package naveenSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author raghuveer.mh
 *
 */
public class CalenderSelectByJavaScript {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		/*driver.get("https://www.tripadvisor.in/");
		
		Thread.sleep(3000L);
		WebElement element = driver.findElement(By.xpath("//div[@id='roundtrip_picker']/div[@data-datetype=\"DEPARTURE\"]"));
		element.click();
		String dateVal = "17-01-2019";
		
		selectDateByJs(element, driver, dateVal);
		
		driver.close();*/
		
driver.get("http://spicejet.com/"); // enter URL
		
		WebElement element = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		String dateVal = "30-12-2018";
		
		selectDateByJs(driver, element, dateVal);
		
	}

	public static void selectDateByJs( WebDriver driver, WebElement element,String dateVal) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
		
	}
}

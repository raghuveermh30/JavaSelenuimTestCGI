package naveenSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
		// implict wait is the dynamic wait
		//Thread.sleep it will pause the execution for the some seconds 
		driver.switchTo().frame(0);
		
		Actions act = new Actions(driver);
		act.clickAndHold(driver.findElement(By.xpath("//div[@id = 'draggable']"))).moveToElement(driver.findElement(By.xpath("//div[@id = 'droppable']"))).release().build().perform();
	
		driver.close();
	}

}

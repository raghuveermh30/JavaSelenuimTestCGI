package naveenSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome

	 // maximize window
		//driver.manage().deleteAllCookies(); // delete all the cookies

		//dynamic wait
		/*driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		*/
		
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.manage().window().maximize();
		
		
		//driver.findElement(By.linkText("Selectmenu")).click();
		Thread.sleep(5000L);
		
		driver.findElement(By.xpath("//div[@class = 'dropdown']/button[@id = 'dropdownMenuButton']")).click();
		Thread.sleep(2000L);
		
		List<WebElement> list =driver.findElements(By.xpath("//div[@aria-labelledby='dropdownMenuButton']/a"));
		
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().contains("Another action")) {
				list.get(i).click();
				break;
			}
		}
		
		
		driver.close();
	}

}

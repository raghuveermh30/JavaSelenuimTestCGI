package naveenSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBootsrap2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome

		
		driver.get("https://accounts.google.com/signin/v2/identifier?service=accountsettings&continue=https%3A%2F%2Fmyaccount.google.com%2F%3Fpli%3D1&csig=AF-SEnZIYHbKVXJXAUe_%3A1546177039&flowName=GlifWebSignIn&flowEntry=AddSession&hl=en-GB");
		driver.manage().window().maximize();
	Thread.sleep(3000L);
	
	driver.findElement(By.xpath("//div[@id = 'lang-chooser']")).click();
	Thread.sleep(2000L);
	
	List<WebElement> list =driver.findElements(By.xpath("//div[@class = 'OA0qNb ncFHed']//div//content[@class = 'vRMGwf oJeWuf']"));
	
	System.out.println(list.size());
		
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i).getText());
		
		if(list.get(i).getText().contains("?English (United Kingdom)?")) {
			list.get(i).click();
		}
	}
	
	driver.close();
	
	}

	
}

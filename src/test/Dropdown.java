package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		
		
		driver.get("http://www.timesofindia.com/");
		driver.manage().window().maximize();
		Thread.sleep(7000L);
		List<WebElement> dropdns= driver.findElements(By.tagName("option"));
		System.out.println("total no of dropdown ->" +dropdns.size());
		
		for(int i=0;i<dropdns.size();i++){
			
		
			System.out.println(dropdns.get(i).getText());
		
		}
		
		
	}

}

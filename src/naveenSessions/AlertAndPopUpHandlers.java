package naveenSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndPopUpHandlers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver	driver = new ChromeDriver();
				driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
				
				driver.findElement(By.xpath("//input[@name = 'proceed']")).click();
				driver.manage().timeouts().pageLoadTimeout(50L, TimeUnit.SECONDS);
			
				Alert alert = driver.switchTo().alert();
				System.out.println(alert.getText());
				
				String text = alert.getText();
				
				if(text.equals("Please enter a valid user name")) {
					System.out.println("correct alert message");
				}
				
				else {
					System.out.println("Invalid alert message");
				}
				alert.accept();  //click on Ok button 
				
				driver.close();
				
				

	}

}

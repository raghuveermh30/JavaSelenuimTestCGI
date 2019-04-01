package naveenSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		
		//1. chrome version should be greater than 60 in windows and 59 in mac
		//2.window size is default size, 1400,800--Mandatory
		//3. it is very fast it is directly running through DOM structure
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size-1400,800");
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options); // launch chrome
		
		driver.get("https://www.freecrm.com/index.html?e=1");
		driver.manage().window().maximize();
		Thread.sleep(3000L);
		driver.findElement(By.name("username")).sendKeys("raghuveermh30");
		driver.findElement(By.name("password")).sendKeys("R@ghumh3017");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		Thread.sleep(3000L);
		
		System.out.println("home page title" +driver.getTitle());


	}

	
}

package naveenSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		
		TakesScreenshot scrsht =  ((TakesScreenshot)driver);
		File src = scrsht.getScreenshotAs(OutputType.FILE);
		
		//copy file at dst
		
		
		FileUtils.copyFile(src, new File( "C:\\Users\\raghuveer.mh\\Desktop\\project\\SELENIUM\\selenium\\google.png"));

		driver.close();
	}

}

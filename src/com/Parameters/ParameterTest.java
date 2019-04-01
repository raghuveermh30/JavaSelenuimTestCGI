package com.Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	/*DataDriven Approach -- Driving the data from diff resources
	a. Excel file --test data
	b.testng.xml--env var
	c.json
	d.Properties file--Env var, testdata
	e.DB
	f. XMl*/
	
	
	
	
	WebDriver driver;
	
//env","url", "emailID", "browser"  -- these are environment varibales
	@Test
	@Parameters({"env","url", "emailID", "browser" })
	public void test(String env,String url, String emailID,String browser ) throws InterruptedException {
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000L);
		driver.findElement(By.id("login-username")).clear();
		driver.findElement(By.id("login-username")).sendKeys(emailID);
		driver.findElement(By.id("login-signin")).click();
		
		driver.quit();
	}
	

}

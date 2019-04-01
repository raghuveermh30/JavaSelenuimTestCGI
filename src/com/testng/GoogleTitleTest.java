package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class GoogleTitleTest {
	
WebDriver driver;
	
	@BeforeMethod
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40L, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test()
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println("Title of page --->" +title);		
		Assert.assertEquals(title, "Google" , "title is not valid");

	}
	
	@Test()
	public void googleLogoTest() {
	Boolean b=	driver.findElement(By.id("hplogo")).isDisplayed();
	Assert.assertTrue(b);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}

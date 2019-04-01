package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
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
	
	@Test(priority = 1, groups = "Title")
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println("Title of page --->" +title);
	}
	
	@Test(priority = 2, groups="link")
	public void googleLogoTest() {
	Boolean b=	driver.findElement(By.id("hplogo")).isDisplayed();
	System.out.println(b);
	}
	
	
	@Test(priority = 3, groups = "mail")
	public void mail() {
	Boolean b =	driver.findElement(By.linkText("Gmail")).isDisplayed();
	System.out.println(b);
	}
	
	@Test(groups = "test")
	
	public void test1(){
		System.out.println("test123");
	}
	
	@Test(groups = "test")
	public void test2(){
		System.out.println("test123");
	}
	@Test(groups = "test")
	public void test3(){
		System.out.println("test123");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}

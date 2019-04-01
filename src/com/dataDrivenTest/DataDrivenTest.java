package com.dataDrivenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.qa.ExcelUtility.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
	Xls_Reader reader = new Xls_Reader("C:/Users/raghuveer.mh/eclipse-workspace/Java_test/src/com/testdata/HalfEbayTestData.xlsx");
	String firstName =	reader.getCellData("RegTestData", "firstname", 2);
	System.out.println(firstName);
	
	String lastName = reader.getCellData("RegTestData", "lastname", 2);
	System.out.println(lastName);
	
	String address1 = reader.getCellData("RegTestData", "address1", 2);
	System.out.println(address1);
	
	String address2 = reader.getCellData("RegTestData", "address2", 2);
	System.out.println(address2);
	
	String city = reader.getCellData("RegTestData", "city", 2);
	System.out.println(city);
	
	String state = reader.getCellData("RegTestData", "state", 2);
	System.out.println(state);
	
	String zipCode = reader.getCellData("RegTestData", "zipcode", 2);
	System.out.println(zipCode);
	
	String emailAddress = reader.getCellData("RegTestData", "emailaddress", 2);
	System.out.println(emailAddress);

	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver	driver = new ChromeDriver();
	
	driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
	driver.manage().window().maximize();
	Thread.sleep(5000L);
	
	driver.findElement(By.id("firstname")).sendKeys(firstName);
	driver.findElement(By.id("lastname")).sendKeys(lastName);
	driver.findElement(By.id("address1")).sendKeys(address1);
	driver.findElement(By.id("address2")).sendKeys(address2);
	driver.findElement(By.id("city")).sendKeys(city);
	Select sel = new Select(driver.findElement(By.id("state")));
	sel.selectByVisibleText("California");
	driver.findElement(By.id("zip")).sendKeys(zipCode);
	driver.findElement(By.id("email")).sendKeys(emailAddress);
	driver.findElement(By.id("retype_email")).sendKeys(emailAddress);
	
		
	driver.close();


	}

}

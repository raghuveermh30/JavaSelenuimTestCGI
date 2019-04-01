/**
 * 
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author raghuveer.mh
 *
 */
public class CandidatesUIMap {
	
public static WebElement element;

	
	WebDriver driver;   
	
	public WebElement candidate (WebDriver driver) 
    
	{
    	element = driver.findElement(By.id("menu_recruitment_viewCandidates"));
    	
    	return element;
    	
    }
	
	public WebElement add (WebDriver driver)
	{
		element = driver.findElement(By.id("btnAdd"));
		return element;
	}
	
	public WebElement firstName(WebDriver driver)
	{
		element =driver.findElement(By.id("addCandidate_firstName"));
		return element;
	}
	
	public WebElement middleName(WebDriver driver)
	{
		element = driver.findElement(By.id("addCandidate_middleName"));
		return element;
	}
	
	public WebElement lastName(WebDriver driver)
	{
		element = driver.findElement(By.id("addCandidate_lastName"));
		return element;
	}
	
	public WebElement emailId(WebDriver driver)
	{
		element = driver.findElement(By.id("addCandidate_email"));
		return element;
	}
	
	public WebElement contactNum (WebDriver driver)
	{
		element = driver.findElement(By.id("addCandidate_contactNo"));
		return element;
	}
	
	public WebElement jobVacancy (WebDriver driver)
	{
		element = driver.findElement(By.xpath("//select[@id='addCandidate_vacancy']"));
		return element;
	}
	
	public WebElement uploadFile (WebDriver driver)
	{
		element = driver.findElement(By.id("addCandidate_resume"));
		return element;
	}
	
	public WebElement keywords (WebDriver driver)
	{
		element = driver.findElement(By.id("addCandidate_keyWords"));
		return element;
	}
	
	public WebElement comments (WebDriver driver)
	{
		element = driver.findElement(By.id("addCandidate_comment"));
		return element;
	}
	
	public WebElement appliedDate (WebDriver driver)
	{
		element = driver.findElement(By.xpath("//input[@id='addCandidate_appliedDate']"));
		return element;
	}
	
	public WebElement save (WebDriver driver)
	{
		element = driver.findElement(By.id("btnSave"));
		return element;
	}
	
	public WebElement welcome(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//a[@id='welcome']"));
		return element;
	}
	
	public WebElement logout (WebDriver driver)
	{
		element = driver.findElement(By.xpath("//a[text()='Logout']"));
		return element;
	}
}

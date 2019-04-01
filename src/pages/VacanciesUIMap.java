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
public class VacanciesUIMap {
	
	public static WebElement element;

	
	WebDriver driver ;   
	
	 public WebElement vacanies (WebDriver driver)
     {
     	element = driver.findElement(By.xpath("//a[@id='menu_recruitment_viewJobVacancy']"));
     	
     	return element;
     }
	
	 
     public WebElement add(WebDriver driver)
     {
     	element = driver.findElement(By.id("btnAdd"));
     	return element;
     }
     
     
	public WebElement jobElement (WebDriver driver)
	{
		element =driver.findElement(By.id("addJobVacancy_jobTitle"));
		
		return element;
	}
	
	public WebElement vacancyName (WebDriver driver)
	{
		element = driver.findElement(By.id("addJobVacancy_name"));
		return element;
	}
	
	public WebElement hiringManager (WebDriver driver)
	{
		element = driver.findElement(By.id("addJobVacancy_hiringManager"));
		return element;
	}
	public WebElement numOfPost (WebDriver driver)
	{
		element = driver.findElement(By.id("addJobVacancy_noOfPositions"));
		return element;
	}
	
	public WebElement description (WebDriver driver)
	{
		element = driver.findElement(By.id("addJobVacancy_description"));
		return element;
	}
	public WebElement active (WebDriver driver)
	{
		element = driver.findElement(By.id("addJobVacancy_status"));
		return element;
	}

	
	public WebElement save (WebDriver driver)
	{
		element =driver.findElement(By.id("btnSave"));
		return element;
	}
	
	public WebElement vacancyList (WebDriver driver)
	{
		element = driver.findElement(By.linkText("Job_01"));
		return element;
	}
	
	public WebElement edit (WebDriver driver)
	{
		element = driver.findElement(By.id("btnSave"));
		return element;
	}
	
	public WebElement jobVacancyStatus (WebDriver driver)
	{
		element = driver.findElement(By.xpath("//input[@id='addJobVacancy_status']"));
		return element;
	}
	

	
}

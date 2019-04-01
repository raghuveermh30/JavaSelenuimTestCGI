

	package pages;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;



		public class LoginUIMap {
		
			public WebDriver driver;
			
			                public   WebElement userName(WebDriver driver)
			                {
			                	WebElement element = driver.findElement(By.xpath("//input[@id='txtUsername']"));
			                	
			                                return element;
			                }
			                
			                public  WebElement password(WebDriver driver)
			                {
			                	WebElement element= driver.findElement(By.xpath("//input[@id='txtPassword']"));
			                                return element;
			                }
			                
			                public  WebElement submit(WebDriver driver)
			                {
			                	WebElement element = driver.findElement(By.xpath("//input[@id='btnLogin']"));
			                                return element;
			                }
			                
			                
			                public  WebElement recruitment (WebDriver driver)
			                {
			                	WebElement element = driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
			                	
			                	
			                	return element;
			                }
			                
			                
			                	                
			                
			}

		
			
		
		




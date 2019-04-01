package pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends LoginUIMap {
	
	LoginUIMap Locators = new LoginUIMap();
	
	public LoginPage(WebDriver driverA) {
		driver = driverA;
	}

	public void login()  {
			
		Locators.userName(driver).sendKeys("Admin");
	
		Locators.password(driver).sendKeys("admin123");
		
		Locators.submit(driver).click();
		
		
	}
	
	public void  goToRecruitment(){
		recruitment(driver).click();		
	}
	
	
	
	
}

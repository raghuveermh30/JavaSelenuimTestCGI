/**
 * 
 */
package pages;

import org.openqa.selenium.WebDriver;

/**
 * @author raghuveer.mh
 *
 */
public class VacanciesPage extends VacanciesUIMap{
	
	VacanciesUIMap Locators = new VacanciesUIMap();
	
	public VacanciesPage(WebDriver driverC) {
		driver = driverC;
	}
	
	public void goToVacancies() {
		Locators.vacanies(driver).click();
	}
	
	public void clickAdd() {
		Locators.add(driver).click();
	}
	
	public void updateMandatoryFields() {
		Locators.jobElement(driver).sendKeys("IT Executive");
		Locators.vacancyName(driver).sendKeys("Automation Test Engineer");
		Locators.hiringManager(driver).sendKeys("Robert Craig");
		Locators.numOfPost(driver).sendKeys("2");
		Locators.description(driver).sendKeys("Test Engineer");
		Locators.active(driver).isSelected();
		
	}
	

		public void clickSave() {
		Locators.save(driver).click();
	}
		
		public void deActivate() {
			Locators.active(driver).click();
		}
	
		public void goToJobVacancy() {
			
			Locators.vacancyList(driver).click();
			
		}
		
		public void clickEdit() {
			Locators.edit(driver).click();
			Locators.jobVacancyStatus(driver).click();
			
		}
		
		
}

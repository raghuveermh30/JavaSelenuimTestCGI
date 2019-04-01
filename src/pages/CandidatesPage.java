/**
 * 
 */
package pages;

import org.openqa.selenium.WebDriver;

/**
 * @author raghuveer.mh
 *
 */
public class CandidatesPage extends CandidatesUIMap {

	CandidatesUIMap Locators = new CandidatesUIMap();
	
	public CandidatesPage(WebDriver driverB) {
		driver = driverB;
	}
	
	public void goToCandidate() {
	
		Locators.candidate(driver).click();
	}
	
	public void clickAdd() {
		Locators.add(driver).click();
	}
	
	public void updateCandidateDetailsData() {
		Locators.firstName(driver).sendKeys("raghu");
		Locators.middleName(driver).sendKeys("veer");
		Locators.lastName(driver).sendKeys("mh");
		Locators.emailId(driver).sendKeys("raghuver@gmail.com");
		Locators.contactNum(driver).sendKeys("8880007895");
		Locators.jobVacancy(driver).sendKeys("Automation Test Engineer");
		
		Locators.keywords(driver).sendKeys("Test Engineer");
		Locators.comments(driver).sendKeys("Selenium");
		Locators.appliedDate(driver).sendKeys("2018-06-19");
	}
	

	public void uploadResume() {
		
		Locators.uploadFile(driver).sendKeys("C:\\Users\\raghuveer.mh\\Desktop\\216320_Raghuveer_MH.docx");
		
	}
	
	public void clickSave() {
		Locators.save(driver).click();
	}
	
	public void logoutAndCloseDriver() throws InterruptedException {
		Locators.welcome(driver).click();
		Thread.sleep(30000);
		Locators.logout(driver).click();
		driver.close();
	}
}

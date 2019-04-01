package test;

import org.testng.annotations.Test;

import pages.CandidatesPage;
import pages.LoginPage;
import pages.VacanciesPage;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class HrmAutoamtedTest{
	
	WebDriver driver;
  @Test
  public void main() {
	  LoginPage rec = new LoginPage(driver);
		rec.login();
		
		
		rec.goToRecruitment();
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
		
		VacanciesPage vac = new VacanciesPage(driver);
		vac.goToVacancies();
		
		VacanciesPage add = new VacanciesPage(driver);
		add.clickAdd();
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
		
		
		VacanciesPage update = new VacanciesPage(driver);
		update.updateMandatoryFields();
		update.clickSave();
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
		
		
		CandidatesPage can = new CandidatesPage(driver);
		can.goToCandidate();
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
		can.clickAdd();
		
		CandidatesPage updatecandidate = new CandidatesPage(driver);
		updatecandidate.updateCandidateDetailsData();
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
		
		CandidatesPage uploadresume = new CandidatesPage(driver);
		uploadresume.uploadResume();
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);	
		uploadresume.clickSave();
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
		
		VacanciesPage vacancytab = new VacanciesPage(driver);
		vacancytab.goToVacancies();
		vacancytab.goToJobVacancy();
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
		vacancytab.clickEdit();
		vacancytab.deActivate();
		vacancytab.clickSave();
		
		can.goToCandidate();
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  CandidatesPage vac_tab = new CandidatesPage(driver);
	  vac_tab.logoutAndCloseDriver();
  }

}

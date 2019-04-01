/**
 * 
 */
package naveenSessions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/*import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;*/



/**
 * @author raghuveer.mh
 *
 */
public class DownloadFileConcept {
	
	WebDriver driver;
	File  folder;
	
	@BeforeMethod
	public void setUp() {
		
		//8889-999-9988-UUID will generated
		
		folder = new File(UUID.randomUUID().toString());
		folder.mkdir();
		
		
		//Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("download.default_directory", folder.getAbsolutePath());

		options.setExperimentalOption("prefs", prefs);
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);

		driver = new ChromeDriver(cap);
	

}
	
	
	@Test
	public void test() throws InterruptedException {
		/*driver.get("http://the-internet.herokuapp.com/download");
		driver.findElement(By.linkText("some-file.txt")).click();
		*/
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		Thread.sleep(5000L);
		
		driver.findElement(By.linkText("Test File to Download")).click();
		Thread.sleep(3000L);
		
		
		File listOfFiles[] = folder.listFiles();
		// make sure the directory is not empty
		// Assert.assertEquals(listOfFiles.length, is(not(0)));
		Assert.assertTrue(listOfFiles.length > 0);

		for (File file : listOfFiles) {
			// make sure that downloaded file is not empty
			// Assert.assertEquals(file.length(), is(not((long)0)));
			Assert.assertTrue(file.length() > 0);
		}
	}
	
	@AfterMethod
	public void afterTest() {
		driver.quit();
		for (File file : folder.listFiles()) {
			file.delete();
		}
		folder.delete();
	}
	
}

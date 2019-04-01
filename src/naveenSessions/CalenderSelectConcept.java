package naveenSessions;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderSelectConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html?e=1");
		driver.manage().window().maximize();
		Thread.sleep(5000L);
		driver.findElement(By.name("username")).sendKeys("raghuveermh30");
		driver.findElement(By.name("password")).sendKeys("R@ghumh3017");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		Thread.sleep(5000L);
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000L);
		
		String date = "33-January-201";
		
		String dateArr[] = date.split("-");
		
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];
		
		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);
		
		Select select1 = new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);
		


		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]
		//*[@id="crmcalendar"]/table/tbody/tr[2]/td/table/tbody/tr[3]/td[2]
		
		String beforeXpath = "//*[@id=\"crmcalendar\"]/table/tbody/tr[2]/td/table/tbody/tr[";
		String afterXpath = "]/td[";
		
final int totalWeekDays = 7;
		
		//2-1 2-2 2-3 2-4 2-5 2-6 2-7
		//3-2 3-2 3-3 3-4 3-5 3-6 3-7
		boolean flag = false;
		String dayVal = null;
		for(int rowNum=2; rowNum<=7; rowNum++){
			
			for(int colNum = 1; colNum<=totalWeekDays; colNum++){
				try{
			    dayVal =driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).getText();
				}catch (NoSuchElementException e){
					System.out.println("Please enter a correct date value");
					flag = false;
					break;
				}
				System.out.println(dayVal);
				if(dayVal.equals(day)){
					driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).click();
					flag = true;
					break;
				}				
			}
			if(flag){
				break;
			}
			
		}
}
}

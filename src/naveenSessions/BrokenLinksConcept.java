package naveenSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksConcept {
	
	

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		//driver.get("https://www.freecrm.com/index.html?e=1");
		driver.get("https://makemysushi.com/404");
		driver.manage().window().maximize();
		Thread.sleep(5000L);
		/*driver.findElement(By.name("username")).sendKeys("raghuveermh30");
		driver.findElement(By.name("password")).sendKeys("R@ghumh3017");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		Thread.sleep(5000L);
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000L);*/
		
		//links are availale in 'a' tag  href<www.google.com>
		//images are available in 'img' tag href<www. test.com>
		
		
		// 1. get the list of all links and images
		List<WebElement> list = driver.findElements(By.tagName("a"));
		list.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("Size of all the linsk" +list.size());
		
		//create the list for active links -- having href properties
		
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		//2. iterate the list -- exclde all links and images which doesnot have href attributes	
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).getAttribute("href"));
			if(list.get(i).getAttribute("href")!=null && (!list.get(i).getAttribute("href").contains("javascript"))) {
				activeLinks.add(list.get(i));
			}
		}
		
		//get the size of active links list
		System.out.println("Size of active links and images" +activeLinks.size());
		
		
		
		
		//3. check the href url with the HTTPCONNECTION API
		/*200 - OK, 
		404-Not found, 
		500 -Internal error
		400 - Bad Request*/
		for(int j=0;j<activeLinks.size();j++) {
			
		HttpURLConnection connection = (HttpURLConnection)	new URL(activeLinks.get(j).getAttribute("href")).openConnection();
		connection.connect();
	String respone=	connection.getResponseMessage(); //it return ok if it is valid
		connection.disconnect();
		System.out.println("Active links" +activeLinks.get(j).getAttribute("href")+"---->"+respone);
		}
		
		driver.close();
	}

}

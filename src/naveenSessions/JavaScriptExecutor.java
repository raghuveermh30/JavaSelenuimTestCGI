package naveenSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver	driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
		
		driver.get("https://www.freecrm.com/index.html?e=1");
		driver.manage().window().maximize();
		Thread.sleep(3000L);
		System.out.println("Before login" +driver.getTitle());
		driver.findElement(By.name("username")).sendKeys("raghuveermh30");
		//driver.findElement(By.name("password")).sendKeys("R@ghumh3017");
		//driver.findElement(By.name("password")).sendKeys("R@ghumhdfds");
		/*driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		Thread.sleep(4000L);
		
		Highlighting the Login button
		*/
		
		/*javascriptexecutoe is the class and we are casting into the driver
		 
		 executeScript -- this method is used to execute the Javascript code
		*/
		
	WebElement loginBtn = driver.findElement(By.xpath("//input[@type = 'submit']"));
	
		//flash(loginBtn, driver); //highlight the element
	
//	drawBorder(loginBtn, driver);
	
	// generate alert
	generateAlert("There is error message", driver);
	Thread.sleep(3000L);
	Alert alert = driver.switchTo().alert();
	alert.accept();
	
	clickElementByJavaScript(loginBtn, driver);
	
	refreshPage(loginBtn, driver);
	
	//get the title of the page
	
	System.out.println("title of the page" +getTitlePage(driver));
	Thread.sleep(3000L);

	System.out.println("Page inner source" +getInnerText(driver));
	
	//scrollPageDown(driver);
	
	
	Thread.sleep(3000L);
	WebElement forgotPass = driver.findElement(By.xpath("//a[contains(text(), 'Forgot Password?')]"));
	scrollIntoView(forgotPass, driver);
	Thread.sleep(3000L);
		driver.close();
	}
	
	public static void  flash(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js =  ((JavascriptExecutor) driver);
		String bgColour = element.getCssValue("backgroundColor");
		
		for(int i=0 ; i<100 ; i++) {
			changeColor("rgb(0,200,0)",element,driver);//1
			changeColor(bgColour, element, driver);//2
		}
		
	}
//Highlight
	public static void changeColor (String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js =  ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundcolor = '"+color+"'", element);
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	//draw the border
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js =  ((JavascriptExecutor) driver);
		 js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	 }
	
	//generate the alert
	public   static void  generateAlert( String message , WebDriver driver) {
		JavascriptExecutor js =  ((JavascriptExecutor) driver);
		js.executeScript("alert('"+message+"')");
		
	}
	
	//click the element
	public static void clickElementByJavaScript(WebElement ele, WebDriver driver) {
		JavascriptExecutor js =  ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", ele);
	}
	
	
	//refresh the page
	
	public static void refreshPage(WebElement element, WebDriver driver) {
		JavascriptExecutor js =  ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
		
	}
	
	// to get the title of the page
	public static String getTitlePage(WebDriver driver) {
		JavascriptExecutor js =  ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
		
	}
	
	//to get the inner text of the page
	public static String getInnerText(WebDriver driver) {
		JavascriptExecutor js =  ((JavascriptExecutor) driver);
		String pageText = js.executeScript("return document.documentElement.innerText").toString();
		return pageText;

		
	}
	
	//Scrolling function
	
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js =  ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	}
	
	public static void scrollIntoView(WebElement element,WebDriver driver) {
		JavascriptExecutor js =  ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	
	public static void horizantalScroll(WebElement element, WebDriver driver) {
		JavascriptExecutor js =  ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(250,0)" , element);
		
	}
	
	
}
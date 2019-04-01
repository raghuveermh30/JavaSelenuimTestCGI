package naveenSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonInSelenuim {

	private static SingletonInSelenuim instanceDriver = null;
	private static WebDriver driver;
	
	private SingletonInSelenuim() {
		
	}
	
	public WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public static SingletonInSelenuim getInstance() {
		if(instanceDriver == null) {
			instanceDriver = new SingletonInSelenuim();
		}
		return instanceDriver;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

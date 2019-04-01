package naveenSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Users\\raghuveer.mh\\eclipse-workspace\\Java_test\\src\\naveenSessions\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("URL"));
		
		String browserName = prop.getProperty("browser");
		String url = prop.getProperty("URL");
		
		System.out.println(browserName);
		
		if(browserName.equals("chrome")) {
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\raghuveer.mh\\Desktop\\chromedriver_win32 (2)\\chromedriver.exe");
				WebDriver	driver = new ChromeDriver();
					driver.get(url);
					driver.manage().window().maximize();
					driver.manage().timeouts().pageLoadTimeout(20L, TimeUnit.SECONDS);
					
					driver.close();
		}
		
		

		
	}

}

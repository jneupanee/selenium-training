package seleniumWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverProvider {
	
	

	private static WebDriver driver;
	
	public static WebDriver getChromeDriver(){
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/executableDriver/chromedriver.exe");
		driver = new ChromeDriver();		
		return driver;
		
	}
		
	public WebDriver getFirefoxDriver(){
		return driver;
		
	}
	
	

}

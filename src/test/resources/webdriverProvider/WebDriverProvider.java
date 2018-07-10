package webdriverProvider;

import org.openqa.selenium.WebDriver;

public class WebDriverProvider {
	
	

	private static WebDriver driver;
	
	public static WebDriver getChromeDriver(){
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/executableDriver/chromedriver.exe");
		driver = new org.openqa.selenium.chrome.ChromeDriver();		
		return driver;
		
	}
		
	public WebDriver getFirefoxDriver(){
		return driver;
		
	}
	
	

}

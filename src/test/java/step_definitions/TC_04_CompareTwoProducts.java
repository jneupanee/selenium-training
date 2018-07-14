package step_definitions;


import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;
import pageobjects.Guru99_Homepage;
import pageobjects.MobilePage;
import seleniumWebdriver.WebDriverProvider;

public class TC_04_CompareTwoProducts {
	private WebDriver driver;
	private Guru99_Homepage gp;
	private MobilePage mp;
	private String mainWindow;
	
	@Given("^I am on guru homepage$")
	public void i_am_on_guru_homepage() {
		driver = WebDriverProvider.getChromeDriver();

		driver.navigate().to("http://live.guru99.com");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@When("^i click mobile menu$")
	public void i_click_mobile_menu() {
		gp = PageFactory.initElements(driver, pageobjects.Guru99_Homepage.class);
		gp.getMobileMenuButton().click();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

	}

	@Then("^I click 'Add to compare' on mobile product list$")
	public void i_click_Add_to_compare_on_mobile_product_list() {
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		mp = PageFactory.initElements(driver, pageobjects.MobilePage.class);
		
		mp.getXperiaAddToCompareButton().click();
		mp.getIphoneAddToCompareButton().click();
		
	}

	@Then("^i click compare button to compare$")
	public void i_click_compare_button() {
		
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
	WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(mp.getCompareButton()));
		
		

		
		mp.getCompareButton().click();
	
	}

	@Then("^I verify the pop-up window and check the product are reflected$")
	public void i_verify_the_pop_up_window_and_check_the_product_are_reflected() {
		
		mainWindow  = driver.getWindowHandle();
		
		Set <String> windowHandle = driver.getWindowHandles();
		
		windowHandle.remove(mainWindow);
		
			String popupWindow = windowHandle.iterator().next();
			driver.switchTo().window(popupWindow);
			
			
	}

	@Then("^Close the pop up windows$")
	public void close_the_pop_up_windows() {
		mp.getCloseWindowButton().click();
		driver.switchTo().window(mainWindow).close();
		
	}

}

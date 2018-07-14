package step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.Guru99_Homepage;
import pageobjects.MobilePage;
import seleniumWebdriver.WebDriverProvider;





public class TC_3_AddingProductInCart {
	private WebDriver driver;
	private Guru99_Homepage gp;
	private MobilePage mp;
	private String actual;
	private String expected;
	
	@Given("^I am on Guru Page$")
	public void i_am_on_Guru_Page()  {
	   driver = WebDriverProvider.getChromeDriver();
	   
	   driver.navigate().to("http://live.guru99.com");
	   driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   
	}

	
	@When("^I click Mobile Menu$")
	public void i_click_Mobile_Menu() throws Throwable {
		
	//gp = GuruPage Instantiated Above
		
		gp = PageFactory.initElements(driver, pageobjects.Guru99_Homepage.class);
		
		   
	    gp.getMobileMenuButton().click(); 
	    
	    
		
		
	}
	
	
	
	
	
	
	
	
	
	
	@Then("^In the list I click 'Add to cart' for sony xperia$")
	public void in_the_list_I_click_Add_to_cart_for_sony_xperia()  {
		
	
	    
	   driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	}

	@Then("^I change quantity value to 'Hundred'$")
	public void i_change_quantity_value_to_Hundred()  {
	   //mp = mobile Page Intantiated Above
		mp = PageFactory.initElements(driver, pageobjects.MobilePage.class);
		mp.getXperiaAddToCartButton().click();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		mp.getQuantityCartTextField().sendKeys("1000");
		mp.getQuantityCartUpdateButton().click();
	}

	@Then("^I verify the error message$")
	public void i_verify_the_error_message()  {
		
		
	   actual = "* The maximum quantity allowed for purchase is 500.";
	   expected = mp.getMaximumQuantityReachedMessage().getText();
	   
	   Assert.assertEquals(actual, expected);
		  
	}

	@Then("^I click on Empty Cart$")
	public void i_click_on_Empty_Cart()  {
	   mp.getEmptyCartButton().click();;
	   
	}

	@Then("^I click verify cart is empty$")
	public void i_click_verify_cart_is_empty()  {
	   
		
		
		
		actual = "SHOPPING CART IS EMPTY";
		expected = mp.getEmptyCartMessage().getText();
		
		Assert.assertEquals(actual, expected);
		;
	   
	}
	
	@Then("^Close the browser3$")
	public void close_the_browser() {
	  driver.quit();
	}



}

package step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.Guru99_Homepage;
import webdriverProvider.WebDriverProvider;


public class VerifyMobileListPage {

	private WebDriver driver;
	private Guru99_Homepage gp;
	
	@Given("^I am on live\\.guru$")
	public void i_am_on_live_guru() throws InterruptedException {
	   driver = WebDriverProvider.getChromeDriver();
	   driver.get("http://live.guru99.com/index.php/");
	   driver.manage().window().maximize();
	   	    
	   driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
	   
	   
	   Assert.assertEquals(driver.getTitle(),"Home page" );
	   
	    
	}


	@When("^I click 'Mobile' menu$")
	public void i_click_Mobile_menu()   {
		gp = PageFactory.initElements(driver, pageobjects.Guru99_Homepage.class);
		gp.getMobileMenu().click();
		
		
		
	}

	@Then("^Title of the page$")
	public void title_of_the_page()   {
	    // Write code here that turns the phrase above into concrete actions
		
		Assert.assertEquals(driver.getTitle(), "Mobile");
		
		
	    ;
	}

	@Then("^I click sortby$")
	public void i_click_sortby()   {
		Select select = new Select(gp.getSortBy());
		select.selectByIndex(1);
		
		
		
		
		
		
		
		
	    // Write code here that turns the phrase above into concrete actions
	    ;
	}

	@Then("^I chose 'Name'$")
	public void i_chose_Name()   {
	    
	    ;
	}

	@Then("^The product should be sorted by Name$")
	public void the_product_should_be_sorted_by_Name()   {
	   Assert.assertEquals(gp.getFirstItem().getText(), "IPHONE");
	   
	   Assert.assertEquals(gp.getSecondItem().getText(), "SAMSUNG GALAXY");
	   
	   Assert.assertEquals(gp.getThirdItem().getText(), "SONY XPERIA");
	   
		
		
		
		
		
		
		
		
	    
	}

	@Then("^close Browser1$")
	public void close_Browser() {
	driver.close();
	}
	
	
	
	
}

package step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.Guru99_Homepage;
import pageobjects.MobilePage;
import webdriverProvider.WebDriverProvider;

public class VerifyTheCost {
	
	private WebDriver driver;
	private Guru99_Homepage gp;
	private MobilePage mp;
	private String costOfXperiaonMobilePage;
	private String costOfXperiaonDetailPage;
	@Given("^I am on live Guru Page$")
	public void i_am_on_live_Guru_Page()   {
		driver = WebDriverProvider.getChromeDriver();
	    driver.navigate().to("http://live.guru99.com/");
	    driver.manage().window().maximize();
   	    
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
	}

	@When("^I click Mobile Menu$")
	public void i_click_Mobile_Menu()   {
		gp = PageFactory.initElements(driver, pageobjects.Guru99_Homepage.class);
	    gp.getMobileMenu().click();
	}

	@Then("^I read the list of all mobile and read the cost of Sony Xperia Mobile$")
	public void i_read_the_list_of_all_mobile_and_read_the_cost_of_Sony_Xperia_Mobile()   {
	    mp = PageFactory.initElements(driver,pageobjects.MobilePage.class);
		costOfXperiaonMobilePage = mp.getCostOfXperiaText().getText();
			    
	}

	@Then("^I click on Sony Xperia Mobile$")
	public void i_click_on_Sony_Xperia_Mobile()   {
	    mp.getXperiaImageLink().click();
	    
	}

	@Then("^I read the Sony Xperia Mobile from detail Page$")
	public void i_read_the_Sony_Xperia_Mobile_from_detail_Page()   {
	    costOfXperiaonDetailPage = mp.getCostofXperiaInDetailPageText().getText();
	    
	}

	@Then("^I compare the value of both Page$")
	public void i_compare_the_value_of_both_Page()   {
	    Assert.assertEquals(costOfXperiaonDetailPage, costOfXperiaonMobilePage);
	    
	}
	
	@Then("^close Browser$")
	public void close_Browser() {
	driver.close();
	}
	



}

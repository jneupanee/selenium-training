package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


//http://live.guru99.com
public class Guru99_Homepage {
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/header/div/div[3]/nav/ol/li[1]/a")
	private WebElement mobileMenu;
	
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")
	private WebElement sortBy;

	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/h2/a")
	private WebElement firstItem;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/h2/a")
	private WebElement secondItem;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[3]/div/h2/a")
	private WebElement thirdItem;
	
		
	public WebElement getFirstItem() {
		return firstItem;
	}


	public WebElement getSecondItem() {
		return secondItem;
	}


	public WebElement getThirdItem() {
		return thirdItem;
	}

		
	public WebElement getMobileMenu() {
		return mobileMenu;
	}


	public WebElement getSortBy() {
		return sortBy;
	}


}

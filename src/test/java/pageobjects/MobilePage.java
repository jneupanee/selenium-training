package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MobilePage {
	
	
	////*******TC_01_Elements
	@FindBy(how = How.XPATH, using = "//*[@id=\"product-price-1\"]/span")
	private WebElement costOfXperiaText;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"product-collection-image-1\"]")
	private WebElement xperiaImageLink;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"product-price-1\"]/span")
	private WebElement costofXperiaInDetailPageText;
	
	/////TC_03_Elements
	@FindBy(how = How.XPATH, using = "//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button/span/span")
	private WebElement xperiaAddToCartButton;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/input")
	private WebElement quantityCartTextField;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/button/span/span")
	private WebElement quantityCartUpdateButton;
	

	@FindBy(how = How.XPATH, using = "//*[@id=\"shopping-cart-table\"]/tbody/tr/td[2]/p")
	private WebElement maximumQuantityReachedMessage;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"empty_cart_button\"]/span/span")
	private WebElement emptyCartButton;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"top\"]/body/div/div/div[2]/div/div/div[1]/h1")
	private WebElement emptyCartMessage;
	
	//////////////////////End TC_03_Elements
	
	public WebElement getCostofXperiaInDetailPageText() {
		return costofXperiaInDetailPageText;
	}



	public WebElement getXperiaImageLink() {
		return xperiaImageLink;
	}



	public WebElement getCostOfXperiaText() {
		return costOfXperiaText;
	}
	
	

	public WebElement getXperiaAddToCartButton() {
		return xperiaAddToCartButton;
	}



	public WebElement getQuantityCartTextField() {
		return quantityCartTextField;
	}



	public WebElement getQuantityCartUpdateButton() {
		return quantityCartUpdateButton;
	}



	public WebElement getMaximumQuantityReachedMessage() {
		return maximumQuantityReachedMessage;
	}



	public WebElement getEmptyCartButton() {
		return emptyCartButton;
	}



	public WebElement getEmptyCartMessage() {
		return emptyCartMessage;
	}


	
	
	
	
}

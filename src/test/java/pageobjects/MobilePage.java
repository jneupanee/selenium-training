package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MobilePage {
	
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"product-price-1\"]/span")
	private WebElement costOfXperiaText;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"product-collection-image-1\"]")
	private WebElement xperiaImageLink;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"product-price-1\"]/span")
	private WebElement costofXperiaInDetailPageText;
	

	public WebElement getCostofXperiaInDetailPageText() {
		return costofXperiaInDetailPageText;
	}



	public WebElement getXperiaImageLink() {
		return xperiaImageLink;
	}



	public WebElement getCostOfXperiaText() {
		return costOfXperiaText;
	}
	
	

}

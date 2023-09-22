package tek.capstone.guardians.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.guardians.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(),this);
	}
	@FindBy(id="search")
	public WebElement SearchBttnOrder;
	
	@FindBy(id="searchInput")
	public WebElement SearBarOption;
	
	@FindBy(id="searchBtn")
	public WebElement SearchBttnforitems;
	
	@FindBy(xpath="//img[@class='image']")
	public WebElement KasaOutdoorSmartPlug;
	
	@FindBy(id="addToCartBtn")
	public WebElement AddtoCardItems;
	
	@FindBy(xpath="//select[@class='product__select']")
	public WebElement QuantityOfCardDropdown;
	
	@FindBy(id="cartBtn")
	public WebElement QuantityOfCard;

}

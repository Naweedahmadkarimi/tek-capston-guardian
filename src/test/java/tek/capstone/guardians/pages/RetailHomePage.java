package tek.capstone.guardians.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.guardians.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	
	public RetailHomePage() {
		PageFactory.initElements(getDriver(),this);
	}
	
//	Syntax for finding UI elements and storing them in POM classes
//	@FindBy()
	@FindBy(xpath="//a[text()='TEKSCHOOL']")
	public WebElement tekschoolLogo;
	
	@FindBy(id="search")
	public WebElement allDepartmentDropdown;
	
	@FindBy(css="#searchInput")
	public WebElement searchBar;
	
	@FindBy(xpath="//button[@id='searchBtn']")
	public WebElement searchButton;
	
	@FindBy(xpath="//a[@id='signinLink']")
	public WebElement SignInButton;
	
	@FindBy(tagName="//img")
	public WebElement pokemon;
	
	@FindBy(id="cartBtn")
	public WebElement carButton;
	
	@FindBy(id="hamburgerBtn")
	public WebElement Allsection;
	
	@FindBy(xpath="//div[@class='sidebar__content']//span")
	public List<WebElement> sideBarOptions;
	

}

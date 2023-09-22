package tek.capstone.guardians.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.guardians.base.BaseSetup;

public class RetailSignInPage extends BaseSetup{
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(),this);
//		implementing page facotory calss to initialize the UI element 
	}
	@FindBy(xpath="//h1[@class='login__subtitle']")
	public WebElement SignInPageLogo;
	
	@FindBy(id="email")
	public WebElement EmailFild;
	
	@FindBy(id="password")
	public WebElement PasswordFild;
	
	@FindBy(id="loginBtn")
	public WebElement LoginPageButton;
	
	@FindBy(id="newAccountBtn")
	public WebElement CreateNewAccountButton;
	
	@FindBy(id="newCompanyAccount")
	public WebElement wantToSellSomethingLink;
	
	@FindBy(id="logoutBtn")
	public WebElement LogoutButton;
	
	@FindBy(id="nameInput")
	public WebElement nameInputforCreateAcc;
	
	@FindBy(id="emailInput")
	public WebElement emailInPutforCreatAcc;
	
	@FindBy(id="passwordInput")
	public WebElement PasswordforCreatAcc;
	
	@FindBy(id="confirmPasswordInput")
	public WebElement ConfirmPasswordforCreatAcc;
	
	@FindBy(id="signupBtn")
	public WebElement SignUpButtonforCreatAcc;

}

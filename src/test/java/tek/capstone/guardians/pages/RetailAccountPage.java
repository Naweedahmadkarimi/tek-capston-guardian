package tek.capstone.guardians.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.guardians.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(),this);
	}
	
	@FindBy(id="profileImage")
	public WebElement ProfileAccountImage;
	
	@FindBy(id="accountLink")
	public WebElement AccountOption;
	
	@FindBy(id="nameInput")
	public WebElement InputNameAccoutOption;
	
	@FindBy(id="personalPhoneInput")
	public WebElement PhoneNumberAccountOption;
	
	@FindBy(id="personalUpdateBtn")
	public WebElement UpdateBttnAccountOption;
	
	@FindBy(xpath="//div[text()='Personal Information Updated Successfully']")
	public WebElement UpdateMassageAccountOption;
	
	@FindBy(id="cardNumberInput")
	public WebElement CardNumberInput;
	
	@FindBy(id="nameOnCardInput")
	public WebElement NameOnCard;
	
	@FindBy(id="expirationMonthInput")
	public WebElement expiratiMonthInput;
	
	@FindBy(id="expirationYearInput")
	public WebElement ExpirationYear;
	
	@FindBy(id="securityCodeInput")
	public WebElement SecurityCodeInput;
	
	@FindBy(id="paymentSubmitBtn")
	public WebElement AddCardButton;
	
	@FindBy(xpath="//div[text()='Payment Method added sucessfully']")
	public WebElement updateCardMassage;
	
	@FindBy(xpath="//p[text()='Add a payment method']")
	public WebElement paymentMethod;
	
	@FindBy(xpath="//button[text()='Edit']")
	public WebElement EditOnCardOption;
	
	@FindBy(id="cardNumberInput")
	public WebElement UpdatedCardNumber;
	
	@FindBy(id="nameOnCardInput")
	public WebElement UpdateNameOncard;
	
	@FindBy(id="expirationMonthInput")
	public WebElement UpdateExpirationonmonth;
	
	@FindBy(id="expirationYearInput")
	public WebElement UpdateExpirationonYear;
	
	@FindBy(id="securityCodeInput")
	public WebElement UpdateSecurityCode;
	
	@FindBy(id="paymentSubmitBtn")
	public WebElement UpdateCardButt;
	
	@FindBy(xpath="//div[text()='Payment Method updated Successfully']")
	public WebElement updateClickButtnMessage;
	
	@FindBy(xpath="//button[text()='remove']")
	public WebElement RemoveOption;
	
	@FindBy(xpath="//h1[@class='account__payment-new-title']")
	public WebElement DebitAndCreditOptionvisible;
	
	@FindBy(xpath="//div[@class='account__address-new']")
	public WebElement AddrssBttn;
	
	@FindBy(id="countryDropdown")
	public WebElement CountryDropdownSelection;
	
	@FindBy(id="fullNameInput")
	public WebElement FullNameinAddress;
	
	@FindBy(id="phoneNumberInput")
	public WebElement PhoneNumberInAdress;
	
	@FindBy(id="streetInput")
	public WebElement StreetAddress;
	
	@FindBy(id="apartmentInput")
	public WebElement ApartmentAdress;
	
	@FindBy(id="cityInput")
	public WebElement CityAddress;
	
	@FindBy(xpath="//select[@name='state']")
	public WebElement StateAddress;
	
	@FindBy(id="zipCodeInput")
	public WebElement ZipCodeAdress;
	
	@FindBy(id="addressBtn")
	public WebElement AddYourAddressBttn;
	
	@FindBy(xpath="//div[text()='Address Added Successfully']")
	public WebElement AddressMassage;
	
	@FindBy(xpath="//button[@class='account__address-btn'][1]")
	public WebElement EditBttnforAddress;
	
	@FindBy(id="addressBtn")
	public WebElement UpdatedBttnforAddress;
	
	@FindBy(xpath="//div[text()='Address Updated Successfully']")
	public WebElement AddressUpdateMessage;
	
	@FindBy(xpath="//button[@class='account__address-btn'][2]")
	public WebElement RemoveBttnofAddrss;
	
	@FindBy(xpath="//h1[text()='Your Addresses']")
	public WebElement YourAddress;
	
	
	
	
	
	
	
	
	

}

package tek.capstone.guardians.steps;
import java.util.List;
import java.util.Map;

import com.github.dockerjava.api.model.Info;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import tek.capstone.guardians.pages.POMFactory;
import tek.capstone.guardians.utilities.CommonUtility;

public class RetailAccountStep extends CommonUtility{
	private POMFactory factory=new POMFactory();
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.accountPage().AccountOption);
		logger.info("Click passed");
	  
	}
	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phoneNumber) {
		clearTextUsingSendKeys(factory.accountPage().InputNameAccoutOption);
		sendText(factory.accountPage().InputNameAccoutOption,name);
		logger.info("Text Send");
		clearTextUsingSendKeys(factory.accountPage().PhoneNumberAccountOption);
		sendText(factory.accountPage().PhoneNumberAccountOption, phoneNumber);
		logger.info("Updated");
		
	   
	}
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().UpdateBttnAccountOption);
		logger.info("Click passed");
	    
	}
	@SuppressWarnings("deprecation")
	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().UpdateMassageAccountOption);
		String expected="Personal Information Updated Successfully";
		String actual=factory.accountPage().UpdateMassageAccountOption.getText();
		Assert.assertEquals(expected, actual);
		logger.info("Expectd and acctual the same");
	}
	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.accountPage().paymentMethod);
		logger.info("Clicked");
	  
	}
	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>>paymentInfo=dataTable.asMaps(String.class,String.class);
		sendText(factory.accountPage().CardNumberInput, paymentInfo.get(0).get("cardNumber"));
		sendText(factory.accountPage().NameOnCard, paymentInfo.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expiratiMonthInput, paymentInfo.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().ExpirationYear, paymentInfo.get(0).get("expirationYear"));
		sendText(factory.accountPage().SecurityCodeInput, paymentInfo.get(0).get("securityCode"));
		logger.info("payment info passed succesfully");
	  
	}
	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().AddCardButton);
		logger.info("Clicked");
	  
	}
	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
		waitTillPresence(factory.accountPage().updateCardMassage);
		String expected="Payment Method added sucessfully";
		String actual=factory.accountPage().updateCardMassage.getText();
		Assert.assertEquals(expected, actual);
		logger.info("Expectd and acctual the same");
			}
	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().EditOnCardOption);
		logger.info("user Click sucessfully");
	
	}
	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		List<Map<String,String>>paymentupdate=dataTable.asMaps(String.class,String.class);
		clearTextUsingSendKeys(factory.accountPage().UpdatedCardNumber);
		sendText(factory.accountPage().UpdatedCardNumber, paymentupdate.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.accountPage().UpdateNameOncard);
		sendText(factory.accountPage().UpdateNameOncard, paymentupdate.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().UpdateExpirationonmonth, paymentupdate.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().UpdateExpirationonYear, paymentupdate.get(0).get("expirationYear"));
		sendText(factory.accountPage().UpdateSecurityCode, paymentupdate.get(0).get("securityCode "));
		logger.info("update succes");
		
	}
	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().UpdateCardButt);
		logger.info("Click passed");
	 
	}
	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
		String expected="Payment Method updated Successfully";
		String actual=factory.accountPage().updateCardMassage.getText();
		Assert.assertEquals(expected, actual);
		logger.info("Expectd and acctual the same");
	   
	}
	
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().RemoveOption);
		logger.info("Card removed succesfully");
	
	}
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		waitTillPresence(factory.accountPage().DebitAndCreditOptionvisible);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().DebitAndCreditOptionvisible));
		logger.info("Card remove success");
	    
	}
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().AddrssBttn);
		logger.info("User Click on addressBttn");
		
	}
	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String,String>>Addressinfo=dataTable.asMaps(String.class,String.class);
		selectByVisibleText(factory.accountPage().CountryDropdownSelection, Addressinfo.get(0).get("United States"));
		sendText(factory.accountPage().FullNameinAddress, Addressinfo.get(0).get("fullName"));
		sendText(factory.accountPage().PhoneNumberInAdress,Addressinfo.get(0).get("phoneNumber"));
		sendText(factory.accountPage().StreetAddress, Addressinfo.get(0).get("streetAddress"));
		sendText(factory.accountPage().ApartmentAdress,Addressinfo.get(0).get("apt"));
		sendText(factory.accountPage().CityAddress, Addressinfo.get(0).get("city"));
		selectByVisibleText(factory.accountPage().StateAddress, Addressinfo.get(0).get("state"));
		sendText(factory.accountPage().ZipCodeAdress,Addressinfo.get(0).get("zipCode"));
		logger.info("Address added Succes");
		

	}
	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().AddYourAddressBttn);
		logger.info("Address Added");
	   
	}
	@Then("a message should be displayed ‘Address Added Successfully’")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
		waitTillPresence(factory.accountPage().AddressMassage);
		String expected="Address Added Successfully";
		String actual=factory.accountPage().AddressMassage.getText();
		Assert.assertEquals(expected, actual);
		logger.info("Adress the same");
		   
	}
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().EditBttnforAddress);
		logger.info("Edit passed");
	
	}
	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		click(factory.accountPage().UpdatedBttnforAddress);
		logger.info("Update passed");
	   
	}
	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		waitTillPresence(factory.accountPage().AddressUpdateMessage);
		String expected="Address Updated Successfully";
		String actual=factory.accountPage().AddressUpdateMessage.getText();
		Assert.assertEquals(expected, actual);
		logger.info("Adress updated");
	   
	}
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
	   click(factory.accountPage().RemoveBttnofAddrss);
	   logger.info("Click success");
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		Assert.assertTrue(factory.accountPage().YourAddress.isEnabled());
		logger.info("Adderss Removed");
	
	}
	
}
		
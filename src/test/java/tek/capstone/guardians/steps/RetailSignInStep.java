package tek.capstone.guardians.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.capstone.guardians.pages.POMFactory;
import tek.capstone.guardians.utilities.CommonUtility;

public class RetailSignInStep extends CommonUtility{
	private POMFactory factory=new POMFactory();
	
	@Given("User is on retail website")
	public void user_is_on_retail_website() {
		Assert.assertTrue(factory.homepage().tekschoolLogo.isDisplayed());
		logger.info("TekSchoolLogo is Displayed");
	}
	@When("User click on Sign in option")
	public void user_click_on_sign_in_option() {
		click(factory.signInPage().SignInPageLogo);
		logger.info("User clicked on SignInLink succesfully");
	}
	@And("User enter email {string} and password {string}")
	public void userEmailAndPassword(String email,String password) {
		sendText(factory.signInPage().EmailFild, email);
		sendText(factory.signInPage().PasswordFild, password);
		logger.info("user enter email successfully");
		logger.info("user enter password successfully");
		
	}
	
	@And("User click on login button")
	public void user_click_on_login_button() {
		click(factory.signInPage().LoginPageButton);
		logger.info("Click succesfully");
  
	}
	@Then("User should be logged in into Account")
	public void user_should_be_logged_in_into_account() {
		Assert.assertTrue(factory.signInPage().LogoutButton.isDisplayed());
		logger.info("user Login success");
	    
	}
	@And ("User click on Create New Account button")
	public void UserClickOnCreateNewAccountButton() {
		click(factory.signInPage().CreateNewAccountButton);
		logger.info("Click onNew Button passed");
		
	}
	@And("User fill the signUp information with below data")
	public void UserFillTheSignUpInformationwithBelowData(DataTable dataTable) {
		List<Map<String,String>> SignUpInformation=dataTable.asMaps(String.class, String.class);
		sendText(factory.signInPage().nameInputforCreateAcc, SignUpInformation.get(0).get("name"));
		sendText(factory.signInPage().emailInPutforCreatAcc, SignUpInformation.get(0).get("email"));
		sendText(factory.signInPage().PasswordforCreatAcc, SignUpInformation.get(0).get("password"));
		sendText(factory.signInPage().ConfirmPasswordforCreatAcc, SignUpInformation.get(0).get("confirmPassword"));
		logger.info("User filled the SignUp Information");
	}
	
	@And("User click on SignUp button")
	public void userFillTheSignUpButton() {
		click(factory.signInPage().SignUpButtonforCreatAcc);
		logger.info("UserClick on SignUpBttn");
		
	}
	@Then("User should be logged into account page")
		public void UserShouldBeLoggedIntoAccountPage() {
		Assert.assertTrue(factory.accountPage().ProfileAccountImage.isDisplayed());
		logger.info("profile display");
			
		}
	}
	
	



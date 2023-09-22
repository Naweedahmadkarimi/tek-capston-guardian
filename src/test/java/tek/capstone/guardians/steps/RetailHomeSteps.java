package tek.capstone.guardians.steps;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.guardians.pages.POMFactory;
import tek.capstone.guardians.utilities.CommonUtility;

public class RetailHomeSteps extends CommonUtility{
	private POMFactory factory=new POMFactory();
	
	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homepage().Allsection);
		logger.info("Click on all sectionBar");
	
	}
	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		List<List<String>> shopByDepartment=dataTable.asLists(String.class);	
		for(int i=0; i<shopByDepartment.get(0).size(); i++) {
			Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//div[@class='sidebar__content']//span[text()='"+shopByDepartment.get(0).get(i)+"']"))));
			logger.info("option"+ shopByDepartment.get(0).get(i)+"is displayed");
		}
		
	}

@When("User on {string}")
public void userOn(String department) {
	List<WebElement>departments=factory.homepage().sideBarOptions;
	for(int i=0; i<departments.size(); i++) {
		if(departments.get(i).getText().equalsIgnoreCase(department)) {
			departments.get(i).click();
			break;
		}
	}
	

}
@Then("below options are present in department")
public void belowOptionsArePresentInDepartment(DataTable dataTable) {
	List<List<String>> departmentOptions=dataTable.asLists(String.class);
	List<WebElement>options=factory.homepage().sideBarOptions;
	
	for(int i=1; i<departmentOptions.get(0).size(); i++) {
		for(WebElement elements : options) {
			if(elements.getText().equalsIgnoreCase(departmentOptions.get(0).get(i)));
			Assert.assertTrue(elements.isDisplayed());
			logger.info("The option" + elements.getText()+"is present");
		}
		}
	}
	@When("User on Electronics")
	public void userOnElectronics() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	
    
}

}

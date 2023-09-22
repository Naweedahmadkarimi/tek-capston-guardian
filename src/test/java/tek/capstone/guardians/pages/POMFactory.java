package tek.capstone.guardians.pages;

import tek.capstone.guardians.base.BaseSetup;

public class POMFactory extends BaseSetup {
	private RetailHomePage homepage;
	private RetailSignInPage signInPage;
	private RetailAccountPage accountPage;
	private RetailOrderPage orderPage;

	public POMFactory() {
		this.homepage=new RetailHomePage();
		
	}
	public RetailHomePage homepage() {
		return this.homepage;
	}
	public RetailSignInPage signInPage() {
		return this.signInPage;
	}
	public RetailAccountPage accountPage() {
		return this.accountPage;
	}
	public RetailOrderPage orderPage() {
		return this.orderPage;
	}

}

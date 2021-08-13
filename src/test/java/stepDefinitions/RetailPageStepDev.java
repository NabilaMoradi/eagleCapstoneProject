package stepDefinitions;

import core.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjectRepository.LoginPageObject;
import pageObjectRepository.RetailPageObjects;
import utilites.WebDriverUtility;

public class RetailPageStepDev extends Base {

	
	RetailPageObjects retail = new RetailPageObjects();
	LoginPageObject pageObject = new LoginPageObject();
	
	
	
	
//	@Given("^User is on Retail website$")
//	public void User_is_on_Retail_website() {
//		
//		openBrowser();
//		logger.info("User is on Retail website");
//		WebDriverUtility.screenShot();
//		
//		
//	}


    // @And("^User click on My Account$")
    // public void User_click_on_My_Account() {
    	 
    	// retail.clickOnMyAccount();
    	 
    // }
	
	@When("^User click on ‘Register for an Affiliate Account’ link$")
	public void User_click_on_Register_for_an_affiliate_Account_link() {
		pageObject.clickOnLogin();
		pageObject.clickOnMyAccount();
		retail.clickOnRegisterForAffiliateAccount();
	}
	
	@And("^User fill affiliate form with below information <company>, <website>, <taxID>, <paymentMethod> and <Cheque Payee Name>$")
	public void User_fill_affiliate_from_with_below_information_company_website_taxID_paymentMethod_and_Cheue_Payee_Name() {
		
		retail.enterCompanyName("ABCD");
		retail.enterWebsite("TekSchool");
		retail.enterTaxID("12345");
		retail.enterPaymentMethod("credit cart");
		retail.enterChequePayeeName("firstPayment");
		retail.checkAboutUsCheckbox();
		retail.clickOnContinueButton();
		retail.seeSuccessMessage();
		retail.clickOnEditYourAffiliateInfo();
		retail.clickOnBankTransferRadioButton();
		retail.enterBankName("BOA");
		retail.enterABANumber("123765");
		retail.enterSwiftCode("787899");
		retail.enterAccountName("MyAccountName");
		retail.enterAccountNumber("09876789");
		retail.clickOnEditYourAccountInfo();
		retail.enterFirstName("Ahmad");
		retail.enterLastName("Ali");
		retail.enterTelephone("604-965-9856");
		retail.successMessageMatches();
		
		
	}
	
	
	
}

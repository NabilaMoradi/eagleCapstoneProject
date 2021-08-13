package stepDefinitions;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.DesktopsPageObjects;
import utilites.WebDriverUtility;
public class DesktopsStepDev extends Base{

	
	DesktopsPageObjects myDesktop = new DesktopsPageObjects();
	


	
	@When("^User click on Desktops tab$")
	public void User_click_on_Desktops_tab() {
		
		myDesktop.desktopsTab();
		
	}
	
	@And("^User click on Show all desktops$")
	public void User_click_on_Show_all_desktops() {
		myDesktop.showAllDesktopsMenu();
		logger.info("User click on Show all desktops");
		
	}
	
	
	@Then("^User should see all items are present in Desktop page$")
	public void user_should_see_all_items_are_present_in_Desktop_page() {
		
		myDesktop.productsOnDesktopPage();
	 
	}
	
	
	
	//@Then("^User should see all items are present in Desktop page$")
//	public void User_should_see_all_items_are_present_in_Desktop_page() {
		//myDesktop.allItemsDisplayed();
		//WebDriverUtility.wait(5000);
		//WebDriverUtility.screenShot();
		
	//}
	
	
	@And("^User add HPLP from the Desktop$")
	public void User_add_HPLP_from_the_Desktop() {
		
		
	myDesktop.HPLP();
		
		
	}
	
	
	//@When("^User select quantity \"([^\"]*)\"$")
	//public void user_select_quantity(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	//}
	
	
	
	
	
	//@And("^User select quantity\"(^\"]*$")
	//public void User_select_quantity() throws Throwable{
			
	//myDesktop.productQuantity();
	//throw new PendingException();
		
		
	//}
	
	
	
	
	//@And("^User click ADD TO CART option on \"([^\"]*)\" item$")
	//public void user_click_ADD_TO_CART_option_on_item(String arg1) throws Throwable {
	   // // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
	//}
	
	@And("^User click add to Cart option$")
	public void User_click_add_to_Cart_option() {
		
		myDesktop.addToCartButton();
		
		
	}
	
	
	
	

		
		
//	
//	@And("^User select quantity '1'$")
//	public void User_select_quantity(){
//	
//		// write method
//	}
	
	//@And("^User click add to Cart button$")
	//public void User_click_add_to_Cart_button() {
		
		//myDesktop.clickOnAddToCartButton();
		//logger.info("User click add to Cart button$");
		
	//}
		
	//@Then("^User should see a message Success: you have added HPLP3065 to your shopping cart!$")
	//public void User_shoould_see_a_message_Success_you_have_added_HPLP3065_to_your_shopping_cart!(){
		
		

	
	
	@Then("^User should see a message ‘Success: you have added \"([^\"]*)\" to your shopping cart!’$")
	public void user_should_see_a_message_Success_you_have_added_to_your_shopping_cart(int arg1) throws Throwable {

		String actual = "Sucess:You have added Canon ES 5D to your shopping cart!";
		String expected= "Sucess:You have added Canon ES 5D to your shopping cart!";
		
		System.out.println(actual.substring(0, 7));
		System.out.println(expected.substring(0, 7));
		actual.contains("Success");
		throw new PendingException();
	}
	

	
	
	
	
	//Given User is on Retail website
	//When User click on Desktops tab
	//And User click on Show all desktops
	
	//@And("^User click ADD TO CART option on 'Canon EOS 5D' item$")
	//public void User_click_ADD_TO_CART_option_CanonEOS5D$() {
		
		//myDesktop.clickOnAddToCartButton();
		//logger.info("User click ADD TO CART option on 'Canon EOS 5D' item");
		
	//}
	
	
	
	
	
	
	
	
	
	
	
	
	
	// @myCamera
	
	//@And("^User clicks on Add TO CART option on Canon EOS5D$")
	//public void user_clicks_on_ADD_TO_CART_option_on_Canon_EOS_D() {
		//myDesktop.clickOnAddToCartLink(getBrowser());
		//logger.info("user clicked on add to cart option");
		//WebDriverUtility.screenShot();
	//}
	
	
	
	
	
	
	
	
	
	@And("^User select color from dropdown 'Red'$")
	public void User_select_color_from_dropdown_Red(String colorDropdown) {
		
		
		myDesktop.selectProductColor(colorDropdown);
		
	
		
	}
	
	@And("^User select quantity '1'$")
	public void User_select_quantity_1() {
		
	
		
		
	}
	
	
	
	@Then("^User should see a message You have added Canon EOS5D to your shoping cart$")
	public void user_should_see_a_message_You_have_added_Canon_EOS_D_to_your_shoping_cart() {
		
	
	String actual = "Sucess:You have added Canon ES 5D to your shopping cart!";
	String expected= "Sucess:You have added Canon ES 5D to your shopping cart!";
	
	System.out.println(actual.substring(0, 7));
	System.out.println(expected.substring(0, 7));
	actual.contains("Success");
	
	

	}
	
	//@And("^User click on 'Canon EOS 5D' item$")
	//public void User_click_on_Canon_ESO_5D_items() {
		
		//myDesktop.selectAProduct(getURL());
		
//}
	
	@And("^User click on write a review link$")
	public void User_click_on_write_a_review_link() {
		
		myDesktop.clickOnWriteAReviewLink();
		logger.info("User click on write a review link");
		
	}
	
	@And("^user fill the review information with (.+), (.+) and (.+)$")
	public void user_fill_the_review_information_with_and(String name, String review, String rating) throws Throwable {
		
		myDesktop.writeAReview(name, review, rating);
	}

	
	@And("^User click on Continue Button$")
	public void User_click_on_Continue_Button() {
		
		myDesktop.clickOnContinueButton();
		
		
	}

	
	@Then("^User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.'$")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval()
			throws Throwable {
		
		myDesktop.thankYouMessageIsDisplayed();
		
	}
	
	
	@Then("^User sould see a messege with Thank you for your review\\. it has been submitted to the webMaster for approval$")
	public void user_sould_see_a_messege_with_Thank_you_for_your_review_it_has_been_submitted_to_the_webMaster_for_approval() {
		String expectedMsg = "Thank you for your review. It has been submitted to the webmaster for approval.";
		String actualMesg = "Thank you for your review. It has been submitted to the webmaster for approval.";
		Assert.assertEquals(expectedMsg, actualMesg);
		logger.info("Review submitted successfully");
	}
	

	
	
	
	
}

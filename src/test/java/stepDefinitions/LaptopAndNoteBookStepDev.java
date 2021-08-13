package stepDefinitions;

import core.Base;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.LaptopsNoteBooksPageObject;
import utilites.WebDriverUtility;

public class LaptopAndNoteBookStepDev extends Base{

	
	LaptopsNoteBooksPageObject laptop = new LaptopsNoteBooksPageObject();
	
	
	@When("^User click on Laptops & NoteBooks tab$")
	public void LaptopsAndNoteBookTab() {
		
		laptop.clickonLaptopAndNoteBookTab();
		
	}
	
	
	@When("^User click on Show all Laptops & NoteBooks option$")
	public void user_click_on_Show_all_Laptops_NoteBooks_option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		laptop.clickOnShowAllLaptopsAndNoteBooks();
	    throw new PendingException();
	}
	
	

		
	@And("^User clicks on 'MacBook' item&")
	public void User_click_on_MacBook_item() {
		
		laptop.clickOnMacBookItem();
	}
	
	@And("^User click Add to Cart button$")
	public void User_click_Add_to_to_Cart_button() {
		
		laptop.clickOnAddToCartMacBook();
		
	}
	
	@Then("^User should see a message ‘Success: You have added 'MacBook' to your shopping cart!’$")
	public void User_should_see_a_message_Success_You_have_added_MacBook_to_your_shopping_cart() {
		
		
	}
		@Then("^User should see a message ‘Success: You have added \"([^\"]*)\" to your shopping cart!’$")
		public void user_should_see_a_message_success_you_have_added_something_to_your_shopping_cart(String strArg1)
				throws Throwable {
			String successMessage = "Success: You have added " + strArg1 + " to your shopping cart!";
			
			//laptop.VerifyMessageIsDisplayed(successMessage);
			laptop.VerifyMessageIsDisplayed();
		
			//@Then("^User should see a message ‘Success: You have added MacBook to your shopping cart!’$")
			//public void user_should_see_a_message_Success_You_have_added_MacBook_to_your_shopping_cart()  {
			  // String actual ="Success: You have added MacBook to your shopping cart!";
			  // String expected ="Success: You have added MacBook to your shopping cart!";
			  // actual.contains("Success");
			 //  expected.contains("Success");
			//}
					
			
	}
	
		@Then("^User should see \"([^\"]*)\" showed to the cart$")
		public void user_should_see_showed_to_the_cart(String arg1) {
		  
		}
		
	
		@Then("^User click on cart option$")
		public void user_click_on_cart_option()  {
			laptop.clickOnCartTotal();
			logger.info("user cliked on cart option");
		   
		}
		@Then("^user click on red X button to remove the item from cart$")
		public void user_click_on_red_X_button_to_remove_the_item_from_cart()  {
			laptop.clickOnRemoveButton();
			logger.info("user clicked on red X button to remove the item from cart");
		}
	// problem
		@Then("^item should be removed and cart should show \"([^\"]*)\"$")
		public void item_should_be_removed_and_cart_should_show(String arg1) throws Throwable {
		 
			laptop.clickOnRemoveButton();
			 throw new PendingException();
		}
		
//		2
		
		@And("^User click on product comparison icon on ‘MacBook’$")
		public void user_click_on_product_comparison_icon_on_MacBook()  {
			laptop.clickOnCompareMacBook();
			logger.info("User click on product comparison icon on ‘MacBook’");
			
			
		}
		@When("^User click on product comparison icon on ‘MacBook Air$")
		public void user_click_on_product_comparison_icon_on_MacBook_Air()  {
			laptop.clickOnMacBookAirCompare();
			logger.info("User click on product comparison icon on ‘MacBook’");
		}
		
		// how to call success message method here
		@Then("^User should see a message ‘Success: You have added MacBook Air to your product comparison!’$")
		public void user_should_see_a_message_Success_You_have_added_MacBook_Air_to_your_product_comparison()  {
			
			logger.info("User should see a message ‘Success: You have added MacBook Air to your product comparison!’");
			WebDriverUtility.screenShot();
		}
		@Then("^User click on Product comparison link$")
		public void user_click_on_Product_comparison_link()  {
			laptop.clickOnCompareLink();
			logger.info("user clicked on product comparison");
		}
		// how to call method here
		
		@Then("^User should see Product Comparison Chart$")
		public void user_should_see_Product_Comparison_Chart()  {
		
			logger.info("User should see Product Comparison Chart");
		  
		}
//		3
		@When("^User click on heart icon to add ‘Sony VaIO’ laptop to wish list$")
		public void user_click_on_heart_icon_to_add_Sony_VaIO_laptop_to_wish_list()  {
			laptop.clickOnSonyVaioWishList();
			logger.info("user clicked on heart icon to add ‘Sony VaIO’ laptop to wish list" );
		}
		@Then("^User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’$")
		public void user_should_get_a_message_You_must_login_or_create_an_account_to_save_Sony_VAIO_to_your_wish_list()  {
			  String expectedMessage = "You must login or create an account to save Sony VAIO to your wish list!";
			  String actualMessage = laptop.verifyLoginMessageIsDisplayed();
			
			  
			}
//		4
		@When("^User click on ‘MacBook Pro’ item$")
		public void user_click_on_MacBook_Pro_item()  {
			laptop.clickOnMacBookPro();
			logger.info("User click on ‘MacBook Pro’ item");
		   
		}
		@Then("^User should see  \"([^\"]*)\" price tag is present on UI$")
		public void User_should_see__price_tag_is_present_on_UI(String expectedPrice) {
			laptop.tagPriceOfMacIsDisplayed();
			WebDriverUtility.screenShot();
			String actualPrice = laptop.toString();
			System.out.println(actualPrice);
//			String expectedPrice=lapNBook.tagPriceOfMacIsDisplayed();
		
			//capture the price that macbook through your code
			//Assert the price macbood that receive from you code to the price that your passing from feature file
			logger.info("User see the price tag present on UI");
		}

		
	
	
		
	}
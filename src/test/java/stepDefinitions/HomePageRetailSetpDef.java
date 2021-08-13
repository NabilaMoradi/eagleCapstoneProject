package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectRepository.HomePageRetial;

public class HomePageRetailSetpDef extends Base{

	HomePageRetial homePage= new HomePageRetial();
	
	
	@When("^User click on Currency$")
	public void User_click_on_Currency() {
		
		homePage.currencyOption();
		
		
	}
	
	
	@And("^User Chose Euro from dropdown$")
	public void User_Chose_Euro_from_dropdown() {
		
		homePage.EuroCurrency();
		
	}
	
	
	@And("^currency value should change to Euro$")
	public void Currency_value_should_change_to_Euro(WebElement EuroCurrency) {
		
		Select select = new Select(EuroCurrency);
		
		select.selectByVisibleText("Eurro");
		
		
		
	}
		
		
	@When("^User click on shopping cart")
	public void User_click_on_shopping_cart() {
		
		homePage.shoppingCart();
		
	}
	
	//@Then("^Your shopping cart is empty!” message should display$")
	//public void Your_shopping_cart_is_empty_message_shou_display(String strArg1) {
		
		//String mesg= "Your shopping cart is empty!"+strArg1+"message should display";
			
		//homePage.messageShopping();
		//System.out.println(mesg+strArg1);
		
	
	
	@Then("^“Your shopping cart is empty!” message should display$")
	public void your_shopping_cart_is_empty_message_should_display() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


	
}

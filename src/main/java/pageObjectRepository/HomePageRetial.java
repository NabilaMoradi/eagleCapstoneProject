package pageObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilites.WebDriverUtility;

public class HomePageRetial extends Base {

	public HomePageRetial() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	

	@FindBy(xpath="//span[text()='Currency']")
	private WebElement currencyOption;
	
	
	@FindBy(xpath="//button[text()='€ Euro']")
	private WebElement EuroCurrency;
	
	@FindBy(xpath="//span[text()='Shopping Cart']")
	private WebElement shoppingCart;
	
	@FindBy(xpath="//body/div[@id='error-not-found']/div[1]/div[1]/p[1]")
	private WebElement messageShopping;
	
	
	
	public void currencyOption() {
		
		WebDriverUtility.clickOnElement(currencyOption);
		
		
	}
	
	public void EuroCurrency() {
		
		WebDriverUtility.clickOnElement(EuroCurrency);
		
	}
	
	public void shoppingCart() {
		
		WebDriverUtility.clickOnElement(shoppingCart);
		
	}
	
	public void messageShopping() {
		
		WebDriverUtility.clickOnElement(messageShopping);
		
	}
	
	
}

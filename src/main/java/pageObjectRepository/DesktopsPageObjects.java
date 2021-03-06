package pageObjectRepository;

import java.util.List;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import utilites.WebDriverUtility;

public class DesktopsPageObjects extends Base  {

	public DesktopsPageObjects() {
		PageFactory.initElements(driver, this);
	}

	// locators

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopsTab;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktopsMenu;

	
	@FindBy(xpath="//div[@class='collapse navbar-collapse navbar-ex1-collapse']")
	private WebElement productOnDesktop;
	
	
	@FindBy(xpath="//a[contains(text(),'HP LP3065')]")
	private WebElement HPLH;
	
	

	//@FindAll({ @FindBy(xpath = "//button[contains(@onclick, 'cart.add')]") })
	//private List<WebElement> addToCartLinks;

	@FindBy(id = "input-quantity")
	private WebElement productQuantity;
	
	
	

	@FindBy(css = "button[id='button-cart']")
	private WebElement addToCartButton;

	
	
	@FindBy(css = "div[class='alert alert-success alert-dismissible']")
	private WebElement successAlert;

	@FindBy(id = "input-option226")
	private WebElement colorDropdown;

	@FindBy(how = How.XPATH, using = "//a[text()='Write a review']")
	private WebElement writeAReview;

	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement reviewerName;

	@FindBy(css = "textarea[id='input-review']")
	private WebElement review;

	@FindAll({ @FindBy(xpath = "//input[contains(@type, 'radio') and contains(@name, 'rating')]") })
	private List<WebElement> rating;

	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement continueButton;

	@FindBy(xpath = "//div[text() =' Thank you for your review. It has been submitted to the webmaster for approval.']")
	private WebElement thankYouMessage;

	

	// methods

	public void desktopsTab() {
		
		WebDriverUtility.clickOnElement(desktopsTab);
		
		
	}
	
	
	//public void clickOnDesktopsTab() {
	//	if (desktopsTab.isDisplayed()) {
		//	desktopsTab.click();
		//	logger.info("Clicked on 'Desktops' tab.");
		//} else {
			//logger.error("'Desktops' tab was not displayed.");
	//	}

	//}

	
	public void showAllDesktopsMenu() {
		
		
		WebDriverUtility.clickOnElement(showAllDesktopsMenu);
	}
	
	
	
	
	
	
	//public void clickOnShowAllDesktopsMenu() {
		//if (showAllDesktopsMenu.isDisplayed()) {
			//showAllDesktopsMenu.click();
			//logger.info("Clicked on 'Show All Desktops' menu.");
		//} else {
		//	logger.error("'Show All Desktops' tab was not displayed.");
		//}
	//}

	
	
	
	public void productsOnDesktopPage() {
		
		WebDriverUtility.clickOnElement(productOnDesktop);
	}
	
	
		
	
	
	//public boolean allItemsDisplayed() {
		//for (int i = 0; i < productsOnDesktopPage.size(); i++) {
			//if (!productsOnDesktopPage.get(i).isDisplayed()) {
			//	logger.error("All items were not displayed.");
				//return false;
		//	}
	//	}
	///	logger.info("All items were displayed.");
	//	return true;
	//}

	
	
	public void HPLP() {
		
		WebDriverUtility.clickOnElement(HPLH);
		
		
	}
	
	
	
	
	
	
	
	

	
//		for (int i = 0; i < productsOnDesktopPage.size(); i++) {
//			if (productsOnDesktopPage.get(i).getText().equalsIgnoreCase(product)) {
//				if (productsOnDesktopPage.get(i).isDisplayed()) {
//					addToCartLinks.get(i).click();
//					logger.info(product + " was added to the cart.");
//				} else {
//					logger.error(product + " could not be added to the cart.");
//				}
//			}
//		}

	
	
	
	public void productQuantity() {
		
		
		WebDriverUtility.clickOnElement(productQuantity);
		
		
	}

	//public void enterProductQuantity(String quantity) {
		//for (int j = 0; j <= 2; j++) {
		//	try {
				//productQuantity.clear();
				//productQuantity.sendKeys(quantity);
				//logger.info(quantity + " quantities was added to the cart.");
		//	} catch (Exception e) {
			//	logger.error(e.getMessage());
			//	logger.info("Try # " + j + 1 + ": refreshed the webpage.");
		//		driver.navigate().refresh();
		//	}
		//}

	
	
	
//		if (productQuantity.isDisplayed()) {
//			productQuantity.clear();
//			productQuantity.sendKeys(quantity);
//			logger.info(quantity + " quantities was added to the cart.");
//		} else {
//			logger.error("Quantity field was not displayed.");
//		}

	

	public void addToCartButton() {
		
		WebDriverUtility.clickOnElement(addToCartButton);
		
		
		
	}
	
	
	//public void clickOnAddToCartButton() {
	//	for (int j = 0; j <= 2; j++) {
		//	try {
			//	addToCartButton.click();
			//	logger.info("Clicked on 'Add to Cart' button.");
		//	} catch (Exception e) {
				
			//	WebDriverUtility.wait(2000);
			//	logger.error(e.getMessage());
			//	logger.info("Try # " + j + 1 + ": refreshed the webpage.");
				//driver.navigate().refresh();
			//}
		//}

	
	
//		if (addToCartButton.isDisplayed()) {
//			addToCartButton.click();
//			logger.info("Clicked on 'Add to Cart' button.");
//		} else {
//			logger.error("'Add to Cart' button was not displayed.");
//		}
	//}

	
	
	
	public String successAlertIsDisplayed(String successMessage) {
		return successMessage;

	
		
		
		
		
		
		

//		String message = "";
//
//		
//		for (int i = 0; i < successAlert.getText().length() - 2; i++) {
//			message += successAlert.getText().charAt(i);
//		}
//		if (message.equals(successMessage)) {
//			logger.info("Success message was displayed and matches.");
//			return true;
//		}
//		logger.error("Success message was not displayed or is incorrect.");
//		return false;
	}

public void selectProductColor(String color) {
		Select object = new Select(colorDropdown);

		for (int j = 0; j <= 2; j++) {
			try {
				object.selectByVisibleText(color);
				//logger.info(color + " color was selected.");
			} catch (Exception e) {
				logger.error(e.getMessage());
			logger.info("Try # " + j + 1 + ": refreshed the webpage.");
			driver.navigate().refresh();
			}
		}

		
		
		
		
		
		
//		Select object = new Select(colorDropdown);
//		if (colorDropdown.isDisplayed()) {
//			object.selectByVisibleText(color);
//			logger.info(color + " color was selected.");
//		} else {
//			logger.error("Color dropdown was not displayed.");
//		}
	}

	public void clickOnWriteAReviewLink() {
		for (int j = 0; j <= 2; j++) {
			try {
				writeAReview.click();
				logger.info("Clicked on 'Write a Review' link.");
			} catch (Exception e) {
				logger.error(e.getMessage());
				logger.info("Try # " + j + 1 + ": refreshed the webpage.");
				driver.navigate().refresh();
			}
		}

//		if (writeAReview.isDisplayed()) {
//			writeAReview.click();
//			logger.info("Clicked on 'Write a Review' link.");
//		} else {
//			logger.error("'Write a Review' link was not displayed.");
//		}
	}

	public void writeAReview(String name, String review, String rating) {
		int ratingNumber = Integer.valueOf(rating) - 1;
		if (reviewerName.isDisplayed()) {
			reviewerName.sendKeys(name);
			logger.info("Entered reviewer name in 'Your Name' field.");
		} else {
			logger.error("'Your Name' field was not displayed.");
		}

		if (this.review.isDisplayed()) {
			this.review.sendKeys(review);
			logger.info("Entered review text in 'Your Review' field.");
		} else {
			logger.error("'Your Review' field was not displayed.");
		}

		for (int i = 0; i < this.rating.size(); i++) {
			if (this.rating.get(i).isDisplayed()) {
				if (ratingNumber == i) {
					this.rating.get(i).click();
					logger.info("'Rating' radio button was selected.");
				}
			} else {
				logger.error("'Rating' radio buttons were not displayed.");
			}
		}
	}

	public void clickOnContinueButton() {
		if (continueButton.isDisplayed()) {
			continueButton.click();
			logger.info("Clicked on 'Continue' button.");
		} else {
			logger.error("'Continue' button was not displayed.");
		}
	}

	public boolean thankYouMessageIsDisplayed() {

		for (int j = 0; j <= 2; j++) {
			try {
				if (thankYouMessage.getText()
						.contains("Thank you for your review. It has been submitted to the webmaster for approval.")) {
					logger.info("Thank you message was displayed.");
					return true;
				}
			} catch (Exception e) {
				logger.error(e.getMessage());
				logger.info("Try # " + j + 1 + ": refreshed the webpage.");
				driver.navigate().refresh();
			}
		}
		logger.error("Thank you message was not displayed.");
		return false;

//		if (thankYouMessage.getText()
//				.contains("Thank you for your review. It has been submitted to the webmaster for approval.")) {
//			logger.info("Thank you message was displayed.");
//			return true;
//		}
//		logger.error("Thank you message was not displayed.");
//		return false;
	}
}

package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCategory {

	WebDriver driver;
	
	public AddCategory(WebDriver driver) {
		
		
	}
	//Element Library
	@FindBy(how = How.NAME, using = "categorydata") WebElement CATEGORY_DATA_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@value = 'Add category']") WebElement ADD_CATEGORY_LOCATOR;
	
	//Interactive method
	public void EnterCategory(String Aprill2020) {
		CATEGORY_DATA_LOCATOR.sendKeys(Aprill2020);
		
	}
	
	public void clickOnAddCategory() {
		ADD_CATEGORY_LOCATOR.click();
	}
	
}

package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveAllItems {

	WebDriver driver;
	
	public RemoveAllItems(WebDriver driver) {
		this.driver=driver;
	
	}
	
	//Element Library
	@FindBy(how = How.NAME, using = "allbox") WebElement TOOGLE_CHECKBOX_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@value ='Remove']") WebElement REMOVE_FIELD_LOCATOR;
	
	// INTERACTIVE methods
	
	public void clickOnToogleAll() {
		TOOGLE_CHECKBOX_LOCATOR.click();
		
	}
	
	public void clickOnRemove() {
		REMOVE_FIELD_LOCATOR.click();
	}
}

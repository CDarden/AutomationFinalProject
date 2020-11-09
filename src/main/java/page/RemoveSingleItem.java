package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveSingleItem {

	WebDriver driver;
	
	public RemoveSingleItem(WebDriver driver) {
		this.driver = driver;
	}
	//Element Library
	@FindBy(how = How.NAME, using = "todo[2]") WebElement CHECK_LIST_LOCATOR;
	@FindBy(how = How.XPATH, using = "//input[@value ='Remove']") WebElement REMOVE_BUTTON_LOCATOR;
	
	//interactive Methods
	public void removeSingleItem() {
		CHECK_LIST_LOCATOR.click();
		REMOVE_BUTTON_LOCATOR.click();
	}
	
}

package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValidateToggleall {

	WebDriver driver;
	public ValidateToggleall(WebDriver driver){
		this.driver= driver;
	}
		
		@FindBy(how = How.NAME, using = "allbox") WebElement LOCATOR;
	
	public void clickOnToggleall() {
		LOCATOR.click();
		
	}
	
	
}

package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public void waitforElement(WebDriver driver, int timeInSeconds, WebElement element) {
		// creating an explicit wait in a method
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void selectDropDown(WebElement element, String visibleString) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleString);
		
	}
	
	
	
	
	
	
	
	
}

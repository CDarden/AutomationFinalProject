package page;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValidateAddCategory {

WebDriver driver;
	
	//create a constructor
	public ValidateAddCategory(WebDriver driver) {
		this.driver=driver;
		
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
	
	
	public void ValidateByScreenShot(WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)(driver);
		File SourceFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SourceFile, new File("C:\\Users\\14435\\screenshot4.png"));
	}
	
}

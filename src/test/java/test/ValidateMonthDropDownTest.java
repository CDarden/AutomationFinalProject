
package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import page.ValidateMonthDropDown;
import util.BrowserFactory;

public class ValidateMonthDropDownTest {

	WebDriver driver;
	@Test
	public void ValidateMonthDropDownHasJanFedMarch() throws IOException {
		
		driver = BrowserFactory.launchBrowser();
		
		ValidateMonthDropDown monthdropdown  = PageFactory.initElements(driver, ValidateMonthDropDown.class);
		monthdropdown.clickOnDueMonth();
		monthdropdown.selectFirstMonth("Jan");
		monthdropdown.selectSecondMonth("Feb");
		monthdropdown.selectThirdMonth("March");
	
		TakesScreenshot ts = (TakesScreenshot)(driver);
		File SourceFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SourceFile, new File("C:\\Users\\14435\\screenshot2.png"));
		
	}
	
	
	
}

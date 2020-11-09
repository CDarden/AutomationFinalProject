package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ValidateToggleall;
import util.BrowserFactory;

public class ValidateToggleallTest {

	WebDriver driver;
	
	@Test
	public void UserShouldBeAbleToClickOnTheCheckBoxForToggleall() throws IOException {
		
	
	driver = BrowserFactory.launchBrowser();
	
	ValidateToggleall validate = PageFactory.initElements(driver, ValidateToggleall.class);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	validate.clickOnToggleall();
	
	TakesScreenshot ts = (TakesScreenshot)(driver);
	File SourceFile = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(SourceFile, new File("C:\\Users\\14435\\screenshot.png"));
	
	
	
	}
	
	
	
}

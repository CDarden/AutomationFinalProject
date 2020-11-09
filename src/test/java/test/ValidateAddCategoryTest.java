package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import page.ValidateAddCategory;
import util.BrowserFactory;

public class ValidateAddCategoryTest {
	WebDriver driver;
	@Test
	public void UserNotAbleToAddDublicateCategory() throws IOException {
		
		driver = BrowserFactory.launchBrowser();
		
		ValidateAddCategory add = PageFactory.initElements(driver, ValidateAddCategory.class);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		add.EnterCategory("Aprill2020");
		add.clickOnAddCategory();
		System.out.println("The category you want to add already exists: April2020.");
		
		add.ValidateByScreenShot(driver);
		
		
	}
	
	
}

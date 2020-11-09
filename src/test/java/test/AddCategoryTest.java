package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.AddCategory;
import util.BrowserFactory;

public class AddCategoryTest {

	WebDriver driver;
	@Test
	public void UserShouldBeAbleToAddACategoryAndDisplayed() {
		
		driver = BrowserFactory.launchBrowser();
		
		AddCategory add = PageFactory.initElements(driver, AddCategory.class);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		add.EnterCategory("Aprill2020");
		add.clickOnAddCategory();
		
	}
	
	
}

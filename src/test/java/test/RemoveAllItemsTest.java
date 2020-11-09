package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.RemoveAllItems;
import util.BrowserFactory;

public class RemoveAllItemsTest {

	WebDriver driver;

	@Test
	public void UserShouldBeAbleToRemoveAllItemsFromList() {
	
	driver = BrowserFactory.launchBrowser();
	
	RemoveAllItems removeall = PageFactory.initElements(driver, RemoveAllItems.class);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	removeall.clickOnToogleAll();
	removeall.clickOnRemove();
}
	
	
	
	
	
}

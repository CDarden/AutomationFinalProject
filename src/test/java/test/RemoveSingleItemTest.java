package test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import page.RemoveSingleItem;
import util.BrowserFactory;

public class RemoveSingleItemTest {

WebDriver driver;

	@Test
	public void UserShouldBeAbleToRemoveASingleItemFromList() {
	
	driver = BrowserFactory.launchBrowser();
	
	RemoveSingleItem remove = PageFactory.initElements(driver, RemoveSingleItem.class);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	remove.removeSingleItem();
}
	
	
	
}

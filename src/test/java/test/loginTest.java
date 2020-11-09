package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import page.LoginPage;
import util.BrowserFactory;

public class loginTest {


	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbleToLogin() {
		//calling the browser method to launch the page and creating a variable
		driver = BrowserFactory.launchBrowser();
		
		// create an object to forward the driver from BrowserFactory class to loginpage we use pagefactory.initElements
		LoginPage Login = PageFactory.initElements(driver, LoginPage.class);
		
		
		// calling the teardown method from browserFactory class
		//BrowserFactory.tearDown();
	}
	
	
	
	
	
	
}

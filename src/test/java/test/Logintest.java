package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.loginpage;
import util.BrowserFactory;


public class Logintest {
	WebDriver driver;
	@Test
	public void Luanch() {
		driver = BrowserFactory.LaunchBrowser();
		loginpage login = PageFactory.initElements(driver, loginpage.class);
		login.ValidUser("demo@techfios.com");
		login.passwrd("abc123");
		login.enter();
			
	
	
	
	
	
	}

}

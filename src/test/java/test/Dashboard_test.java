package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.DashBoardpage;
import Page.loginpage;
import util.BrowserFactory;

public class Dashboard_test {
	WebDriver driver;
	@Test
	public void Luanch() {
		driver = BrowserFactory.LaunchBrowser();
		loginpage login = PageFactory.initElements(driver, loginpage.class);
		login.ValidUser("demo@techfios.com");
		login.passwrd("abc123");
		login.enter();
			
		DashBoardpage dashpg=PageFactory.initElements(driver, DashBoardpage.class);
	dashpg.Dashboard_Locator.click();
	dashpg.Customers_Locator.click();
	dashpg.Companies_Locator.click();
	dashpg.Transactions_Locator.click();
	dashpg.Sales_Locator.click();
	dashpg.orders_Locator.click();
	dashpg.Documents_Locator.click();
	dashpg.Calendar_Locator.click();
	dashpg.Bank_Cash_Locator.click();
	dashpg.Product_services_Locator.click();
	dashpg.Reports_Locator.click();
	dashpg.Utilities_Locator.click();
	dashpg.Appearence_Locator.click();
	dashpg.Plugins_Locator.click();
	dashpg.Settings_Locator.click();
}
}
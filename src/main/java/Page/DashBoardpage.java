package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashBoardpage extends basepage {
	WebDriver driver;
	
	public  DashBoardpage(WebDriver driver) {
		this.driver=driver;
			}
   @FindBy(how=How.XPATH,using="//span[contains(text(),'Dashboard')]")
public
   WebElement Dashboard_Locator;
   @FindBy(how=How.XPATH,using="//span[contains(text(),'Customers')]")
  public WebElement Customers_Locator;
   @FindBy(how=How.XPATH,using="//span[contains(text(),'Companies')]")
   public WebElement Companies_Locator;
   @FindBy(how=How.XPATH,using="//span[contains(text(),'Transactions')]")
   public WebElement Transactions_Locator;
   @FindBy(how=How.XPATH,using="//span[contains(text(),'Sales')]")
   public WebElement Sales_Locator;
   @FindBy(how=How.XPATH,using="//span[contains(text(),'Orders')]")
   public WebElement orders_Locator;
   @FindBy(how=How.XPATH,using="//span[contains(text(),'Documents')]")
   public WebElement Documents_Locator;
   @FindBy(how=How.XPATH,using="//span[contains(text(),'Calendar')]")
   public  WebElement Calendar_Locator;
   @FindBy(how=How.XPATH,using="//span[contains(text(),'Bank & Cash')]")
   public WebElement Bank_Cash_Locator;
   @FindBy(how=How.XPATH,using="//span[contains(text(),'Products & Services')]")
   public WebElement Product_services_Locator;
   @FindBy(how=How.XPATH,using="//span[contains(text(),'Reports ')]")
   public WebElement Reports_Locator;
   @FindBy(how=How.XPATH,using="//span[contains(text(),'Utilities ')]")
   public WebElement Utilities_Locator;
   @FindBy(how=How.XPATH,using="//span[contains(text(),'Appearance ')]")
   public  WebElement Appearence_Locator;
   @FindBy(how=How.XPATH,using="//span[contains(text(),'Plugins')]")
   public WebElement Plugins_Locator;
   @FindBy(how=How.XPATH,using="//span[contains(text(),'Settings ')]")
   public WebElement Settings_Locator;


public void Dash_Element() {
	Dashboard_Locator.click();
}
public void Customers_Element() {
	Customers_Locator.click();
}
public void Companies_Element() {
	Companies_Locator.click();
}
public void Transactions_Element() {
	Transactions_Locator.click();
}
public void Sales_Element() {

	Sales_Locator.click();
}
public void orders_Element() {
	orders_Locator.click();
}
public void documents_Element() {
	Documents_Locator.click();
}
public void Calendar_Element() {
	Calendar_Locator.click();
}
public void Bank_cash_Element() {
	Bank_Cash_Locator.click();
}
public void Product_services_Element() {
	Product_services_Locator.click();
}
public void Reports_Element() {
	Reports_Locator.click();
}
public void Utilities_Element() {
	Utilities_Locator.click();
}
public void Apperence_Element() {
	Appearence_Locator.click();
}
public void plugins_Element() {
	Plugins_Locator.click();
}
public void Settings_Element() {
	Settings_Locator.click();
}









}

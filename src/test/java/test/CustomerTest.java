package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page.CustomerPage;
import Page.Xlreader;
import Page.loginpage;
import util.BrowserFactory;

public class CustomerTest {
	WebDriver driver;
	//String path =".\\data\\Add_customers.xlsx\";
	Xlreader reader= new Xlreader();
	String Full_name= reader.getCellData("Customer1", "Full_name", 2);
	String Company_Element= reader.getCellData("Customer1", "Company_Element", 2);
	String emailElement= reader.getCellData("Customer1", "emailElement", 2);
	String Phone_Element= reader.getCellData("Customer1", "Phone_Element", 2);
	String Address_Element= reader.getCellData("Customer1", "Address_Element", 2);
	String City_Element= reader.getCellData("Customer1", "City_Element", 2);
	String StateELement= reader.getCellData("Customer1", "StateELement", 2);
	String Zip_Element= reader.getCellData("Customer1", "Zip_Element", 2);
	String Country_Element= reader.getCellData("Customer1", "Country_Element", 2);
	String Tags= reader.getCellData("Customer1", "Tags", 2);
	String CurrencyElement= reader.getCellData("Customer1", "CurrencyElement", 2);
	String Group_Element= reader.getCellData("Customer1", "Group_Element", 2);
	String PasswordElement= reader.getCellData("Customer1", "PasswordElement", 2);
	String ConfirmPasswordElement= reader.getCellData("Customer1", "ConfirmPasswordElement", 2);
	
	
		
	public void Luanch(Object email) {
		driver = BrowserFactory.LaunchBrowser();
		loginpage login = PageFactory.initElements(driver, loginpage.class);
		login.ValidUser("demo@techfios.com");
		login.passwrd("abc123");
		login.enter();
			
		CustomerPage customerpage =PageFactory.initElements(driver, CustomerPage.class);
		
		  customerpage.CustomerElement(); 
		  customerpage.AddCustomerElement();
		  customerpage.ListCustomerElement();
		  customerpage.Groups_Element();
		  customerpage.Full_name(Full_name); 
		  customerpage.Company_Element(Company_Element);
		  customerpage.email_Element(emailElement);
		  customerpage.Phone_Element(Phone_Element);
		  customerpage.Address_Element(Address_Element); 
		  customerpage.City_Element(City_Element);
		  customerpage.StateELement(StateELement);
		  customerpage.Zip_Element(Zip_Element);
		  customerpage.Country_Element(Country_Element); 
		  customerpage.Tags(Tags);
		  customerpage.CurrencyElement(CurrencyElement); 
		  customerpage.Group_Element(Group_Element);
		  customerpage.PasswordElement(PasswordElement);
		  customerpage.ConfirmPasswordElement(ConfirmPasswordElement);
		 
		customerpage.saveElement();
		customerpage.importContactElement();
		
				
		
	}

}

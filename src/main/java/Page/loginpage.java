package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpage {
	WebDriver driver;
	
	public loginpage(WebDriver driver) {
	this.driver=driver;
	
}

		@FindBy(how=How.XPATH,using="//input[@id='username']")
		public WebElement Username;
		@FindBy(how=How.XPATH,using="//input[@id='password']")
	public	WebElement Password;
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	WebElement signin;
	
	
	public void ValidUser(String username) {
		Username.sendKeys(username);
	}
	public void passwrd(String password) {
		Password.sendKeys(password);
	}
	public void enter() {
		
		signin.click();
	
	
	
	
	}
	
}

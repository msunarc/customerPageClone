package Page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basepage {
	
  public static void waitforElement(WebDriver driver,int timeInSeconds, By locator) {
	  WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
  
  }
	
	
	public static void dropDown(WebElement string ,String visibleText) {
     Select sel = new Select(string);
     sel.selectByVisibleText(visibleText);
	}
	

	public static int randomNumGenerator(String webElement, String visibleText) {
		Random rnd = new Random();
		int randomNum=rnd.nextInt(999);
		return randomNum;
	}
}

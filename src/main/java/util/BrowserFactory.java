package util;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserFactory {
 public static WebDriver driver;
 

 public static WebDriver LaunchBrowser() {
	 System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("http://www.techfios.com/ibilling/?ng=admin/");
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 return driver;
	 
 }
 
// public teardown() {
//	 driver
// }
}

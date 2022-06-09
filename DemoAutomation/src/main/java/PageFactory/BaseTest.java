package PageFactory;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Utility.ReusableMethods;


public class BaseTest {
	
	public WebDriver driver;
	
	public WebDriver initialiseBrowser() {
		
		if(ReusableMethods.getConfigValue("Browser").equalsIgnoreCase("chrome"))
		  driver=ReusableMethods.initialiseChrome();
		
		return driver;
	}
	
	public void launchUrl() {
		//Launch base url
		driver.get(ReusableMethods.getConfigValue("Url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	
	public void quitBrowser() {
		driver.quit();
	}
}

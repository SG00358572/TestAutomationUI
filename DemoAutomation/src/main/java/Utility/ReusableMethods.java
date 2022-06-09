package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReusableMethods {
	
	private WebDriver _driver;
	
	public ReusableMethods(WebDriver driver) {
		_driver= driver;
	}

	public static Properties loadPropertiesFile() {
		Properties prop=new Properties();;
		try {
			String projectPath = System.getProperty("user.dir").toString();
			FileInputStream file = new FileInputStream(projectPath + "\\src\\main\\java\\Config\\Settings.properties");
			prop.load(file);
		}
		catch(Exception e) {
			System.out.println("");
		}	
		return prop;
	}
	
	public static String getConfigValue(String key) {
		
		Properties prop= loadPropertiesFile();
		String value=prop.getProperty(key);
		return value;
	}
	
	public static WebDriver initialiseChrome() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + getConfigValue("ChromeDriverPath"));
		WebDriver driver=new ChromeDriver();
		return driver;
	}
	
	public void elementOperations(WebElement ele,String type,String value) {
		try {
			if(type.equalsIgnoreCase("click")) {
				ele.click();
			}
			else if(type.equalsIgnoreCase("sendkeys")) {
				ele.sendKeys(value);
			}
		}
		catch(Exception e) {
			
		}		
	}
	
	public String getPageTitle() {
		String title=_driver.getTitle().toString();
		return title;
	}
	
	
	
}

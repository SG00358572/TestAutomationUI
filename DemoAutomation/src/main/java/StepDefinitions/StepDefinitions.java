package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import PageFactory.BaseTest;
import Utility.ReusableMethods;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import junit.framework.Assert;

public class StepDefinitions {
	
	public WebDriver driver;
	public ReusableMethods reusable;
	BaseTest test;
	
	@Before
	public void setUp() {		
		
		//Initialise browser
		test=new BaseTest();
		driver=test.initialiseBrowser();
		
		//Launch Application Url
		test.launchUrl();		
		
		//Creating object of reusable class
		reusable=new ReusableMethods(driver);
				
	}

	@After
	public void tearDown() {
		
		test.quitBrowser();
	}
	
	@Given("^User lands on ANZ home page$")
	public void user_lands_on_ANZ_home_page(){
	    
		System.out.println("Inside setp def");
		Assert.assertEquals("ANZ Personal – Bank accounts, home loans, credit cards & more | ANZ", reusable.getPageTitle()); 
	}

}

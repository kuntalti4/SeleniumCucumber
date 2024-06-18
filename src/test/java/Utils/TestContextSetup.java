package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObject.LandingPage;
import pageObject.PageObjectManager;

public class TestContextSetup {
	
	public WebDriver driver;
	public String Prodname1;
	public PageObjectManager pageobjectmanager;
	public WebDriverManager webdrivermanager;
	public GenericUtils genericutils;
	public LandingPage landingPage;
	
	
	
	public TestContextSetup() throws IOException
	{
		webdrivermanager= new WebDriverManager();
		pageobjectmanager= new PageObjectManager(webdrivermanager.getWebDriverManager());
		genericutils= new GenericUtils(webdrivermanager.getWebDriverManager());
		landingPage= new LandingPage(webdrivermanager.getWebDriverManager());
	}

}

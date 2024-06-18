package StepDefinitions;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {
	
	
TestContextSetup testcontext;
WebDriver driver;
	
	public Hooks(TestContextSetup testcontext) throws IOException
	{
		this.testcontext= testcontext;
		this.driver= testcontext.webdrivermanager.getWebDriverManager();
	}
	
	@After
	public void CloseBrower() throws IOException
	
	{
		driver.quit();
	}
	
	@AfterStep
	public void AddScreenShot(Scenario scenario) throws IOException
	
	{
		
		File sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] filebyte=FileUtils.readFileToByteArray(sourcepath);
		scenario.attach(filebyte, "image/png", "image");
		
	}

}

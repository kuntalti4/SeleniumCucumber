package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverManager {
	
	WebDriver driver;
	
	
	
	public WebDriver getWebDriverManager() throws IOException
	{
		
		  Properties prop= new Properties(); 
		  FileInputStream fis= new
		  FileInputStream(System.getProperty("user.dir")+"/src/test/resources/global.properties"); 
		  prop.load(fis);
		 
		if(driver==null)
		{
			
			  if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe"); 
			  driver=new ChromeDriver();
			  }
			  
			  else if(prop.getProperty("browser").equalsIgnoreCase("Edge")) {
			  System.setProperty("webdriver.edge.driver",
			  System.getProperty("user.dir")+"/src/test/resources/msedge.exe"); 
			  driver=new EdgeDriver(); 
			  }
			 
				/*
				 * System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+
				 * "/src/test/chromedriver.exe"); driver=new ChromeDriver();
				 */
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		}
		return driver;
		
	}
	
	

}

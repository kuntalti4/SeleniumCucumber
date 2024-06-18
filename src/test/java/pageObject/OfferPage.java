package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
	
WebDriver driver;
	
	public OfferPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By search=By.xpath("//input[@id='search-field']");
	By prodname2= By.xpath("//*[contains(text(),'Tomato')]");
	
	public void SearchProdName(String Name)
	{
		driver.findElement(search).sendKeys(Name);
	}
	
	public String GetProdName()
	{
		return driver.findElement(prodname2).getText();
	}

}

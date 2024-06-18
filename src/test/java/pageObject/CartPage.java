package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	
WebDriver driver;
	
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By prodName= By.xpath("//*[@id='productCartTables']/tbody/tr/td[2]/p");
	By ApplyButton= By.cssSelector(".promoBtn");
	By PlaceOrder = By.xpath("//button[@fdprocessedid='kwhpgd']");
	
	public String CheckProdName()
	{
		return driver.findElement(prodName).getText();
	}
	
	public void checkApplyButton()
	{
		Boolean applybutton=driver.findElement(ApplyButton).isEnabled();
		if (applybutton==true)
		{
			System.out.println("Apply button is enabled");
		}
	}
	
	public void checkPlaceOrderButton()
	{
		Boolean placeorderButton=driver.findElement(ApplyButton).isEnabled();
		
		if (placeorderButton==true)
		{
			System.out.println("Place order button is enabled");
		}
	}

}

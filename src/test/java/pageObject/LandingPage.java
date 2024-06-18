package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By search=By.xpath("//input[@type='search']");
	By prodname1= By.xpath("//h4[@class='product-name']");
	By topdeals=By.linkText("Top Deals");
	By increment=By.xpath("//a[@class='increment']");
	By addtoCart= By.xpath("//div[@class='product-action']/button");
	By cartIcon= By.xpath("//a[@class='cart-icon']/img");
	By ProceedToCheckout = By.xpath("//*[contains(text(),'PROCEED TO CHECKOUT')]");
	By AddToCart= By.xpath("//div[@class='product-action']/button");
	
	public String titleOfPage()
	{
		return driver.getTitle();
	}
	
	public void searchProd(String shortName)
	{
		driver.findElement(search).sendKeys(shortName);
	}
	
	public String GetProdName()
	{
		return driver.findElement(prodname1).getText();
	}
	
	public void ClickTopDeals()
	{
		driver.findElement(topdeals).click();
	}
	
	public void ClickOnProd()
	{
		driver.findElement(increment).click();
	}
	
	public void AddtoCart()
	{
		driver.findElement(addtoCart).click();;
	}
	

	public void ClickOnCartIcon()
	{
		driver.findElement(cartIcon).click();;
	}
	public void ProccedToCheckOut()
	{
		driver.findElement(ProceedToCheckout).click();;
	}
	
	public void AddProductInCart(String ProdName) throws InterruptedException
	{
		List<WebElement> a=driver.findElements(prodname1);
		Thread.sleep(3000);
		
		for (int i=0;i<a.size();i++)
		{
			String[] ProdNameAct=a.get(i).getText().split("-");
			String ProdNameExpected = ProdNameAct[0].trim();
			
		if(ProdNameExpected.contains(ProdName))
		{
			driver.findElements(AddToCart).get(i).click();
			break;
		}
		}
		
	}

}

package pageObject;

import org.openqa.selenium.WebDriver;



public class PageObjectManager {
	
	LandingPage landingPage;
	OfferPage offerpage;
	CartPage cartpage;
	WebDriver driver;
	SJetLandingPage SJetLandingPage;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public LandingPage GetLandingPage()
	{
		landingPage= new LandingPage(driver);
		return landingPage;
	}
	
	public OfferPage GetOfferPage()
	
	{
		offerpage= new OfferPage(driver);
		return offerpage;
	}
	
	public CartPage CartPage()
	
	{
		cartpage= new CartPage(driver);
		return cartpage;
	}
	
	public SJetLandingPage sjetLandingPage()
	{
		SJetLandingPage= new SJetLandingPage(driver);
		return SJetLandingPage;
	}
	

}

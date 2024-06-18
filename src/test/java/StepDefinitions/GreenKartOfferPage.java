package StepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LandingPage;
import pageObject.OfferPage;

public class GreenKartOfferPage {
	
	//WebDriver driver;
	//String Prodname1;
	String Prodname2;
	TestContextSetup testcontext;
	
	public GreenKartOfferPage(TestContextSetup testcontext)
	{
		this.testcontext= testcontext;
	}
	
	
	    	
	@Then("^User searched for the same short name (.+) in offerpage$")
	public void user_searched_for_the_same_short_name_in_offerpage(String ShortName)throws IOException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		openOfferPage();
		OfferPage offerpage= testcontext.pageobjectmanager.GetOfferPage();
		offerpage.SearchProdName(ShortName);
		Thread.sleep(2000);
		Prodname2=offerpage.GetProdName();
		System.out.println(Prodname2);
	    
	}
	@Then("check if product exist")
	public void check_if_product_exist() throws IOException{
	    // Write code here that turns the phrase above into concrete actions
		//Assert.assertEquals(testcontext.Prodname1, Prodname2);
		System.out.println("Product Name1:" +testcontext.Prodname1 + "Product name2:" +Prodname2);
		//testcontext.genericutils.CloseBrowser();
		
	    
	}
	
	public void openOfferPage()
	{
		LandingPage landingpage= testcontext.pageobjectmanager.GetLandingPage();
		landingpage.ClickTopDeals();
		testcontext.genericutils.SwitchToChildWindow();
	}


}

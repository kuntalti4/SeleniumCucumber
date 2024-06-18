package StepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LandingPage;

public class GreenKartLanding {
	
	//WebDriver driver;
	//String Prodname1;
	//String Prodname2;
	TestContextSetup testcontext;
	LandingPage landingPage;
	
	public GreenKartLanding(TestContextSetup testcontext)
	{
		this.testcontext= testcontext;
		this.landingPage= testcontext.pageobjectmanager.GetLandingPage();
	}
	
	@Given("User is on GreenCart landing page")
	public void user_is_on_green_cart_landing_page() throws IOException{
	    // Write code here that turns the phrase above throw new io.cucumber.java.PendingException();
		//testcontext.webdrivermanager.getWebDriverManager();
		
		String LandingPagetitle = landingPage.titleOfPage();
		System.out.println(LandingPagetitle);
		
	}
	@When("^User serach for short name (.+) and extract actual name of the product$") 
	public void user_serach_for_short_name_and_extract_actual_name_of_the_product(String ShortName)throws IOException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		landingPage.searchProd(ShortName);
		//landingPage.searchProd(ShortName);
		//Thread.sleep(2000);
		testcontext.Prodname1=landingPage.GetProdName().split("-")[0];
		System.out.println(testcontext.Prodname1);
	    	}
	
	@When("User add product {int} time on cart")
	public void user_add_product_time_on_cart(Integer noOfClick) throws IOException, InterruptedException
	{
	    // Write code here that turns the phrase above into concrete actions
		
		for (int i=0;i<noOfClick;i++)
		{
		landingPage.ClickOnProd();
		}
		//Thread.sleep(2000);
		landingPage.AddtoCart();
		//Thread.sleep(2000);
	}
	
	@When("^User add (.+) on the cart$")
	public void user_add_prod_on_the_cart(String ProdName) throws IOException, InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println(ProdName);
		landingPage.AddProductInCart(ProdName);
	}
	    
	


}

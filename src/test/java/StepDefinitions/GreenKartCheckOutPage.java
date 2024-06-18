package StepDefinitions;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import Utils.TestContextSetup;
import io.cucumber.java.en.Then;
import pageObject.CartPage;
import pageObject.LandingPage;

public class GreenKartCheckOutPage {
	
	TestContextSetup testcontext;
	public CartPage cartpage;
	public String cartProd;
	
	
	public GreenKartCheckOutPage(TestContextSetup testcontext)
	{
		this.testcontext= testcontext;
	}
	
	
	@Then("User navigate to checkout page")
	public void user_navigate_to_checkout_page() throws IOException, InterruptedException
	{
		testcontext.landingPage.ClickOnCartIcon();
		testcontext.landingPage.ProccedToCheckOut();
		//Thread.sleep(2000);
	    
	}
	
	@Then("^check if (.+) exist on cart$")
	public void check_if_product_exist_on_cart(String prodname) throws IOException, InterruptedException
	{
		cartpage= testcontext.pageobjectmanager.CartPage();
		cartProd=cartpage.CheckProdName().split("-")[0];
		System.out.println("Cart Page prod name:" +cartProd+" Land Page productname"+testcontext.Prodname1 + " From feature file prod name" +prodname);
	
		
	}
	
	@Then("apply and place order button is working")
	public void apply_and_place_order_button_is_working() throws IOException, InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		
		cartpage.checkApplyButton();
		cartpage.checkPlaceOrderButton();
	}

}

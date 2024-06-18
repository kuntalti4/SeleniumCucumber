package StepDefinitions;

import java.io.IOException;

import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.CartPage;
import pageObject.SJetLandingPage;

public class SpiceJetLandingPage {
	
	TestContextSetup testcontext;
	
	SJetLandingPage sjetLandingPage;
	
	
	
	public SpiceJetLandingPage(TestContextSetup testcontext)
	{
		this.testcontext= testcontext;
		
	}
	
	@Given("User is on SpiceJet landing page")
	public void user_is_on_spice_jet_landing_page() throws IOException, InterruptedException{
		sjetLandingPage=testcontext.pageobjectmanager.sjetLandingPage();
	}
	
	@When("User serach for {string} and {string} for {int} Aduls")
	public void user_serach_for_and_for_aduls(String string, String string2, Integer noOfAdults)throws IOException, InterruptedException
	{
		sjetLandingPage.clickForm();
		sjetLandingPage.selectSource();
		sjetLandingPage.selectDestination();
		Thread.sleep(6000);
		sjetLandingPage.clickOutSide();
		
		
		sjetLandingPage.clickPassenger();
		
		for (int i=1;i<=noOfAdults;i++)
		{
			sjetLandingPage.NoOfPassenger();
		}

	}
	
	@When("User select todays date")
	public void user_select_todays_date() throws IOException, InterruptedException{
		sjetLandingPage.selectCurrentDate();
		testcontext.genericutils.SelectByValue(sjetLandingPage.selectCurrency(), "INR");
		
	    
	}
	@Then("User navigated to flight info page")
	public void user_navigated_to_flight_info_page() throws IOException, InterruptedException
	{
		sjetLandingPage.clickSubmit();
		Thread.sleep(2000);
		
	}

}

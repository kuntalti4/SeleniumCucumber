package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SJetLandingPage {
	
	WebDriver driver;
	
	
	public SJetLandingPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	By form = By.id("ctl00_mainContent_ddl_originStation1_CTXT");
	By source = By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='DEL']");
	By destination= By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BHO']");
	By passenger = By.id("divpaxinfo");
	By noOfPass= By.id("hrefIncAdt");
	By currency = By.id("ctl00_mainContent_DropDownListCurrency");
	By date = By.id("ctl00_mainContent_view_date1");
	By selectCurrentDate = By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[3]/td[6]/a");
	By submit= By.id("ctl00_mainContent_btn_FindFlights");
	By OutSide= By.id("flightSearchContainer");
	
	
	
	public void clickForm()
	
	{
		driver.findElement(form).click();
	}
	
	public void selectSource()
	{
		driver.findElement(source).click();
	}
	
	public void selectDestination()
	{
		driver.findElement(destination).click();
	}
	
	public void clickPassenger()
	{
		driver.findElement(passenger).click();

	}
	
	public void NoOfPassenger()
	{
		driver.findElement(noOfPass).click();
	}
	
	public void selectCurrentDate() throws InterruptedException
	{
		driver.findElement(date).click();
		Thread.sleep(2000);
		driver.findElement(selectCurrentDate).click();
	}
	
	public WebElement selectCurrency()
	{
		return driver.findElement(currency);
	}
	
	public void clickSubmit()
	{
		driver.findElement(submit).click();
	}
	
	public void clickOutSide()
	{
		driver.findElement(OutSide).click();
	}

}

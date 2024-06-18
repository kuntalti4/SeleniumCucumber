package cucumber.Options;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "@target/failedScenario.txt", 
	    //plugin = "json:target/json/Cucumber-report.json",// Specify the path to your feature files
	    glue = "StepDefinitions",
	    monochrome = true,
	    plugin= {"json:target/Cucumber-report.json", "html:target/Cucumber-report.html",
	    		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	    
	    
	    ) 

public class FailRerun extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
			{
				return super.scenarios();
		
			}
}


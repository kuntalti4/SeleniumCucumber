package cucumber.Options;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = "src/test/java/Features", 
	    //plugin = "json:target/json/Cucumber-report.json",// Specify the path to your feature files
	    glue = "StepDefinitions",
	    monochrome = true,
	    tags= "@AddProdCart",
	    plugin= {"json:target/Cucumber-report.json", "html:target/Cucumber-report.html",
	    		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	    		"rerun:target/failedScenario.txt"}
	    
	    
	    ) 

public class TestRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=false)
	public Object[][] scenarios()
			{
				return super.scenarios();
		
			}

}

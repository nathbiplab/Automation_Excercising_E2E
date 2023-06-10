package smarttech.ny.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin= {"pretty","json:target/cucumber.json" },
	features = {".//Features/"},
	glue = {"smarttech.ny.stepdefinitions", "smarttech.ny.hooks"}
		
		)


public class MyRunner extends AbstractTestNGCucumberTests{

}

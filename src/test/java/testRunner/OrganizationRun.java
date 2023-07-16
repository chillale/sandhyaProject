package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = ".//Features/Organization.feature",
		glue="stepDefinitions",
		monochrome = true,
		dryRun=false,
		plugin = { "pretty", "html:target/cucumber-reports.html" }
		)

public class OrganizationRun extends AbstractTestNGCucumberTests{

}

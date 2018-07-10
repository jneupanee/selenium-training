package runnerClass;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(  monochrome = true,
features = "src/test/resources/features/",
dryRun = false,
plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
		"junit:target/cucumber-reports/Cucumber.xml",
		"html:target/cucumber-reports"},
glue = "step_definitions" )


public class RunTest {

}


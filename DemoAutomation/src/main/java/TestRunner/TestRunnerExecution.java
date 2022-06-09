package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\0034ZK744\\git\\TestAutomationUI\\DemoAutomation\\src\\main\\java\\Features\\Login.feature",
		glue= {"StepDefinitions"}
		
		)

public class TestRunnerExecution {

}

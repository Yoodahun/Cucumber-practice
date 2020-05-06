package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//feature
//stepDefinition

@CucumberOptions(features = "src/test/java/features",
                 glue = "stepDefinition" )
public class TestRunner extends AbstractTestNGCucumberTests {
}

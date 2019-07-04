package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

// Runner using TestNG
@CucumberOptions(
        features = {"src/test/java/features"},
        tags = {"@facebook"},
        glue = "steps",
        plugin = {"html:target/test-report/html/",})

public class  CucumberTestRunner  extends AbstractTestNGCucumberTests {
}

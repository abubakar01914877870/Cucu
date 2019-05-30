package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class) --junit
@CucumberOptions(features = {"src/test/java/Features"}, glue = "steps")
public class  CucumberTestRunner  extends AbstractTestNGCucumberTests {
}

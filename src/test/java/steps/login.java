package steps;

import lib.assertionElement.CheckText;
import lib.base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.PageLogin;

public class login extends BaseUtil {

    private BaseUtil base;


    public login(BaseUtil base) {
        this.base = base;
    }

    @Given("I navigate to {string} page")
    public void iNavigateToLoginPage(String Url) {
        base.driver.navigate().to(Url);
    }

    @And("I enter the username as {string} and password as {string}")
    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) {
        PageLogin pageLogin =new PageLogin(base.driver);
        pageLogin.Login(username, password);

    }

    @When("I click on login button")
    public void iClickOnLoginButton() {
        PageLogin pageLogin =new PageLogin(base.driver);
        pageLogin.ClickOnLoginButton();
    }

    @Then("I will see the {string} page")
    public void iWillSeeThePage(String pageName) {
        Assert.assertTrue(new CheckText(base).getCheckingText(pageName));
    }
}

package steps;

import base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class login extends BaseUtil {

    private BaseUtil base;
    private String username;

    public login(BaseUtil base) {
        this.base = base;
    }

    @Given("I navigate to {string} page")
    public void iNavigateToLoginPage(String Url) {
        base.driver.navigate().to(Url);
    }

    @And("I enter the username as {string} and password as {string}")
    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) {
        LoginPage loginPage=new LoginPage(base.driver);
        loginPage.Login(username, password);

    }

    @When("I click on login button")
    public void iClickOnLoginButton() {
        LoginPage loginPage=new LoginPage(base.driver);
        loginPage.ClickOnLoginButton();
    }

    @Then("I will see the list page")
    public void iWillSeeTheListPage() {
    }




}

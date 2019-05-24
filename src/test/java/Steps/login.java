package Steps;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login extends BaseUtil {

    private BaseUtil base;

    public login(BaseUtil base) {
        this.base = base;
    }

    @Given("I navigate to login page")
    public void iNavigateToLoginPage() {
        System.out.println(base.StepInfo);
    }

    @And("I enter the username as {string} and password as {string}")
    public void iEnterTheUsernameAsAndPasswordAs(String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }

    @When("I click on login button")
    public void iClickOnLoginButton() {
    }

    @Then("I will see the list page")
    public void iWillSeeTheListPage() {
    }


}

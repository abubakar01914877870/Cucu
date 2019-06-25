package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.FindByXpath;
import lib.assertionElement.CheckText;
import lib.base.BaseUtil;
import lib.helperObject.PinterestUser;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.PagePinterestSignup;

import java.util.concurrent.TimeUnit;

public class StepSignupPinterest extends BaseUtil{

    private BaseUtil base;


    public StepSignupPinterest(BaseUtil base) {
        this.base = base;
    }


    @Given("I navigate to pinterest {string} page")
    public void iNavigateToPinterestPage(String URL) {
        base.driver.navigate().to(URL);
    }

    @When("I input email password and click Continue button")
    public void iInputEmailPasswordAndClickContinueButton() {
        PinterestUser user = new PinterestUser("user" + base.timeStamp + "@yopmail.com");
        base.pUser = user;
        PagePinterestSignup pagePinterestSignup = new PagePinterestSignup(base);
        pagePinterestSignup.signUpPinterestuser(user);
    }


    @When("I complete user sign up next step")
    public void iCompleteUserSignUpNextStep() throws Exception{
        PagePinterestSignup pagePinterestSignup = new PagePinterestSignup(base);
        pagePinterestSignup.signupNextSteps();
    }
}

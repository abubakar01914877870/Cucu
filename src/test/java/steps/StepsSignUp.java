package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.assertionElement.CheckText;
import lib.base.BaseUtil;
import lib.helperObject.Provider;
import org.testng.Assert;
import pages.PageSignupFormOne;
import pages.PageSignupFormTwo;

import java.util.List;

public class StepsSignUp extends BaseUtil {
    private  BaseUtil base;

    public StepsSignUp(BaseUtil base) {
        this.base = base;
    }

    @Given("I  filled up individual provider sign up form one")
    public void iFilledUpIndividualProviderSignUpFormOne() {
    }

    @When("I filled up sign up form One")
    public void iFilledUpSignUpFormOne(List<String> t) {

        try{
            Provider provider= new Provider(
                    t.get(0),
                    t.get(1),
                    t.get(2),
                    t.get(3),
                    t.get(4),
                    t.get(5));

            PageSignupFormOne One= new PageSignupFormOne(base);
            One.setSignUpPageOneInformation(provider);
            One.clickNextButton();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

    @When("I filled up sign up form Two")
    public void iFilledUpSignUpFormTwo(List<String> t) {
        try{
            Provider provider= new Provider(
                    t.get(0),
                    t.get(1),
                    t.get(2),
                    t.get(3));

            PageSignupFormTwo Two = new PageSignupFormTwo(base);
            Two.setSignUpPageTwoInformation(provider);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Then("I expect page with text {string}")
    public void iExpectPageWithText(String text) {
        Assert.assertTrue(new CheckText(base).getCheckingText(text));
    }
}

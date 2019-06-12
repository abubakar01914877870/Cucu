package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.assertionElement.CheckText;
import lib.base.BaseUtil;
import lib.helperObject.Provider;
import lib.helperObject.ServiceCompany;
import org.picocontainer.annotations.Cache;
import org.testng.Assert;
import pages.PageSignupFormOne;
import pages.PageSignupFormTwo;

import java.util.List;

public class StepsSignUp extends BaseUtil {
    private  BaseUtil base;

    public StepsSignUp(BaseUtil base) {
        this.base = base;
    }

    @When("I filled up sign up form One")
    public void iFilledUpSignUpFormOne(List<String> t) {

        try{
            Provider provider= new Provider(
                    base,
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
                    base,
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

    @When("I filled up sign up form Two buyer")
    public void iFilledUpSignUpFormTwoBuyer() {
        PageSignupFormTwo Two_buyer= new PageSignupFormTwo(base);
        Two_buyer.setSignUpPageTwoInformationBuyer();
    }

    @When("I filled up sign up form Two for service company")
    public void iFilledUpSignUpFormTwoForServiceCompany(List<String> t) {

        try {

            ServiceCompany serviceCompany = new ServiceCompany(
                    base,
                    t.get(0),
                    t.get(1),
                    t.get(2),
                    t.get(3));



        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}

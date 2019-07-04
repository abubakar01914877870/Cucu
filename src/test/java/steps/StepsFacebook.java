package steps;

import com.sun.source.tree.AssertTree;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import lib.assertionElement.CheckText;
import lib.base.BaseUtil;
import org.openqa.selenium.By;
import org.testng.Assert;

public class StepsFacebook extends BaseUtil {

    private BaseUtil base;

    public StepsFacebook(BaseUtil base) {
        this.base = base;
    }

    @And("I login with facebook id {string} and password {string}")
    public void iLoginWithFacebookIdAndPassword(String id, String password) {
        this.base.driver.findElement(By.id("email")).sendKeys(id);
        this.base.driver.findElement(By.id("pass")).sendKeys(password);

        this.base.driver.findElement(By.id("loginbutton")).click();

        Assert.assertTrue(new CheckText(this.base).getCheckingText("Create post"));
    }

    @When("I store cookie")
    public void iStoreCookie() {
        System.out.println( this.base.driver.manage().getCookieNamed("c_user").toString());

    }
}

package pages;

import lib.FindByXpath;
import lib.base.BaseUtil;
import lib.helperObject.PinterestUser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class PagePinterestSignup extends BaseUtil{

    private BaseUtil base;

    @FindBy(how = How.ID, using = "email")
    public WebElement email;

    @FindBy(how = How.ID, using = "password")
    public WebElement password;

    @FindBy(how = How.XPATH, using = "//div[@data-test-id ='registerFormSubmitButton']")
    public WebElement btnContinue;

    @FindBy(how = How.XPATH, using = "//div[@data-test-id='nux_name_done_btn']")
    public WebElement btnNext;

    @FindBy(how = How.XPATH, using = "//label[@for ='female']")
    public WebElement radiobtnFemale;

    @FindBy(how = How.XPATH, using = "//div[@data-test-id ='nux-locale-country-next-btn']")
    public WebElement btnNext2;

    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'Makeup')]")
    public WebElement btnTopicMakeup;

    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'Nails')]")
    public WebElement btnTopicNails;

    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'Food and Drink')]")
    public WebElement btnTopicFoodandDrink;

    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'Travel')]")
    public WebElement btnTopicTravel;

    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'Health and Fitness')]")
    public WebElement btnTopicHealthandFitness;

    @FindBy(how = How.XPATH, using = "//div[contains(text(), 'DIY Home Decor')]")
    public WebElement btnTopicDIYHomeDecor;

    @FindBy(how = How.XPATH, using = "//div[@data-test-id ='nux-picker-done-btn']")
    public WebElement btnDone;


    @FindBy(how = How.XPATH, using = "//div[@class ='NuxPickerInterestsGrid TableOfContents']")
    public WebElement topicContainer;

    public PagePinterestSignup(BaseUtil base) {
        this.base = base;
        PageFactory.initElements(base.driver, this);
    }

    public void signUpPinterestuser(PinterestUser user)
    {
        try {
            base.wait.until(ExpectedConditions.visibilityOf(email));
            email.sendKeys(user.email);
            password.sendKeys(user.password);
            base.wait.until(ExpectedConditions.visibilityOf(btnContinue));
            btnContinue.click();


        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

    public void signupNextSteps()
    {
         try {
             base.wait.until(ExpectedConditions.visibilityOf(btnNext));
             btnNext.click();
             base.wait.until(ExpectedConditions.visibilityOf(radiobtnFemale));
             radiobtnFemale.click();
             base.wait.until(ExpectedConditions.visibilityOf(btnNext2));
             btnNext2.click();

             FindByXpath find = new FindByXpath();
             find.getWebElement(base, "//div[contains(text(), 'Health and Fitness')]");
             find.getWebElement(base, "//div[contains(text(), 'Makeup')]");
             find.getWebElement(base, "//div[contains(text(), 'Food and Drink')]");
             find.getWebElement(base, "//div[contains(text(), 'Nails')]");
             find.getWebElement(base, "//div[contains(text(), 'Travel')]");

             find.getWebElement(base, "//div[@data-test-id ='nux-picker-done-btn']");

             Thread.sleep(2000);

         }catch (Exception e)
         {
             System.out.println(e.getMessage() + e.getClass());
         }
    }
}

package pages;

import lib.base.BaseUtil;
import lib.helperObject.Provider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageSignupFormOne extends BaseUtil {

    private BaseUtil base;

    public PageSignupFormOne(BaseUtil base) {
        this.base =  base;
        PageFactory.initElements(base.driver, this);
    }



    @FindBy(how = How.NAME, using = "first_name")
    public WebElement firstName;

    @FindBy(how = How.NAME, using = "last_name")
    public WebElement lastName;

    @FindBy(how = How.NAME, using = "phone")
    public WebElement phone;

    @FindBy(how = How.NAME, using = "email")
    public WebElement email;

    @FindBy(how = How.NAME, using = "password1")
    public WebElement password1;

    @FindBy(how = How.NAME, using = "password2")
    public WebElement password2;

    //Terms of service check box
    @FindBy(how = How.NAME, using = "tos")
    public WebElement tos;

    //Type of business provider or buyer dropdown
    @FindBy(how = How.XPATH, using = "//select[@id = 'your_business']")
    public WebElement your_business;


    @FindBy(how = How.XPATH, using = "//button[text()='Next']")
    public WebElement next_button;



    public void setSignUpPageOneInformation(Provider provider)
    {
        firstName.sendKeys(provider.first_name);
        lastName.sendKeys(provider.last_name);
        phone.sendKeys(provider.phone);
        email.sendKeys(provider.email);
        password1.sendKeys(provider.password);
        password2.sendKeys(provider.password);

        Select dropdown=new Select(your_business);
        dropdown.selectByVisibleText(provider.Which_best_describes_your_business_needs);

        tos.click();


    }

    public void clickNextButton()
    {
        next_button.click();
    }
}

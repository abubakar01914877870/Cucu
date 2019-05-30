package pages;

import base.BaseUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageSignupOne {

    //private BaseUtil base;

    public PageSignupOne(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.NAME, using = "first_name")
    public WebElement firstName;

    @FindBy(how = How.NAME, using = "last_name")
    public WebElement lastName;

    public void setSignUpPageOneInformation(String first_Name, String last_Name)
    {
        firstName.sendKeys(first_Name);
        lastName.sendKeys(last_Name);
    }
}

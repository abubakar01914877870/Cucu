package pages;

import lib.base.BaseUtil;
import lib.helperObject.Provider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageSignupFormTwo extends BaseUtil {
    private BaseUtil base;

    public PageSignupFormTwo(BaseUtil base) {
        this.base =  base;
        PageFactory.initElements(base.driver, this);
    }

    //Number_of_service_providers select dropdown
    @FindBy(how = How.XPATH, using = "//select[@id = 'serviceProviders']")
    public WebElement number_of_service_providers;

    //type_of_work select dropdown
    @FindBy(how = How.XPATH, using = "//select[@id = 'type_of_work']")
    public WebElement primary_type_of_work;

    @FindBy(how = How.ID, using = "provider_zip")
    public WebElement zip_code;

    //provider_country select dropdown
    @FindBy(how = How.XPATH, using = "//select[@id = 'provider_country']")
    public WebElement provider_country;

    @FindBy(how = How.ID, using = "signUp")
    public WebElement sign_up_button;

    public void setSignUpPageTwoInformation(Provider provider)
    {
        Select dropdown=new Select(number_of_service_providers);
        dropdown.selectByVisibleText(provider.Number_of_service_providers);

        Select dropdown_type_of_work=new Select(primary_type_of_work);
        dropdown_type_of_work.selectByVisibleText(provider.Primary_type_of_work);

        zip_code.sendKeys(provider.Zip_Code);

        Select dropdown_provider_country = new Select(provider_country);
        dropdown_provider_country.selectByVisibleText(provider.Country);

        sign_up_button.click();
    }

}

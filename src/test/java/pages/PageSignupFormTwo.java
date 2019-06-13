package pages;

import lib.base.BaseUtil;
import lib.helperObject.Provider;
import lib.helperObject.ServiceCompany;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

    // Does your company already have an account with Field Nation? No button
    @FindBy(how = How.XPATH, using = "//label[@for = 'no-account']")
    public WebElement no_account_No_button;

    //Buyer Company name input field it should be a unique value
    @FindBy(how = How.ID, using = "company")
    public WebElement company_name;

    @FindBy(how = How.XPATH, using = "//select[@id = 'number_of_employees']")
    public WebElement number_of_employees;

    //Number of service providers dropdown
    @FindBy(how = How.ID, using = "serviceProviders")
    public WebElement service_number_of_provider;

    //Service Company name
    @FindBy(how = How.ID, using = "company_name")
    public WebElement service_company_name;

    //Service Company address1
    @FindBy(how = How.ID, using = "address")
    public WebElement service_address1;

    //Service Company city
    @FindBy(how = How.ID, using = "city")
    public WebElement service_city;

    //Service Company state
    @FindBy(how = How.ID, using = "state")
    public WebElement service_state;

    //Service Company zip code
    @FindBy(how = How.ID, using = "zip_code")
    public WebElement service_zip_code;

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

    public void setSignUpPageTwoInformationBuyer()
    {
        try {
            base.wait.until(ExpectedConditions.visibilityOf(no_account_No_button));
            no_account_No_button.click();
           // System.out.println(no_account_No_button.getText());

            company_name.sendKeys("buyer company" + base.timeStamp);

            Select dropdown_provider_country = new Select(number_of_employees);
            dropdown_provider_country.selectByVisibleText("51-100");
            sign_up_button.click();

        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

    public void setSignUpPageTwoInformationServiceCompany(ServiceCompany servicecompany)
    {
        try {

            Select dropdown_type_of_work=new Select(service_number_of_provider);
            dropdown_type_of_work.selectByVisibleText(servicecompany.numberOfproviders);

            service_company_name.sendKeys(servicecompany.name);
            service_address1.sendKeys(servicecompany.address1);
            service_city.sendKeys(servicecompany.city);
            service_state.sendKeys(servicecompany.state);
            service_zip_code.sendKeys(servicecompany.zipCode);

            sign_up_button.click();



        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}

package steps;

import base.BaseUtil;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import pages.PageSignupOne;

import java.util.List;

public class MarketingSignUpSteps extends BaseUtil {

    private BaseUtil base;

    public MarketingSignUpSteps(BaseUtil base) {
        this.base = base;
    }

    @When("I input information page one")
    public void iInputInformationPageOne(DataTable table) {
      //  HashMap<String, String> provider = new HashMap<String, String>();
      //  provider=table.asMap();
        List<String> list= table.asList();
        System.out.println(list.get(1));
        PageSignupOne m = new PageSignupOne(base.driver);
        m.setSignUpPageOneInformation(list.get(1), list.get(1));


    }
}

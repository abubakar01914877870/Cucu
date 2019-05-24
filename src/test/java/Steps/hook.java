package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hook  extends BaseUtil {

    private BaseUtil base;

    public hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest(){
        System.out.println("Opening the browser ");
        base.StepInfo= " Dummy Web driver ";
    }

    @After
    public void TearDownTest(Scenario scenario){

        if(scenario.isFailed()){
            // Take screenshot
        }

        System.out.println("Closing the browser");
    }
}

package steps.hooks;

import lib.base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hook  extends BaseUtil {

    private BaseUtil base;

    public hook(BaseUtil base)
    {
        this.base = base;
    }

    @Before
    public void InitializeTest(){
       // System.out.println("Opening the browser : FF");
       // System.setProperty("webdriver.gecko.driver", "src/test/webdriver/geckodriver.exe");
        //Chrome driver setup using github.bonigarcia webdrivermanager

        System.setProperty("wdm.targetPath", "src/test/webDriver/");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        base.driver =driver;

      //  lib.driver= new FirefoxDriver();


    }

    //Set global waiting time
    @Before
    public void setGlobalWait(){
        WebDriverWait wait = new WebDriverWait(base.driver, 60);
        base.wait = wait;
    }

    @After
    public void TearDownTest(Scenario scenario){

        if(scenario.isFailed()){
            // Take screenshot
        }

        //base.driver.close();
    }
}

package steps.hooks;

import lib.base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Date;

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
        //Set global waiting time
        //Set a timestamp for global

        System.setProperty("wdm.targetPath", "src/test/webDriver/");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        base.driver =driver;

      //  lib.driver= new FirefoxDriver();
        try {
            WebDriverWait wait = new WebDriverWait(base.driver, 60);
            base.wait = wait;
          //  System.out.println("wait set");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            base.timeStamp = (new Date()).getTime();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


    @After
    public void TearDownTest(Scenario scenario){

        if(scenario.isFailed()){
            // Take screenshot
            System.out.println(scenario.getName() + " is Fail");
        }else
        {
            System.out.println(scenario.getName() + " is Passed");
        }

        base.driver.close();
    }
}

package lib.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Date;

public class BaseUtil {
    public WebDriver driver;
    public WebDriverWait wait;

    public long getTimeStamp()
    {
       return ((new Date()).getTime());
    }
}


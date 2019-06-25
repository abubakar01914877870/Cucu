package lib;

import lib.base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FindByXpath  {

    public void getWebElement(BaseUtil base, String xpath){

        for(int i=0;i<2;i++){
            try {
              //  System.out.println(xpath);
                base.wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
                base.driver.findElement(By.xpath(xpath)).click();
                break;
            }catch (Exception e){
                System.out.println(e.getMessage() + "Hit error");
            }
        }
    }
}

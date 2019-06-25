package lib.assertionElement;

import lib.base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class CheckText extends BaseUtil {

    private BaseUtil base;

    public CheckText(BaseUtil base) {
        this.base = base;
    }

    public boolean getCheckingText(String txt){


        try {
            WebElement page_txt=base.wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//*[contains(text(),'" + txt + "')]")));

            if(page_txt.isDisplayed()){
                System.out.println(page_txt.getText());
                return true;
            } else {
               // System.out.println("text not present");
                return false;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return  false;
    }
}

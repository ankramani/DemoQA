package PageObjects;

import CommonUtils.BrowserActions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Initiation extends BrowserActions {

    @BeforeSuite
    public static void startPoint(){
        BrowserActions.launchBrowser();
        driver.manage().window().maximize();
    }

    @AfterSuite(enabled = false)
    public static void endPoint(){
        BrowserActions.closeBrowser();
    }

}

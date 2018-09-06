package TestScripts;

import CommonUtils.BrowserActions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTestScript {
    BrowserActions browserActions = new BrowserActions();
    @BeforeSuite
    public void launchWebsite(){
        browserActions.launchBrowser();
    }

    @BeforeMethod


    @AfterSuite
    public void closeBrowser(){
        browserActions.closeInstance();
    }

}

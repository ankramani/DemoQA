package PageObjects;

import CommonUtils.BrowserActions;
import org.openqa.selenium.By;

public class Home extends BrowserActions {

    static By registration = By.xpath("//a[contains(text(),'Registration')]");
    static By firstName = By.name("first_name");
    static By lastName = By.name("last_name");
    static By maritalStatus = By.xpath("//input[@value = 'married']");

    BrowserActions browserActions = new BrowserActions();

    public void clickRegistration(){
        browserActions.clickElement(registration);
    }

    public void enterFirstName(){
        browserActions.enterText(firstName, "abc");
    }
    public void enterLastName(){
        browserActions.enterText(lastName, "xyz");
    }


}

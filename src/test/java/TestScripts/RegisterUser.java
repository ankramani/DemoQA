package TestScripts;

import CommonUtils.BrowserActions;
import PageObjects.Registration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javax.jws.WebService;

public class RegisterUser extends Registration {

    @Test
    public void userRegistrationForm() {
        String phoneError = "* Minimum 10 Digits starting with Country Code";
        String passwordError = "* Minimum 8 characters required";
        try {
            Registration regist = new Registration();
            regist.clickRegistration();
            Registration.implicitWait();
            regist.name("abc", "xyz");
            regist.marryStatus();
            regist.userHobby();
            regist.country();
            regist.birthDate();
            regist.phone("132456");
            regist.enterUsername();
            regist.enterEmail();
            regist.enterPassword("abc123");
            regist.enterConfirmPassword();
            regist.clickSubmit();
            WebElement err = driver.findElement(By.xpath("//span[contains(text(), '* Minimum 10 Digits starting with Country Code')]"));
            WebElement pwdError = driver.findElement(By.xpath("//span[contains(text(),'* Minimum  8  characters required')]"));
            if (err.getText().equalsIgnoreCase(phoneError) || pwdError.getText().equalsIgnoreCase(passwordError)){
                regist.clearPhone();
                regist.phone("919876543210");
                BrowserActions.clearInputText(password);
                regist.enterPassword("abcd1234");
                regist.clickSubmit();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

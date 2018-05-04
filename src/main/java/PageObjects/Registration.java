package PageObjects;

import CommonUtils.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration extends BrowserActions {

    private By registrationLink = By.id("menu-registration");
    private By firstNameLocator = By.name("first_name");
    private By lastNameLocator = By.name("last_name");
    private By maritalStatus = By.xpath("//input[@value='single']");
    private By hobbies = By.xpath("//input[@value='cricket ']");
    private By contact = By.id("phone_9");
    private By username = By.id("username");
    private By email = By.id("email_1");
    protected By password = By.name("password");
    private By confirmPassword = By.id("confirm_password_password_2");
    private By submitButton = By.xpath("//input[@value='Submit']");

    public void clickRegistration(){
        BrowserActions.clickElement(registrationLink);
    }

    public void name(String firstName, String lastName){
        BrowserActions.enterText(firstNameLocator, firstName);
        BrowserActions.enterText(lastNameLocator, lastName);
    }

    public void marryStatus(){
        BrowserActions.clickElement(maritalStatus);
    }
    public void userHobby(){
        BrowserActions.clickElement(hobbies);
    }
    public void country(){
        Select countryDropdown = new Select(driver.findElement(By.id("dropdown_7")));
        countryDropdown.selectByValue("India");
    }
    public void birthDate(){
        WebElement month = driver.findElement(By.id("mm_date_8"));
        WebElement day = driver.findElement(By.id("dd_date_8"));
        WebElement year = driver.findElement(By.id("yy_date_8"));
        Select monthdropdown = new Select(month);
        Select daydropdown = new Select(day);
        Select yeardropdown = new Select(year);
        monthdropdown.selectByValue("4");
        daydropdown.selectByValue("16");
        yeardropdown.selectByValue("1988");
    }
    public void phone(String number){
        BrowserActions.enterText(contact, number);
    }
    public void enterUsername(){
        BrowserActions.enterText(username, "abcxyz");
    }
    public void enterEmail(){
        BrowserActions.enterText(email, "abc@xyz.com");
    }
    public void enterPassword(String passwd){
        BrowserActions.enterText(password, passwd);
    }
    public void enterConfirmPassword(){
        BrowserActions.enterText(confirmPassword, "abc123");
    }
    public void clickSubmit(){
        BrowserActions.clickElement(submitButton);
    }
    public void clearPhone(){
        BrowserActions.clearInputText(contact);
    }

}
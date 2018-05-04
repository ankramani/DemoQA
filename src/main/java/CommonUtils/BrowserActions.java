package CommonUtils;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BrowserActions {

    public static WebDriver driver;

    public static void launchBrowser(){
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "./usr/bin/chromedriver");
        driver.get("http://demoqa.com/");
    }

    public static void clickElement(By by){
        driver.findElement(by).click();
    }

    public static void enterText(By by, String keys){
        driver.findElement(by).sendKeys(keys);
    }

    public static void explicitWait(By by){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public static void implicitWait(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public static void dragAndDrop(By source, By dest){
        Actions action = new Actions(driver);
        action.dragAndDrop(driver.findElement(source), driver.findElement(dest));
        action.build();
    }
    public static void clearInputText(By by){
        driver.findElement(by).clear();
    }
    public static void closeBrowser(){
        driver.close();
    }

}

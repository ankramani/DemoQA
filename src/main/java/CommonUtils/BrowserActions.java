package CommonUtils;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BrowserActions {
    static WebDriver driver;
    static String url = "https://demoqa.com/";


    public void launchBrowser () {
        driver = new ChromeDriver();
        driver.get(url);
    }
    public void clickElement(By by){
        driver.findElement(by).click();
    }
    public void enterText(By by, String text){
        driver.findElement(by).sendKeys(text);
    }
    public void readDataFromExcel(int rownum, int cellnum) {
        try {

            FileInputStream fis = new FileInputStream("./src/main/resources/Test.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(rownum);
            Cell cell = row.getCell(cellnum);
            System.out.println(cell);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void closeInstance(){
        driver.close();
    }

}

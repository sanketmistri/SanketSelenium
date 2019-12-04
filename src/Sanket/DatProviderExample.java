package Sanket;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatProviderExample
{
    WebDriver driver;
    @Test (dataProvider= "getdata")
    public void login(String name, String contact, String address, String contact2)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("http://stock.scriptinglogic.net");

        driver.manage().window().maximize();

        WebElement uname= driver.findElement(By.xpath("//input[@name=\"username\"]"));
        uname.sendKeys("admin");

        WebElement pwd=driver.findElement(By.xpath("//input[@name=\"password\"]"));
        pwd.sendKeys("admin");

        WebElement btn= driver.findElement(By.xpath("//input[@name=\"submit\"]"));
        btn.click();

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        WebElement supLink= driver.findElement(By.xpath("//a[contains(@class,'supplier-tab')]"));
        supLink.click();

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        WebElement addSup= driver.findElement(By.xpath("//a[contains(text(),'Add')]"));
        addSup.click();

        WebElement txtName= driver.findElement(By.xpath("//input[@id='name']"));
        txtName.sendKeys(name);

        WebElement txtContact= driver.findElement(By.xpath("//input[@id='buyingrate']"));
        txtContact.sendKeys(contact);

        WebElement txtAddress= driver.findElement(By.xpath("//textarea[@placeholder='ENTER YOUR ADDRESS']"));
        txtAddress.sendKeys(address);

        WebElement txtContact2= driver.findElement(By.xpath("//input[@id='sellingrate']"));
        txtContact2.sendKeys(contact2);

        WebElement btnAdd= driver.findElement(By.xpath("//input[@name='Submit']"));
        btnAdd.click();


    }

    @DataProvider
    public Object[][] getdata() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("Data/Book1.xls");
        HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
        HSSFSheet worksheet = workbook.getSheet("Sheet2");
            int rowCount = worksheet.getPhysicalNumberOfRows();
        Object[][] data = new Object[rowCount][4];
        for(int i = 0 ; i<rowCount;i++) {

            HSSFRow row = worksheet.getRow(i);

            HSSFCell name = row.getCell(0);

            if(name==null)
                data[i][0]="";
            else {

                name.setCellType(CellType.STRING);
                data[i][0] = name.getStringCellValue();
            }


            HSSFCell contact = row.getCell(1);
            contact.setCellType(CellType.STRING);

            data[i][1] = contact.getStringCellValue();

            HSSFCell address = row.getCell(2);
            address.setCellType(CellType.STRING);
            data[i][2] = address.getStringCellValue();

            HSSFCell contact2 = row.getCell(3);
            contact2.setCellType(CellType.STRING);
            data[i][3] = contact2.getStringCellValue();

        }
        return data;


    }
}

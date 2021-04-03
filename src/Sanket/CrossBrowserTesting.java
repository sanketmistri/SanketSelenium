package Sanket;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {

    WebDriver driver;

    @Parameters("browser")
    @BeforeTest
    public void beforeMyTest(String br)
    {
         if (br.equalsIgnoreCase("chrome")) {
             System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
             driver = new ChromeDriver();
         }
         if(br.equalsIgnoreCase("firefox"))
         {

             WebDriverManager.firefoxdriver().setup();
             driver = new FirefoxDriver();
         }
    }

    @Test
    public void myTest()
    {
        driver.get("http://facebook.com");
    }

// this is commented tex for practicing github....
}

package Sanket;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGExample3 {
    /*@Test(groups = {"mytest","group2"}) *///(priority = 1)


    @Test// (groups="mytest")
    public void classThreeTest1()
    {
        System.out.println("classThreeTest1");


    //   Assert.assertEquals("amol","Aamol","strings are not equal");
    }


    @Test (groups = "Two")// (groups="mytest")
    public void classThreeTest2()
    {
        System.out.println("classThreeTest2");


        //   Assert.assertEquals("amol","Aamol","strings are not equal");
    }
  /*@Parameters({"user","pass"})*/

    /*@Parameters("browser")
    @Test //(priority = 3)
    public void classThreeTest2(String br)
    {

       // System.out.println(u);
       // System.out.println(x);
       //System.out.println(v);
        if(br.equals("chrome")) {
            WebDriverManager.chromedriver().setup();

            WebDriver driver = new ChromeDriver();
        }
        if(br.equals("firefox")) {
          WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
        }
        if(br.equals("InternetExplorer")) {
            WebDriverManager.iedriver().setup();
            WebDriver driver = new InternetExplorerDriver();
        }





        //  driver.get(u);
       // driver.get(v);

        System.out.println("classThreeTest2");
      *//*  System.out.println("username="+u);
        System.out.println("password="+p);*//*








    }*/
    @Test// (priority = 2)
    public void classThreeTest3()
    {
        System.out.println("classThreeTest3");
    }
}

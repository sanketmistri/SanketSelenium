package Sanket;

import org.testng.annotations.*;

public class TestNGExample1 {


  /*  @BeforeTest
    public void beforeMyTest()
    {
       // System.out.println();
        System.out.println("@BeforeTest");
    }


    @AfterTest
    public void AfterMyTest()
    {
        System.out.println("@AfterMyTest");
    }


    @BeforeSuite
    public void beforeMyTest1()
    {
        System.out.println("@BeforeSuite");
    }


    @AfterSuite
    public void AfterMyTest1()
    {
        System.out.println("@AfterSuite");
    }*/

   /* @BeforeTest
    public void beforeMyTest()
    {
      System.out.println();
      System.out.println("@BeforeTest");
    }


    @AfterTest
    public void AfterMyTest()
    {
        System.out.println("@AfterMyTest");
    }
  @BeforeSuite
    public void beforeMyTest1()
    {
        System.out.println("@BeforeSuite");
    }


    @AfterSuite
    public void AfterMyTest1()
    {
        System.out.println("@AfterSuite");
    }
    @Test(groups={"mytest","group2"})
    public void classOneTest1()
    {
        System.out.println("classOneTest1");
    }*/

    @Test //(priority = 2) //(groups="mytest")
    public void classOneTest1()
    {
        System.out.println("classOneTest1");

        //  System.out.println(osStr);
    }
    @Test//(priority = 3) //(enabled = false)
    public void classOneTest2()
    {
        System.out.println("classOneTest2");

      //  System.out.println(osStr);
    }
    @Test //(priority = 1)
    public void classOneTest3()
    {
        System.out.println("classOneTest3");
    }


}

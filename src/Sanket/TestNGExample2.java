package Sanket;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGExample2 {

    @Test (enabled = false) //(priority = 2) //(groups="mytest")
    public void classTwoTest1()
    {
        System.out.println("classTwoTest1");
    }

    @Test //(priority = 3)
    public void classTwoTest2()
    {
        System.out.println("classTwoTest2");

    }
    @Test// (priority = 1)
    public void classTwoTest3()
    {
        System.out.println("classTwoTest3");
    }

}

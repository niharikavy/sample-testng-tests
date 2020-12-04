package com.aio.tests.api;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.CustomAttribute;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class TestNGDataProviderTests {


    @DataProvider(name = "testDataProvider")
    public Object[][] testDataProvider() {
        return new Object[][] {
                {  37, 37, ""},
                {  36, 35, "SCRUM-TC-1622" },
                {  35, 34, ""},
        };
    }

    @Test(dataProvider = "testDataProvider", groups = "SCRUM-TC-1621")
    public void dataProviderTestDefGroupAndOneOverriden(Integer n2, Integer n1, String tcName) {
        //Your test goes here
        System.out.println( n2);
        Assert.assertEquals(n1, n2, "Verify " + n1 + " == " + n2);
    }

    @DataProvider(name = "testDataProvider1")
    public Object[][] testDataProvider1() {
        return new Object[][] {
                {  37, 37},
                {  36, 35 }
        };
    }

    @Test(dataProvider = "testDataProvider1")
    public void noTest(Integer n2, Integer n1) {
        //Your test goes here
        System.out.println( n2);
        Assert.assertEquals(n1, n2, "Verify " + n1 + " == " + n2);
    }



    @Test(dataProvider = "testDataProvider2", dataProviderClass = DPClass.class)
    public void onlyOneTestAnnotated(Integer n2, Integer n1, String tcName) {
        //Your test goes here
        System.out.println( n2);
        Assert.assertEquals(n1, n2, "Verify " + n1 + " == " + n2);
    }

}

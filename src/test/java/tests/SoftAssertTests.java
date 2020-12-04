package com.aio.tests;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.CustomAttribute;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.internal.TestResult;

public class SoftAssertTests {
    @Test(attributes = {@CustomAttribute(name = "joy", values = {"Brownie"})}, groups = "SCRUM-TC-4651" )
    public void testSoftAssertInOne() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(2, 3, "Verify 2 === 3");
        softAssert.assertNotEquals(2,3, "Verify 2!== 3");
        softAssert.assertTrue(false,"No way this is happening");
        ITestResult result = Reporter.getCurrentTestResult();
        result.setAttribute("really","what");
        softAssert.assertAll();

    }

    @Test(groups = "SCRUM-TC-4650")
    public void abc() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Apples", "Oranges", "Verify apples can sometimes be oranges");
        String abc = null;
        System.out.println(abc.split(","));
    }
}

package com.aio.tests.tng;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SkippedTests {
    @BeforeMethod(groups = "NVPROJ-TC-12",description = "is here")
    public void serverStartedOk() {
        Assert.fail("Server didn't start");
    }

    @Test( groups = "NVPROJ-TC-13")
    public void skippedTest() {
        System.out.println("This doesn't get executed");
    }

    @Test(groups = { "init" })
    public void initEnvironment() {
        Assert.fail("Server didn't start");
    }

    @Test(dependsOnGroups = { "init.*" }, groups = "NVPROJ-TC-14")
    public void method1() {
        System.out.println("This doesn't get executed - skipped due to group failure");
    }




}

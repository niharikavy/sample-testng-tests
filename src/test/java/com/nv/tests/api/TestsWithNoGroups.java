package com.nv.tests.api;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.CustomAttribute;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestsWithNoGroups {



    @Test( groups = {"NVTES-TC-3"}, description = "Description for failing test",
            attributes = {@CustomAttribute(name="aio_key", values = "tcname")})
    public void failingTest() {
        Reporter.log("See what happens here");
        Assert.assertEquals(1,1, "done");
    }

    @Test( groups = {"NVTES-TC-4"}, description = "Description for failing test")
    public void failingTest2() {
        Assert.assertEquals(0,1, "done");
    }

    @Test( groups = {"NVTES-TC-6"}, description = "Description for failing test",
            attributes = {@CustomAttribute(name="aio_key", values = "tcname")})
    public void failingTest3() {

        Assert.assertEquals(0,1, "done");
    }


}

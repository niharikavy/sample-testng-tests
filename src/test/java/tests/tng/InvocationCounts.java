package com.aio.tests.tng;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class InvocationCounts {
    @Test(invocationCount = 5, groups = {"NVPROJ-TC-1583"})
    public void multipleInvocationCount() {
        Random r = new Random();
        int a = r.nextInt();
        Assert.assertTrue((a % 2) == 0);
    }
}

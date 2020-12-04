package com.nv.tests.api;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DPClass {
    @DataProvider(name = "testDataProvider2")
    public Object[][] testDataProvider2(Method method) {
        System.out.println(method.getDeclaringClass());
        return new Object[][] {
                {  37, 37,""},
                {  36, 35, "SCRUM-TC-1619" },
                {  35, 33, ""},
        };
    }
}

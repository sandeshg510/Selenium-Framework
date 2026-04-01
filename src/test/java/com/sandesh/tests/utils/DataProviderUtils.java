package com.sandesh.tests.utils;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {

    @DataProvider
    public static Object[][] loginData() {
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"problem_user", "secret_sauce"}
        };
    }

}

package com.sandesh.tests;

import com.sandesh.framework.base.DriverFactory;
import com.sandesh.framework.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void verifyValidLogin() {

        LoginPage loginPage = new LoginPage();

        loginPage.login("user1", "user123");

        String currentUrl = DriverFactory
                .getDriver()
                .getCurrentUrl();

        Assert.assertTrue(currentUrl.contains("Inventory"), "Login Failed");
    }

}

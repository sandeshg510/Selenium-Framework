package com.sandesh.tests;

import com.sandesh.framework.base.DriverFactory;
import com.sandesh.framework.pages.LoginPage;
import com.sandesh.tests.listeners.RetryAnalyzer;
import com.sandesh.tests.listeners.TestListener;
import com.sandesh.tests.utils.DataProviderUtils;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class LoginTest extends BaseTest {

    @Test(dataProvider = "loginData", dataProviderClass = DataProviderUtils.class,
            retryAnalyzer = RetryAnalyzer.class)
    public void verifyValidLogin(String username, String password) {

        LoginPage loginPage = new LoginPage();

        loginPage.login(username, password);

        String currentUrl = DriverFactory
                .getDriver()
                .getCurrentUrl();

        Assert.assertTrue(currentUrl.contains("inventory"),
                          "Login failed for user: " + username);
    }

}

//package com.sandesh.tests;
//
//import com.sandesh.framework.pages.HomePage;
//import com.sandesh.framework.pages.LoginPage;
//import com.sandesh.tests.utils.DataProviderUtils;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
/// /@Listeners(TestListener.class)
//public class LoginTest extends BaseTest {
//
//    @Test(dataProvider = "loginData", dataProviderClass = DataProviderUtils.class
////            retryAnalyzer = RetryAnalyzer.class
//    )
//    public void verifyValidLogin(String username, String password) throws InterruptedException {
//        HomePage homePage = new HomePage();
//        Thread.sleep(3000);
//        homePage.clickLogin();
//        LoginPage loginPage = new LoginPage();
//
//        loginPage.login(username, password);
//
//        Assert.assertTrue(loginPage.isLoginSuccessful(),
//                          "Login failed for given user: " + username);
//    }
//
//}

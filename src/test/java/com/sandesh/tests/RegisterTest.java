package com.sandesh.tests;

import com.sandesh.framework.pages.AccountSuccessPage;
import com.sandesh.framework.pages.HomePage;
import com.sandesh.framework.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    void verifyRegisterByProvidingAllFields() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.clickMyAccount();
        homePage.clickRegisterButton();
        RegisterPage registerPage = new RegisterPage();
        registerPage.enterFirstName("Sandy");
        registerPage.enterLastName("G");
        registerPage.enterEmail("sandeshgore51@gmail.com");
        registerPage.enterPassword("sandy123");
        registerPage.checkPrivacyPolicyCheckbox();
        registerPage.clickContinueButton();
        Thread.sleep(10000);
        AccountSuccessPage successPage = new AccountSuccessPage();
        Assert.assertTrue(successPage.getSuccessText()
                                     .contains("Your Account Has Been Created!"));
    }

    void verifyRegisterByProvidingOnlyRequiredFields() {

    }

}

package com.sandesh.framework.pages;

import com.sandesh.framework.utils.WaitUtils;
import org.openqa.selenium.By;

public class LoginPage {

    private final By usernameField = By.id("Email");
    private final By passwordField = By.id("Password");
    private final By loginButton = By.className("button-1 login-button");

    public LoginPage enterUsername(String username) {
        WaitUtils
                .waitForVisibility(usernameField)
                .sendKeys(username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        WaitUtils
                .waitForVisibility(passwordField)
                .sendKeys(password);
        return this;
    }

    public void clickLogin() {
        WaitUtils
                .waitForClickability(loginButton)
                .click();
    }

    public void login(String username, String password) {
        enterUsername(username)
                .enterPassword(password)
                .clickLogin();
    }

}

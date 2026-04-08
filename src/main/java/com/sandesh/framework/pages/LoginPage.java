package com.sandesh.framework.pages;

import com.sandesh.framework.utils.LoggerUtils;
import io.qameta.allure.Step;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private static final Logger log = LoggerUtils.getLogger(LoginPage.class);

    private final By usernameField = By.id("Email");
    private final By passwordField = By.id("Password");
    private final By loginButton = By.className("button-1 login-button");

    @Step("Enter Username: {0}")
    public LoginPage enterUsername(String username) {
        log.info("Entering username: {}", username);
        type(usernameField, username);
        return this;
    }

    @Step("Enter password")
    public LoginPage enterPassword(String password) {
        log.info("Entering password");
        type(passwordField, password);
        return this;
    }

    @Step("Click login button")
    public void clickLogin() {
        log.info("Clicking login button");
        click(loginButton);
    }

    public void login(String username, String password) {
        enterUsername(username)
                .enterPassword(password)
                .clickLogin();
    }

    public boolean isLoginSuccessful() {
        return getCurrentUrl().contains("inventory");
    }

}

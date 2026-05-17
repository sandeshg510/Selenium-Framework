package com.sandesh.framework.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By myAccountDropdown = By.linkText("My Account");
    private By registerButton = By.linkText("Register");
    private By loginButton = By.linkText("Login");

    public void clickMyAccount() {
        click(myAccountDropdown);
    }

    public void clickRegisterButton() {
        click(registerButton);
    }

    public void clickLoginButton() {
        click(loginButton);
    }

}
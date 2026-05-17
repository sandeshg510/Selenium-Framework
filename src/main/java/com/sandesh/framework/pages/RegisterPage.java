package com.sandesh.framework.pages;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage {

    private By firstNameField = By.id("input-firstname");
    private By lastNameField = By.id("input-lastname");
    private By emailField = By.id("input-email");
    private By passwordField = By.id("input-password");
    private By subscribeCheckbox = By.id("input-newsletter");
    private By privacyPolicyCheckbox = By.name("agree");
    private By continueButton = By.xpath("//button[text()='Continue']");

    public void enterFirstName(String text) {
        type(firstNameField, text);
    }

    public void enterLastName(String text) {
        type(lastNameField, text);
    }

    public void enterEmail(String text) {
        type(emailField, text);
    }

    public void enterPassword(String text) {
        type(passwordField, text);
    }

    public void checkPrivacyPolicyCheckbox() {
        click(privacyPolicyCheckbox);
    }

    public void clickContinueButton() {
        click(continueButton);
    }

}

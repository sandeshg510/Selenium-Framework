package com.sandesh.framework.pages;

import org.openqa.selenium.By;

public class AccountSuccessPage extends BasePage {

    private By successText = By.id("content");

    public String getSuccessText() {
        return getText(successText);
    }

}

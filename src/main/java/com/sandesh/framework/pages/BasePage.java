package com.sandesh.framework.pages;

import com.sandesh.framework.base.DriverFactory;
import com.sandesh.framework.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasePage {

    protected WebElement find(By locator) {
        return WaitUtils.waitForVisibility(locator);
    }

    protected void click(By locator) {
        WaitUtils.waitForClickability(locator)
                 .click();
    }

    protected void type(By locator, String text) {
        find(locator).sendKeys(text);
    }

    protected String getText(By locator) {
        return find(locator).getText();
    }

    protected String getCurrentUrl() {
        return DriverFactory.getDriver()
                            .getCurrentUrl();
    }

}

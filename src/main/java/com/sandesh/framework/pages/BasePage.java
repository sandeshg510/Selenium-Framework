package com.sandesh.framework.pages;

import com.sandesh.framework.base.DriverFactory;
import com.sandesh.framework.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {

    protected WebElement find(By locator) {
        return WaitUtils.waitForVisibility(locator);
    }

    protected List<WebElement> findElements(By locator) {
        return WaitUtils.waitForAllElementsVisibility(locator);
    }

    protected void click(By locator) {
        WebElement element = WaitUtils.waitForClickability(locator);
        try {
            element.click();
        } catch (Exception e) {

            //Scroll to center
            ((JavascriptExecutor) DriverFactory.getDriver()).executeScript(
                    "arguments[0].scrollIntoView({block: 'center'});", element);

            try {
                element.click();
            } catch (Exception ex) {
                //JS fallback click
                ((JavascriptExecutor) DriverFactory.getDriver()).executeScript(
                        "arguments[0].click();", element
                );
            }
        }
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

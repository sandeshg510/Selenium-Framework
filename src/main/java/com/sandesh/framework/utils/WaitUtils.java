package com.sandesh.framework.utils;

import com.sandesh.framework.base.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public final class WaitUtils {

    // Waits until the element is visible on the page and returns it
    public static WebElement waitForVisibility(By locator) {
        return new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(
                Long.parseLong(ConfigReader.get("explicitWait")))).until(
                ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForClickability(By locator) {
        return new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(
                Long.parseLong(ConfigReader.get("explicitWait")))).until(
                ExpectedConditions.elementToBeClickable(locator));
    }

}
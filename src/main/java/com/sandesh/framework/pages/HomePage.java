package com.sandesh.framework.pages;

import com.sandesh.framework.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By searchBox = By.id("small-searchterms");
    private By searchButton = By.cssSelector("button[type='submit']");
    private By productItems = By.cssSelector(".product-grid");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterSearchText(String text) {
        WaitUtils.waitForElementVisible(driver, searchBox).sendKeys(text);
    }

    public void clickSearch() {
        WaitUtils.waitForElementVisible(driver, searchButton).click();
    }

    public int getSearchResultsCount() {
        WaitUtils.waitForElementVisible(driver, productItems);
        return driver.findElements(productItems).size();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}

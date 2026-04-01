package com.sandesh.tests;

import com.sandesh.framework.pages.HomePage;
import com.sandesh.framework.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void verifyHomePageTitle() {
        driver.get(ConfigReader.getProperty("baseUrl"));
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.getPageTitle().contains("nopCommerce"));
    }

    @Test
    public void verifySearchResults() {
        driver.get(ConfigReader.getProperty("baseUrl"));
        HomePage homePage = new HomePage(driver);
        homePage.enterSearchText("Laptop");
        homePage.clickSearch();
        Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains("q=laptop"));
        Assert.assertTrue(homePage.getSearchResultsCount() > 0);
    }
}

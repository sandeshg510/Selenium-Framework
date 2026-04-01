package com.sandesh.framework.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initDriver(String browser) {
        if ("chrome".equalsIgnoreCase(browser)) {
            WebDriverManager.chromedriver().setup();
            driver.set(new ChromeDriver());
        } else if ("firefox".equalsIgnoreCase(browser)) {
            WebDriverManager.firefoxdriver().setup();
            driver.set(new FirefoxDriver());
        } else {
            throw new RuntimeException("Unsupported browser: " + browser);
        }

        driver.get().manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}

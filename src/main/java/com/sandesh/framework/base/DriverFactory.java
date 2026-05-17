package com.sandesh.framework.base;

import com.sandesh.framework.factory.OptionsManager;
import com.sandesh.framework.utils.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private DriverFactory() {
    }

    public static void initDriver(String browser) {

        if (browser == null || browser.isEmpty()) {
            browser = System.getProperty("browser");          // from CLI
        }

        if (browser == null || browser.isEmpty()) {
            browser = ConfigReader.get("browser");
        }

        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver()
                                .setup();
                driver.set(new ChromeDriver(OptionsManager.getChromeOptions()));
                break;

            case "firefox":
                WebDriverManager.firefoxdriver()
                                .setup();
                driver.set(new FirefoxDriver(OptionsManager.getFirefoxOptions()));
                break;

            default:
                throw new RuntimeException("Unsupported browser: " + browser);
        }

        getDriver().manage()
                   .window()
                   .maximize();
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        driver.get()
              .quit();
        driver.remove();
    }

}

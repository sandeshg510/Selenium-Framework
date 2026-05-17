package com.sandesh.framework.factory;

import com.sandesh.framework.utils.ConfigReader;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class OptionsManager {

    public static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();

        if (Boolean.parseBoolean(ConfigReader.get("incognito"))) {
            options.addArguments("--user-data-dir=/tmp/fresh-profile");
        }

        if (Boolean.parseBoolean(ConfigReader.get("headless"))) {
            options.addArguments("--headless=new");
        }
        return options;
    }

    public static FirefoxOptions getFirefoxOptions() {
        FirefoxOptions options = new FirefoxOptions();

        if (Boolean.parseBoolean(ConfigReader.get("incognito"))) {
            options.addArguments("-private");
        }

        if (Boolean.parseBoolean(ConfigReader.get("headless"))) {
            options.addArguments("-headless");
        }
        return options;
    }

}

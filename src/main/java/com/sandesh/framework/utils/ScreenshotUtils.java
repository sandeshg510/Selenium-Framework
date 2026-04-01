package com.sandesh.framework.utils;

import com.sandesh.framework.base.DriverFactory;
import com.sandesh.framework.constants.FrameworkConstants;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtils {

    private ScreenshotUtils() {}

    public static String captureScreenshot(String testName) {
        File src =
                ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);

        String path = FrameworkConstants.SCREENSHOT_PATH + testName + ".png";

        try {
            FileUtils.copyFile(src, new File(path));
        } catch (IOException e) {
            throw new RuntimeException("Failed to capture screenshot", e);
        }

        return path;
    }

}

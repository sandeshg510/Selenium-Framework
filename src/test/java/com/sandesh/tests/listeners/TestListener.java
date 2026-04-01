package com.sandesh.tests.listeners;

import com.sandesh.framework.utils.ScreenshotUtils;
import io.qameta.allure.Allure;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        String testName = result
                .getMethod()
                .getMethodName();

        String screenshotPath = ScreenshotUtils.captureScreenshot(testName);

        try {
            Allure.addAttachment(testName, new FileInputStream(screenshotPath));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Failed to attach screenshot", e);
        }
    }

}

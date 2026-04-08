package com.sandesh.tests.listeners;

import com.sandesh.framework.utils.LoggerUtils;
import com.sandesh.framework.utils.ScreenshotUtils;
import io.qameta.allure.Allure;
import org.apache.logging.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestListener implements ITestListener {

    public static final Logger log = LoggerUtils.getLogger(TestListener.class);

    @Override
    public void onTestStart(ITestResult result) {
        log.info("STARTING TEST: {}", result.getMethod()
                                            .getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        log.info("PASSED TEST: {}", result.getMethod()
                                          .getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String testName = result
                .getMethod()
                .getMethodName();

        log.error("FAILED TEST: {}", testName);

        String screenshotPath = ScreenshotUtils.captureScreenshot(testName);

        try {
            Allure.addAttachment(testName, new FileInputStream(screenshotPath));
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Failed to attach screenshot", e);
        }
    }

}

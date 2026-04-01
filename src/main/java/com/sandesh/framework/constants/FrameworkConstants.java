package com.sandesh.framework.constants;

/**
 * Framework-level constants used across the project
 */
public final class FrameworkConstants {

    private FrameworkConstants() {
        // Prevent instantiation
    }

    public static final String CONFIG_FILE_PATH =
            System.getProperty("user.dir") + "/config/config.properties";

    public static final String SCREENSHOT_PATH =
            System.getProperty("user.dir") + "/test-output/screenshots/";
}
package com.sandesh.framework.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;
    private static final String PROPERTIES_FILE_PATH = "config/config.properties";

    private ConfigReader() {
    }

    static {
        properties = new Properties();

        try (InputStream input = new FileInputStream(PROPERTIES_FILE_PATH)) {
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties file", e);
        }
    }

    public static String getProperty(String key) {
        String value = properties.getProperty(key);
        if (value == null) {
            throw new RuntimeException("Key not found in config.properties: " + key);
        }
        return value;
    }
}

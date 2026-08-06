package com.opencart.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    Properties prop = new Properties();

    public ConfigReader() throws Exception {

        FileInputStream file = new FileInputStream("src/main/resources/config.properties");
        prop.load(file);

    }

    public String getProperty(String key) {

        return prop.getProperty(key);

    }

}
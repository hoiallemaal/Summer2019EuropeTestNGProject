package com.cybertek.tests.day13_properties_driver_testbase;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class PropertiesTest {

    @Test

    public void test1(){


        String browser= ConfigurationReader.get("browser");
        System.out.println(browser);

        String url=ConfigurationReader.get("url");
        System.out.println(url);

        //if your key not exist in properties file, it will return null
        System.out.println(ConfigurationReader.get("storemanager"));
    }

}
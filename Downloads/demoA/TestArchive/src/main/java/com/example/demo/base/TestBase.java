package com.example.demo.base;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {
    //private static TestBase helperClass;


    public static WebDriver driver;

   public static void setBrowser() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\gkaar\\Downloads\\geckodriver-v0.33.0-win64(1)\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }



}

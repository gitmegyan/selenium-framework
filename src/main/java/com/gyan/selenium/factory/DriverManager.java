package com.gyan.selenium.factory;


import org.openqa.selenium.WebDriver;

public class DriverManager {
    private static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();


    public static WebDriver driver() {
        return threadLocal.get();
    }

    public static void setDriver(WebDriver webDriver) {
        threadLocal.set(webDriver);
    }
}

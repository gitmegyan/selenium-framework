package com.gyan.selenium.factory;

import org.springframework.stereotype.Component;

public class BrowserManager {

    private static final ThreadLocal<String> browserThreadLocal = ThreadLocal.withInitial(() -> "chrome");

    public static String getBrowser() {
        return browserThreadLocal.get();
    }

    public static void setBrowser(String browser) {
        browserThreadLocal.set(browser);
    }

    public static void clearBrowser() {
        browserThreadLocal.remove();
    }


}

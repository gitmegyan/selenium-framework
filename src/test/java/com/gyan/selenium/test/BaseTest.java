package com.gyan.selenium.test;

import com.gyan.selenium.factory.BrowserManager;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

@SpringBootTest
public class BaseTest extends AbstractTestNGSpringContextTests {

    @BeforeMethod
    @Parameters("browser")
    public void beforeMethod(String browser) {
        BrowserManager.setBrowser(browser);
    }

    @AfterMethod
    public void quitDriver() {
        BrowserManager.clearBrowser();
    }
}

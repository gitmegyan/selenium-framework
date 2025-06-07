package com.gyan.selenium.test;

import com.gyan.selenium.factory.DriverFactory;
import com.gyan.selenium.models.BrowserType;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.gyan.selenium.factory.DriverManager.driver;
import static com.gyan.selenium.factory.DriverManager.setDriver;

@SpringBootTest
public class BaseTest extends AbstractTestNGSpringContextTests {

    @BeforeMethod
    public void beforeMethod() {
        setDriver(DriverFactory.createDriver(BrowserType.CHROME));
    }

    @AfterMethod
    public void quitDriver() {
        driver().quit();
    }
}

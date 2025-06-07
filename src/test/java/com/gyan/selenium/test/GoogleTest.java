package com.gyan.selenium.test;

import com.gyan.selenium.pages.HomePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import static com.gyan.selenium.factory.DriverManager.driver;

public class GoogleTest extends BaseTest{

    @Autowired
    private HomePage homePage;

    @Test
    public void testGoogle() throws InterruptedException {
        homePage.isLoaded();
        Thread.sleep(10000);
    }
}

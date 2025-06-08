package com.gyan.selenium.test;

import com.gyan.selenium.pages.LoginPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest
public class HrmTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private LoginPage loginPage;

    @Test
    public void test() {
        loginPage.openPage();
        loginPage.isLoaded();
    }
}

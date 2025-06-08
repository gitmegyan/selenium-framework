package com.gyan.selenium.test;

import com.gyan.selenium.annotation.LazyAutowired;
import com.gyan.selenium.pages.HomePage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

@Slf4j
public class GoogleTest extends BaseTest {

    @LazyAutowired
    private HomePage homePage;

    @Test
    public void testGoogle1() throws InterruptedException {
        homePage.isLoaded();
        logger.info("Page opened");
        Thread.sleep(5000);
    }

//    @Test
//    public void testGoogle2() throws InterruptedException {
//        homePage.isLoaded();
//        logger.info("Page opened");
//        Thread.sleep(5000);
//    }
//    @Test
//    public void testGoogle3() throws InterruptedException {
//        homePage.isLoaded();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void testGoogle4() throws InterruptedException {
//        homePage.isLoaded();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void testGoogle5() throws InterruptedException {
//        homePage.isLoaded();
//        Thread.sleep(5000);
//    }
//    @Test
//    public void testGoogle6() throws InterruptedException {
//        homePage.isLoaded();
//        Thread.sleep(5000);
//    }
}

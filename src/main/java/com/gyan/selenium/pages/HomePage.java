package com.gyan.selenium.pages;

import com.gyan.selenium.annotation.Page;


@Page
public class HomePage extends BasePage {

    @Override
    public boolean isLoaded() {
        driver.get("https://start.spring.io/");
//        return wait.until(driver -> driver.getTitle().equals("Spring Initializr"));
        return true;
    }
}

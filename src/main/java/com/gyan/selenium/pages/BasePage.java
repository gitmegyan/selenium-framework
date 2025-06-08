package com.gyan.selenium.pages;

import com.gyan.selenium.annotation.LazyAutowired;
import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public abstract class BasePage {
    @Autowired
    protected WebDriver driver;

    @Autowired
    protected WebDriverWait wait;

    @PostConstruct
    private void setPageFactory() {
        PageFactory.initElements(driver, this);
    }

    abstract boolean isLoaded();

}

package com.gyan.selenium.pages;

import com.gyan.selenium.config.WebDriverConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;

@Component
public abstract class BasePage {

    protected WebDriver driver;

    @Autowired
    protected WebDriverWait wait;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    abstract boolean isLoaded();

}

package com.gyan.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import static com.gyan.selenium.factory.DriverManager.driver;

@Component
@Lazy
public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);

    }

    @Override
    public boolean isLoaded() {
        driver.get("https://start.spring.io/");
        return wait.until(driver -> driver.getTitle().equals("Spring Initializr"));
    }
}

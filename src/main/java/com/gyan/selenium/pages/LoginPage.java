package com.gyan.selenium.pages;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LoginPage extends BasePage {

    @Value("${application.url}")
    private String url;

    public void openPage() {
        driver.get(url);
    }

    public boolean isLoaded() {
        return wait.until(driver -> driver.getTitle().contains("OrangeHRM"));
    }
}
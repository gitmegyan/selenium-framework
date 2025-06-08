package com.gyan.selenium.pages;

import com.gyan.selenium.annotation.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@Page
public class LoginPage extends BasePage {

    @FindBy(name = "username")
    private WebElement userName;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(tagName = "button")
    private WebElement loginButton;

    @Override
    public boolean isLoaded() {
        driver.get("https://start.spring.io/");
//        return wait.until(driver -> driver.getTitle().equals("Spring Initializr"));
        return true;
    }

    public boolean login(String userName, String password) {
        this.userName.sendKeys(userName);
        this.password.sendKeys(password);
        loginButton.click();
        return wait.until(webDriver -> loginButton.isDisplayed());
    }


}

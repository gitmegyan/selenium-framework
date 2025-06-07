package com.gyan.selenium.factory;

import com.gyan.selenium.config.WebDriverConfig;
import com.gyan.selenium.models.BrowserType;
import com.gyan.selenium.models.TestDataModel;
import lombok.experimental.UtilityClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;

@UtilityClass
public class DriverFactory {



    public static WebDriver createDriver(BrowserType browesertyep) {
        WebDriver driver;

        switch (browesertyep) {
            case CHROME:
                driver = new ChromeDriver();
                return driver;
            default:
                throw new RuntimeException("Browser is not supported");
        }


    }
}

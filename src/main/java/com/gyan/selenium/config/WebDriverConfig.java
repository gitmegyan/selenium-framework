package com.gyan.selenium.config;


import com.gyan.selenium.annotation.LazyConfiguration;
import com.gyan.selenium.annotation.ThreadScopeBean;
import com.gyan.selenium.factory.BrowserManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//@Profile("!remote")
@LazyConfiguration
public class WebDriverConfig {


    private final WebDriver driver;

    public WebDriverConfig() {
        this.driver = createWebDriver();
    }

    private WebDriver createWebDriver() {
        String browser = BrowserManager.getBrowser();
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            default:
                throw new UnsupportedOperationException("browser is not supported yet");

        }
    }

    @ThreadScopeBean
    public WebDriver webDriver() {
        return this.driver;
    }


}

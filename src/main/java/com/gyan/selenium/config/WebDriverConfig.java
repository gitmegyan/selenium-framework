package com.gyan.selenium.config;


import com.gyan.selenium.annotation.LazyConfiguration;
import com.gyan.selenium.annotation.ThreadScopeBean;
import com.gyan.selenium.factory.BrowserManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

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

//    @ThreadScopeBean
//    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
//    public WebDriver firefoxDriver(){
//
//        WebDriverManager.firefoxdriver().setup();
//        return new FirefoxDriver();
//    }
//
//    @ThreadScopeBean
//    @ConditionalOnMissingBean
//    public WebDriver chromeDriver(){
//        WebDriverManager.chromedriver().setup();
//        return new ChromeDriver();
//    }

}

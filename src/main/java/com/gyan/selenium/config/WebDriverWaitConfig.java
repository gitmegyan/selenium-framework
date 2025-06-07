package com.gyan.selenium.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.time.Duration;

@Configuration
public class WebDriverWaitConfig {

    @Value("${wait.timeout}")
    private long timeput;

    @Bean
    @Lazy
    public WebDriverWait waitConfig(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeput));
        return wait;
    }
}

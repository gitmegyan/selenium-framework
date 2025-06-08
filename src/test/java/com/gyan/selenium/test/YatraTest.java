package com.gyan.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;

import java.time.YearMonth;

@SpringBootTest
public class YatraTest extends BaseTest{

    @Autowired
    private WebDriverWait wait;

    @Test
    public void findMinPriceInCurrentMonth() throws InterruptedException {
        driver.get("https://www.yatra.com/");
        wait.until(d -> driver.findElement(By.xpath("//div[@aria-label='Departure Date inputbox']")).isDisplayed());
        driver.findElement(By.xpath("//div[@aria-label='Departure Date inputbox']")).click();
        String cuurentYearAndMonth = YearMonth.now().toString();
        int minPrice = driver
                .findElements(By.xpath("//div[@aria-label='month  "+ cuurentYearAndMonth + "']//span[@class='custom-day-content ']"))
                .stream()
                .mapToInt(elem -> Integer.parseInt(elem.getText().replaceAll("[^0-9]", "")))
                .min()
                .getAsInt();
        System.out.println(minPrice);
    }

//    @Test
//    public void findMinPriceInNextMonth() throws InterruptedException {
//        driver.get("https://www.yatra.com/");
//        wait.until(d -> driver.findElement(By.xpath("//div[@aria-label='Departure Date inputbox']")).isDisplayed());
//        driver.findElement(By.xpath("//div[@aria-label='Departure Date inputbox']")).click();
//        String nextYearInMonth = YearMonth.now().plusMonths(1).toString();
//        int minPrice = driver
//                .findElements(By.xpath("//div[@aria-label='month  "+ nextYearInMonth + "']//span[@class='custom-day-content ']"))
//                .stream()
//                .mapToInt(elem -> Integer.parseInt(elem.getText().replaceAll("[^0-9]", "")))
//                .min()
//                .getAsInt();
//        System.out.println(minPrice);
    //}
}

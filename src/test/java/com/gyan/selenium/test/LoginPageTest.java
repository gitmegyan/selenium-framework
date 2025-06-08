package com.gyan.selenium.test;

import com.gyan.selenium.annotation.LazyAutowired;
import com.gyan.selenium.models.TestDataModel;
import com.gyan.selenium.pages.HomePage;
import com.gyan.selenium.pages.LoginPage;
import com.gyan.selenium.test.dataprovider.TestDataProvider;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

@Slf4j
public class LoginPageTest extends BaseTest {

    @LazyAutowired
    private HomePage homePage;

    @LazyAutowired
    private LoginPage loginPage;

    @Test(dataProvider = "getTestData",dataProviderClass = TestDataProvider.class)
    public void loginTest(TestDataModel testDataModel) throws InterruptedException {
       loginPage.login(testDataModel.getPages().get("loginPage").get("userName").toString(), testDataModel.getPages().get("loginPage").get("password").toString());

    }

}

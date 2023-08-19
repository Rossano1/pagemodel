package com.Page.Model;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class HomePageTest {
    private WebDriver driver;
    private HomePage homePage;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.get("https://aspiration.com/");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test
    public void testClickGetAccountButton() {
        homePage.navigateTo();
        homePage.clickGetAccountButton();
        
    }
}

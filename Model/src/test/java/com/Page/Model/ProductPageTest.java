package com.Page.Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProductPageTest {
    private WebDriver driver;
    private ProductPage productPage;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        productPage = new ProductPage(driver);
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test
    public void testVerifyPrice() {
        productPage.navigateTo(); 
        boolean isPriceCorrect = productPage.verifyPrice(5.99 * 12);
        Assert.assertTrue(isPriceCorrect, "Yearly cost for Aspiration Plus is incorrect.");
    }

    @Test
    public void testIsCardProductDisplayed() {
         productPage.navigateTo(); 
        Assert.assertTrue(productPage.isCardProductDisplayed("Aspiration"), "Aspiration card product not displayed.");
    }

   
}

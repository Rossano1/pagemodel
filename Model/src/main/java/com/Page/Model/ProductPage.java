package com.Page.Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean verifyPrice(double expectedCost) {
        WebElement costElement = driver.findElement(By.cssSelector("[data-testid='spend-and-save-yearly-price']"));
        String actualText = costElement.getText();
        double actualCost = extractCostValue(actualText);
        return actualCost == expectedCost;
    }

    private double extractCostValue(String actualText) {
      
        return 0; 
    }

    public boolean isCardProductDisplayed(String productName) {
        WebElement productElement = driver.findElement(By.xpath("//h2[contains(text(), '" + productName + "')]"));
        return productElement.isDisplayed();
    }

    public void clickGetStarted() {
        WebElement getStartedButton = driver.findElement(By.xpath("//button[contains(text(), 'Get Started')]"));
        getStartedButton.click();
    }

	public void navigateTo() {

		
	}

	
}

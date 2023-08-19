package com.Page.Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      WebDriver driver = new ChromeDriver();
      driver.get("https://aspiration.com/");
      homepage(driver);
      price(5.99, driver);
      clickGetStarted(driver);
    }
    public static void homepage(WebDriver driver) {
    	WebElement solubutton = driver.findElement(By.cssSelector("[data-testid='nav-bar-get-account']"));
    	solubutton.click();
    	
    }
    public static boolean price(double expectedCost, WebDriver driver) {
        WebElement costElement = driver.findElement(By.cssSelector("[data-testid='spend-and-save-yearly-price']"));
        String actualText = costElement.getText();
        double actualCost = extractCostValue(actualText);
        return actualCost == expectedCost;
}
private static double extractCostValue(String actualText) {
	
	return 0;
}
public boolean isCardProductDisplayed(String productName, WebDriver driver) {
    WebElement productElement = driver.findElement(By.xpath("//h2[contains(text(), '" + productName + "')]"));
    return productElement.isDisplayed();
}

public static void clickGetStarted(WebDriver driver) {
    WebElement getStartedButton = driver.findElement(By.xpath("//button[contains(text(), 'Get Started')]"));
    getStartedButton.click();
}
}


package com.Page.Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickGetAccountButton() {
        WebElement solubutton = driver.findElement(By.cssSelector("[data-testid='nav-bar-get-account']"));
        solubutton.click();
    }

	public void navigateTo() {
		// TODO Auto-generated method stub
		
	}

}

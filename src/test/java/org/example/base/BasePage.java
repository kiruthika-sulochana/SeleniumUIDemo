package org.example.base;

import org.example.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    protected WebDriver driver = DriverFactory.getDriver();

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

}

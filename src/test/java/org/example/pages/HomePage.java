package org.example.pages;

import junit.framework.AssertionFailedError;
import org.example.base.BasePage;
import org.example.base.BaseTest;
import org.example.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);

    }

    private By title = By.tagName("h1");

    public String getTitleText() {
        return driver.findElement(title).getText();
    }

    public boolean isTitleDisplayed() {
        return driver.findElement(title).isDisplayed();
    }

}

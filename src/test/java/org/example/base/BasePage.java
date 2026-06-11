package org.example.base;

import org.example.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public abstract class BasePage {

    protected WebDriver driver = DriverFactory.getDriver();

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public static String getElementText(By locator)
    {
        return DriverFactory.getDriver().findElement(locator).getText();
    }

    public static String getElementsText(By locator)
    {
        List<WebElement> list = DriverFactory.getDriver().findElements(locator);
        List<String> listText = new ArrayList<>();

        for(WebElement test : list)
        {
            listText.add( test.getText());
        }

        return listText.toString();
    }

    public static boolean isElementDisplayed(By locator)
    {
        boolean result = DriverFactory.getDriver().findElement(locator).isDisplayed();
        return result;
    }

    public static String getInputValue(By locator)
    {
        return DriverFactory.getDriver()
                .findElement(locator)
                .getAttribute("value");
    }

    public static void sendDataValues(By locator, String value)
    {
        WebElement element = DriverFactory.getDriver().findElement(locator);
        element.sendKeys(value);
    }

}

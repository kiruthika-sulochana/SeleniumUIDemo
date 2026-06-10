package org.example.base;

import org.example.utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void SetUp()
    {
        driver = DriverFactory.getDriver();
        driver.get("file:///Users/kiruthika/Downloads/selenium_practice.html");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown()
    {
       DriverFactory.quitDriver();
    }
}

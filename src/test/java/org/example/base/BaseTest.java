package org.example.base;

import org.example.utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void SetUp(ITestContext context)
    {
        DriverFactory.initDriver();
        driver = DriverFactory.getDriver();
        // Resolve the HTML file relative to the project, so it works both locally and in CI
        String htmlPath = System.getProperty("test.page.url",
                "file://" + System.getProperty("user.dir") + "/src/test/resources/selenium_practice.html");
        driver.get(htmlPath);
        driver.manage().window().maximize();
        context.setAttribute("driver", driver);
    }

    @AfterMethod
    public void tearDown()
    {
       DriverFactory.quitDriver();
    }
}

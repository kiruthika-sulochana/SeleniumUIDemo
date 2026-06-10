package org.example.tests;

import org.example.base.BaseTest;
import org.example.listeners.TestListeners;
import org.example.pages.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListeners.class)
public class HomePageTests extends BaseTest {

    HomePage homePage = new HomePage(driver);

    @Test
    public void verifyTitle()
    {

        String titleText = homePage.getTitleText();

        System.out.println("Title is: " + titleText);

        String Title = driver.findElement(By.tagName("h1")).getText();

        String expectedValue = "Selenium Practice Lab";
        if (Title.equals("Selenium Practice Lab")) {
            Assert.assertTrue(true);
        }

        Assert.assertEquals(Title, expectedValue);



    }
}

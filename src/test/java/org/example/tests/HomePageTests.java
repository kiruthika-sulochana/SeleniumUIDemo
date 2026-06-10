package org.example.tests;

import org.example.base.BaseTest;
import org.example.constants.HomePageData;
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

        Assert.assertEquals(titleText, HomePageData.EXPECTED_TITLE);



    }
}

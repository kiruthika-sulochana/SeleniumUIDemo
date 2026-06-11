package org.example.tests;

import org.example.base.BasePage;
import org.example.base.BaseTest;
import org.example.constants.HomePageData;
import org.example.listeners.TestListeners;
import org.example.pages.LocatorsPage;
import org.example.utils.DriverFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListeners.class)
public class LocatorsPageTests extends BaseTest {

    LocatorsPage locators=new LocatorsPage(driver);


    @Test(groups = {"smoke"})
    public void verifyLevel() throws InterruptedException {
        Assert.assertTrue(BasePage.isElementDisplayed(locators.getLevel1()));

        Assert.assertTrue(BasePage.isElementDisplayed(locators.getUserNameField()));

        locators.sendDataValues(locators.getUserNameField(),HomePageData.USERNAME);

        locators.sendDataValues(locators.getEmailField(),HomePageData.EMAIL);

        Assert.assertEquals(
                BasePage.getInputValue(locators.getUserNameField()),
                HomePageData.USERNAME
        );

        Assert.assertEquals(
                BasePage.getInputValue(locators.getEmailField()),
                HomePageData.EMAIL
        );

    }
}

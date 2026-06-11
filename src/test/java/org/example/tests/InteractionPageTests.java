package org.example.tests;

import org.example.base.BasePage;
import org.example.base.BaseTest;
import org.example.constants.HomePageData;
import org.example.listeners.TestListeners;
import org.example.pages.InteractionPage;
import org.example.utils.DriverFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javax.validation.constraints.AssertTrue;

@Listeners(TestListeners .class)
public class InteractionPageTests extends BaseTest {

    InteractionPage interactionPage = new InteractionPage(driver);

    @Test(groups={"smoke"})
    public void verifyFormRegistration() throws InterruptedException {

        Assert.assertTrue(BasePage.isElementDisplayed(interactionPage.getFirstName()));
        BasePage.sendDataValues(interactionPage.getFirstName(),HomePageData.FIRSTNAME);
        Assert.assertEquals(BasePage.getInputValue(interactionPage.getFirstName()),HomePageData.FIRSTNAME);

        Assert.assertTrue(BasePage.isElementDisplayed(interactionPage.getLastName()));
        BasePage.sendDataValues(interactionPage.getLastName(),HomePageData.LASTNAME);
        Assert.assertEquals(BasePage.getInputValue(interactionPage.getLastName()),HomePageData.LASTNAME);

        Assert.assertTrue(BasePage.isElementDisplayed(interactionPage.getPassword()));
        BasePage.sendDataValues(interactionPage.getPassword(),HomePageData.PASSWORD);
        Assert.assertEquals(BasePage.getInputValue(interactionPage.getPassword()),HomePageData.PASSWORD);

        Assert.assertTrue(BasePage.isElementDisplayed(interactionPage.getEmail()));
        BasePage.sendDataValues(interactionPage.getEmail(),HomePageData.EMAIL);
        Assert.assertEquals(BasePage.getInputValue(interactionPage.getEmail()),HomePageData.EMAIL);


    }

    @Test(groups = {"smoke"})
    public void verifyPasswordInputAndMasking() {

        BasePage.sendDataValues(interactionPage.getPassword(), HomePageData.PASSWORD);

        String value = DriverFactory.getDriver()
                .findElement(interactionPage.getPassword())
                .getAttribute("value");

        Assert.assertEquals(value, HomePageData.PASSWORD, "Password not entered correctly");

        String type = DriverFactory.getDriver()
                .findElement(interactionPage.getPassword())
                .getAttribute("type");

        Assert.assertEquals(type, "password", "Password field is not masked");

    }

}

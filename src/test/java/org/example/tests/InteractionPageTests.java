package org.example.tests;

import org.example.base.BasePage;
import org.example.base.BaseTest;
import org.example.listeners.TestListeners;
import org.example.pages.InteractionPage;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javax.validation.constraints.AssertTrue;

@Listeners(TestListeners .class)
public class InteractionPageTests extends BaseTest {

    InteractionPage interactionPage = new InteractionPage(driver);

    @Test(groups={"smoke"})
    public void verifyFormRegistration()
    {
        Assert.assertTrue(BasePage.isElementDisplayed(interactionPage.getFirstName()));
        Assert.assertTrue(BasePage.isElementDisplayed(interactionPage.getLastName()));
        Assert.assertTrue(BasePage.isElementDisplayed(interactionPage.getPassword()));
        Assert.assertTrue(BasePage.isElementDisplayed(interactionPage.getEmail()));


    }

}

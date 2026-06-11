package org.example.tests;

import org.example.base.BasePage;
import org.example.base.BaseTest;
import org.example.constants.HomePageData;
import org.example.listeners.TestListeners;
import org.example.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListeners.class, com.epam.reportportal.testng.ReportPortalTestNGListener.class})
public class HomePageTests extends BaseTest {

    private HomePage homePage;

    @BeforeMethod(alwaysRun = true, dependsOnMethods = "SetUp")
    public void initPages() {
        homePage = new HomePage(driver);
    }

    @Test(groups = {"smoke"})
    public void verifyTitle()
    {
        Assert.assertTrue(BasePage.isElementDisplayed(homePage.getTitle()), "Title is Displayed");
        Assert.assertEquals(homePage.getTitleText(), HomePageData.EXPECTED_TITLE);
    }

    @Test(groups = {"smoke"})
    public void verifyHomeTabList()
    {
        String list = BasePage.getElementsText(homePage.getHomeTabUrlLink());

        Assert.assertNotNull(list.contains(BasePage.getElementText(homePage.getLocatorTab())));
        Assert.assertNotNull(list.contains(BasePage.getElementsText(homePage.getFormsTab())));
        Assert.assertNotNull(list.contains(BasePage.getElementsText(homePage.getInteractionsTab())));
        Assert.assertNotNull(list.contains(BasePage.getElementsText(homePage.getWaitsTab())));
        Assert.assertNotNull(list.contains(BasePage.getElementsText(homePage.getTablesTab())));
        Assert.assertNotNull(list.contains(BasePage.getElementsText(homePage.getWindowsTab())));
        Assert.assertNotNull(list.contains(BasePage.getElementsText(homePage.getAlertsTab())));
        Assert.assertNotNull(list.contains(BasePage.getElementsText(homePage.getFramesTab())));
        Assert.assertNotNull(list.contains(BasePage.getElementsText(homePage.getAdvancedTab())));
        Assert.assertNotNull(list.contains(BasePage.getElementsText(homePage.getSeniorTab())));
    }
}

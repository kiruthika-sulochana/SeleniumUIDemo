package org.example.pages;

import junit.framework.AssertionFailedError;
import org.example.base.BasePage;
import org.example.base.BaseTest;
import org.example.utils.DriverFactory;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private By title = By.tagName("h1");
    private By homeTabUrlLink = By.xpath("//div[@class='badge-row']/following::nav");
    private By locatorTab = By.xpath("//a[contains(text(),'Locators')]");
    private By formsTab = By.xpath("//a[contains(text(),'Forms')]");
    private By interactionsTab = By.xpath("//a[contains(text(),'Interactions')]");
    private By waitsTab = By.xpath("//a[contains(text(),'Waits')]");
    private By tablesTab = By.xpath("//a[contains(text(),'Tables')]");
    private By windowsTab = By.xpath("//a[contains(text(),'Windows')]");
    private By alertsTab = By.xpath("//a[contains(text(),'JS Alerts')]");
    private By framesTab = By.xpath("//a[contains(text(),'Frames')]");
    private By advancedTab = By.xpath("//a[contains(text(),'Advanced')]");
    private By seniorTab = By.xpath("//a[contains(text(),'Senior')]");

    public By getTitle() {
        return title;
    }

    public By getHomeTabUrlLink() {
        return homeTabUrlLink;
    }

    public By getLocatorTab() {
        return locatorTab;
    }

    public By getFormsTab() {
        return formsTab;
    }

    public By getInteractionsTab() {
        return interactionsTab;
    }

    public By getWaitsTab() {
        return waitsTab;
    }

    public By getTablesTab() {
        return tablesTab;
    }

    public By getWindowsTab() {
        return windowsTab;
    }

    public By getAlertsTab() {
        return alertsTab;
    }

    public By getFramesTab() {
        return framesTab;
    }

    public By getAdvancedTab() {
        return advancedTab;
    }

    public By getSeniorTab() {
        return seniorTab;
    }

    public String getTitleText() {
        return DriverFactory.getDriver().findElement(title).getText();
    }


    public List<WebElement> getUrlLinkList()
    {
        List<WebElement> list= DriverFactory.getDriver().findElements(homeTabUrlLink);

        return list;
    }


}

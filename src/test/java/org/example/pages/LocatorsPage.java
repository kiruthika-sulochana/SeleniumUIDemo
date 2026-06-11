package org.example.pages;

import org.example.base.BasePage;
import org.example.utils.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsPage extends BasePage {

    public LocatorsPage(WebDriver driver) {
        super(driver);
    }

    private By level1 = By.xpath("//span[text()='Level 1']");
    private By userNameField = By.id("username-field");
    private By emailField = By.id("email-field");

    public By getLevel1() {
        return level1;
    }

    public By getUserNameField() {
        return userNameField;
    }

    public void setUserNameField(By userNameField) {
        this.userNameField = userNameField;
    }

    public By getEmailField() {
        return emailField;
    }

    public void setEmailField(By emailField) {
        this.emailField = emailField;
    }

}

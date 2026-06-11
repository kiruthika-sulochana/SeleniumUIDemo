package org.example.pages;

import org.example.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InteractionPage extends BasePage
{
    public InteractionPage(WebDriver driver) {
        super(driver);
    }

    private By firstName = By.id("reg-first");
    private By lastName = By.id("reg-last");
    private By email = By.id("reg-email");
    private By password = By.id("reg-password");
    private By phone = By.id("reg-phone");
    private By dob = By.id("reg-dob");
    private By country = By.id("reg-country");
    private By city = By.id("reg-city");
    private By role = By.id("reg-role");
    private By gender = By.xpath("//label[text()='Gender']");
    private By skills = By.xpath("//label[text()='Skills']");
    private By seleniumSkill = By.id("skill-selenium");
    private By pythonSkill = By.id("skill-python");
    private By javaSkill = By.id("skill-java");
    private By javascriptSkill = By.id("skill-js");
    private By apiTestingSkill = By.id("skill-api");
    private By experience = By.xpath("//label[text()='Experience Level: ']");
    private By experienceValue = By.id("exp-value");
    private By experienceSlider = By.id("exp-slider");
    private By bioTextBox = By.id("reg-bio");
    private By uploadFile = By.id("reg-file");
    private By portfoliaUrlBox = By.id("reg-url");
    private By agreeCheckBox = By.id("terms-check");
    private By subscriberCheckBox = By.id("newsletter-check");
    private By registerButton = By.id("reg-submit");
    private By resetButton = By.id("reg-reset");


    public By getLastName() {
        return lastName;
    }

    public By getEmail() {
        return email;
    }

    public By getPassword() {
        return password;
    }

    public By getPhone() {
        return phone;
    }

    public By getDob() {
        return dob;
    }

    public By getCountry() {
        return country;
    }

    public By getCity() {
        return city;
    }

    public By getRole() {
        return role;
    }

    public By getGender() {
        return gender;
    }

    public By getSkills() {
        return skills;
    }

    public By getSeleniumSkill() {
        return seleniumSkill;
    }

    public By getPythonSkill() {
        return pythonSkill;
    }

    public By getJavaSkill() {
        return javaSkill;
    }

    public By getJavascriptSkill() {
        return javascriptSkill;
    }

    public By getApiTestingSkill() {
        return apiTestingSkill;
    }

    public By getExperience() {
        return experience;
    }

    public By getExperienceValue() {
        return experienceValue;
    }

    public By getExperienceSlider() {
        return experienceSlider;
    }

    public By getBioTextBox() {
        return bioTextBox;
    }

    public By getUploadFile() {
        return uploadFile;
    }

    public By getPortfoliaUrlBox() {
        return portfoliaUrlBox;
    }

    public By getAgreeCheckBox() {
        return agreeCheckBox;
    }

    public By getSubscriberCheckBox() {
        return subscriberCheckBox;
    }

    public By getRegisterButton() {
        return registerButton;
    }

    public By getResetButton() {
        return resetButton;
    }

    public By getFirstName() {
        return firstName;
    }

    public void setFirstName(By firstName) {
        this.firstName = firstName;
    }

    public void setLastName(By lastName) {
        this.lastName = lastName;
    }

    public void setEmail(By email) {
        this.email = email;
    }

    public void setPassword(By password) {
        this.password = password;
    }

    public void setPhone(By phone) {
        this.phone = phone;
    }

    public void setDob(By dob) {
        this.dob = dob;
    }

    public void setCountry(By country) {
        this.country = country;
    }

    public void setCity(By city) {
        this.city = city;
    }

    public void setRole(By role) {
        this.role = role;
    }

    public void setGender(By gender) {
        this.gender = gender;
    }

    public void setSkills(By skills) {
        this.skills = skills;
    }

    public void setSeleniumSkill(By seleniumSkill) {
        this.seleniumSkill = seleniumSkill;
    }

    public void setPythonSkill(By pythonSkill) {
        this.pythonSkill = pythonSkill;
    }

    public void setJavaSkill(By javaSkill) {
        this.javaSkill = javaSkill;
    }

    public void setJavascriptSkill(By javascriptSkill) {
        this.javascriptSkill = javascriptSkill;
    }

    public void setApiTestingSkill(By apiTestingSkill) {
        this.apiTestingSkill = apiTestingSkill;
    }

    public void setExperience(By experience) {
        this.experience = experience;
    }

    public void setExperienceValue(By experienceValue) {
        this.experienceValue = experienceValue;
    }

    public void setExperienceSlider(By experienceSlider) {
        this.experienceSlider = experienceSlider;
    }

    public void setBioTextBox(By bioTextBox) {
        this.bioTextBox = bioTextBox;
    }

    public void setUploadFile(By uploadFile) {
        this.uploadFile = uploadFile;
    }

    public void setPortfoliaUrlBox(By portfoliaUrlBox) {
        this.portfoliaUrlBox = portfoliaUrlBox;
    }

    public void setAgreeCheckBox(By agreeCheckBox) {
        this.agreeCheckBox = agreeCheckBox;
    }

    public void setSubscriberCheckBox(By subscriberCheckBox) {
        this.subscriberCheckBox = subscriberCheckBox;
    }

    public void setRegisterButton(By registerButton) {
        this.registerButton = registerButton;
    }

    public void setResetButton(By resetButton) {
        this.resetButton = resetButton;
    }




}

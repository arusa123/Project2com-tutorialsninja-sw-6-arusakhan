package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement registerAccountText;

    @CacheLookup
    @FindBy(name = "firstname")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement email;

    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement telephoneNo;
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement password;
    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/form/fieldset[3]/div/div//label")
    WebElement subscribeButton;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/form/fieldset[3]/div/div//label[1]/input")
    WebElement subscribeButtonYes;
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/form/fieldset[3]/div/div//label[2]/input")
    WebElement subscribeButtonNo;
    @CacheLookup
    @FindBy(name = "agree")
    WebElement privacyButton;
    @CacheLookup
    @FindBy(xpath = "//input[@class='btn btn-primary']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Your Account Has Been Created!')]")
    WebElement accountCreatedMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButtonAfterAccountCreation;


    public String getRegisterAccountText() {
        log.info("The Register Account Text is " + registerAccountText.toString());
        return registerAccountText.getText();
    }

    public void sendTextFirstNameField(String fName) {
        log.info("Enter user first name " + fName + " to First Name field " + firstName.toString());
        sendTextToElement(firstName, fName);
    }

    public void sendTextLastNameField(String lName) {
        log.info("Enter user last name " + lName + " to Last Name field " + lastName.toString());
        sendTextToElement(lastName, lName);

    }

    public void sendTextEmailField(String rEmail) {
        log.info("Enter user email " + rEmail + " to Email field " + email.toString());
        sendTextToElement(email, rEmail + getAlphaNumericString(2) + "@gmail.com");
    }

    public void sendTexTelephoneField(String telep) {
        log.info("Enter telephone number " + telep + " to Telephone Number field " + telephoneNo.toString());
        sendTextToElement(telephoneNo, telep);

    }

    public void sendTextPasswordField(String pass) {
        log.info("Enter password " + pass + " to Password field " + password.toString());
        sendTextToElement(password, pass);
    }

    public void sendTextConfirmPasswordField(String cirPass) {
        log.info("Enter password again " + cirPass + " to Confirm Password field " + confirmPassword.toString());
        sendTextToElement(confirmPassword, cirPass);
    }

    public void selectSubscribeButtons(String op) {
        log.info("Select Subscribe Option" + password.toString());
        if (op.equalsIgnoreCase("Yes")) {
            clickOnElement(subscribeButtonYes);
        } else if (op.equalsIgnoreCase("No")) {
            clickOnElement(subscribeButtonNo);
        }
    }

    public void clickOnPrivacyButton() {
        log.info("Clicking on continue Button in guest section " + privacyButton.toString());
        clickOnElement(privacyButton);
    }

    public void clickOnContinueButton() {
        log.info("Clicking on continue Button in guest section " + continueButton.toString());
        clickOnElement(continueButton);
    }

    public String getAccountCreatedMessage() {
        log.info("The Account Created Text is " + accountCreatedMessage.toString());
        return accountCreatedMessage.getText();
    }

    public void clickOnContinueButtonAfterAccountCreation() {
        log.info("Clicking on continue Button in guest section " + continueButtonAfterAccountCreation);
        clickOnElement(continueButtonAfterAccountCreation);
    }


}

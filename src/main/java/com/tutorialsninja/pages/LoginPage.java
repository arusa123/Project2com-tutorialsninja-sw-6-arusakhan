package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Returning Customer')]")
    WebElement returningCustomerText;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement accountLogoutText;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButtonLogout;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailAddress;

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//input[@class='btn btn-primary']")
    WebElement loginButton;

    public String getReturningCustomerText() {
        log.info("Returning customer text" + returningCustomerText.toString());
        return returningCustomerText.getText();
    }

    public String getAccountLogoutText() {
        log.info("Account log out text" + accountLogoutText.toString());

        return accountLogoutText.getText();
    }

    public void clickOnContinueButtonLogout() {
        log.info("continue button for logout" + continueButtonLogout.toString());
        clickOnElement(continueButtonLogout);

    }

    public void sendTextToEmailAddressField(String emailId) {
        log.info("send text to email field" + continueButtonLogout.toString());
        sendTextToElement(emailAddress, emailId);
    }

    public void sendTextToPasswordField(String lPassword) {
        log.info("continue button for logout" + continueButtonLogout.toString());
        sendTextToElement(password, lPassword);
    }

    public void clickOnLoginButton() {
        log.info("Click on Login Button " + loginButton.toString());
        clickOnElement(loginButton);

    }
}

package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class MyAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());
    //Declaring WebElement type variables
    @CacheLookup
    @FindBy(xpath = "(//span[@class='hidden-xs hidden-sm hidden-md'])[3]")
    WebElement myAccountLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;
    @CacheLookup
    @FindBy(xpath = "/li[@class='dropdown open']/ul/li[2]")
    WebElement loginLink;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccountText;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement logoutText;
    @CacheLookup
    @FindBy(xpath = "//li[@class='dropdown open']/ul/li[5]")
    WebElement continueButtonLogout;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//li")
    List<WebElement> listOfMyAccountOptions;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement registerLinkText;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Returning Customer']")
    WebElement loginText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='pull-right']/a")
    WebElement accountLogoutContinueButton;

    public void clickOnLogOutButtonAfterAccountCreated() {
        accountLogoutContinueButton.click();
    }

    //Method to click on My Account
    public void clickOnMyAccountLink() {
        log.info("Click on My Account Link " + myAccountLink.toString());
        clickOnElement(myAccountLink);
    }

    //Method to click on Register link
    public void clickOnRegisterLink() {
        log.info("Click on Register Link " + registerLink.toString());
        clickOnElement(registerLink);

    }

    //Method to click on Login link
    public void clickOnLoginLink() {
        log.info("Click on Login Link " + loginLink.toString());
        clickOnElement(loginLink);

    }

    //this method will select option from My account aoptions
    public void selectMyAccountOptions(String options) {
        log.info("Select My Account Options " + listOfMyAccountOptions.toString());

        List<WebElement> accountOptionList = listOfMyAccountOptions;
        for (WebElement accountOptions : accountOptionList) {
            if (accountOptions.getText().equalsIgnoreCase(options)) {
                accountOptions.click();
                break;
            }
        }

    }

    //this method will get text
    public String getMyAccountText() {
        log.info("My Account Text " + myAccountText.toString());
        return myAccountText.getText();
    }

    //this method will get text
    public String getLogoutText() {
        Reporter.log("Logout Text " + logoutText.toString());
        return logoutText.getText();
    }

    //this method will click on continue button
    public void clickContinueButtonLogout() {
        log.info("Click on Logout Link " + continueButtonLogout.toString());
        clickOnElement(continueButtonLogout);


    }

    public String getTextForRegister() {
        log.info("Login text " + registerLinkText.toString());
        return registerLinkText.getText();
    }

    public String getLoginText() {
        log.info("Login text " + loginText.toString());
        return loginText.getText();
    }
}
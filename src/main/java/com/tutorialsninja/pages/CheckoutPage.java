package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckoutPage.class.getName());

    @CacheLookup
    @FindBy(linkText = "Checkout")
    WebElement checkoutText;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'New Customer')]")
    WebElement newCustomerText;

    @CacheLookup
    @FindBy(xpath = "//input[@value='guest']")
    WebElement guestCheckout;

    @CacheLookup
    @FindBy(id = "button-account")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-firstname']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-lastname']")
    WebElement lastName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-email']")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-telephone']")
    WebElement telephone;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-address-1']")
    WebElement address;


    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-city']")
    WebElement city;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-postcode']")
    WebElement postcode;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-country']")
    WebElement country;
    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-zone']")
    WebElement region;
    @CacheLookup
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement contiuneCheckout;
    @CacheLookup
    @FindBy(xpath = "//div[@class='panel-group']/div[3]/div[2]/div[1]/p[2]/textarea[1]")
    WebElement commentField;
    @CacheLookup
    @FindBy(name = "agree")
    WebElement termAndConditionsCheckBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-payment-method']")
    WebElement continueButtonInCommentSection;
    @CacheLookup
    @FindBy(xpath = "//div[@class='panel-group']/div[3]/div[2]/div/div[1]")
    WebElement paymentErrorMessage;


    public void sendTextToAddCommentBox(String comment) {
        log.info("Comment field " + commentField.toString());
        sendTextToElement(commentField, comment);
    }

    public void clickOnTermAndConditionsCheckBox() {
        log.info("Terms and condition " + termAndConditionsCheckBox.toString());
        clickOnElement(termAndConditionsCheckBox);
    }

    public void clickOnContinueButtonInCommentSection() {
        log.info("continue " + continueButtonInCommentSection.toString());
        clickOnElement(continueButtonInCommentSection);
    }

    public String getPaymentErrorMessage() {
        log.info("payment message " + paymentErrorMessage.toString());
        return paymentErrorMessage.getText();
    }


    //this method will click on continue
    public void contiuneToCheckout() {
        log.info("contiune checkout " + contiuneCheckout.toString());
        clickOnElement(contiuneCheckout);
    }

    public void sendTextToFirstNameField(String fName) {
        log.info("first name " + firstName.toString());
        sendTextToElement(firstName, fName + getAlphaNumericString(2));

    }

    public void sendTextToLastNameField(String lname) {
        log.info("Last name " + lastName.toString());
        sendTextToElement(lastName, lname + getAlphaNumericString(2));
    }

    public void sendTextToEmailField(String uEmail) {
        log.info("Email " + email.toString());
        sendTextToElement(email, uEmail + getAlphaNumericString(2) + "@gmail.com");
    }

    public void sendTextToTelephoneField(String tele) {
        log.info("Telephone " + telephone.toString());
        sendTextToElement(telephone, tele);
    }

    public void sendTextToAddressField(String add) {
        log.info("Address " + address.toString());
        sendTextToElement(address, add);
    }

    public void sendTextToCityField(String uCty) {
        log.info("City " + city.toString());
        sendTextToElement(city, uCty);

    }

    public void sendTextToPostCOdeField(String pCode) {
        log.info("post code " + postcode.toString());
        sendTextToElement(postcode, pCode + getAlphaNumericString(1));
    }

    //this method will send country name
    public void selectCountry(String uCountry) {
        log.info("Country " + country.toString());
        selectByVisibleTextFromDropDown(country, uCountry);

    }

    //this method will send region
    public void selectRegion(String uRegion) {
        log.info("region " + region.toString());
        selectByVisibleTextFromDropDown(region, uRegion);

    }

    //this method will get the checkout text
    public String getCheckoutText() {
        log.info("checkout text " + checkoutText.toString());

        return checkoutText.getText();
    }

    //this method will get new customer text
    public String getNewCustomerText() {
        log.info("new customer text " + newCustomerText.toString());

        return newCustomerText.getText();
    }

    //this method will click on guestCheckout
    public void clickOnGuestCheckout() {
        log.info("guest checkout  " + guestCheckout.toString());
        clickOnElement(guestCheckout);

    }


    //this method will click on the contiune button
    public void clickOnContinueButton() {
        log.info("click on continue  " + continueButton.toString());
        clickOnElement(continueButton);
    }


}

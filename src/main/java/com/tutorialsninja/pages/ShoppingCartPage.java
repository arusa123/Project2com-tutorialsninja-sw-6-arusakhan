package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());
    @CacheLookup
    @FindBy(linkText = "HP LP3065")
    WebElement productNameText;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]")
    WebElement shoppingText;
    @CacheLookup
    @FindBy(xpath = "//td[normalize-space()='Product 21']")
    WebElement productModelText;
    @CacheLookup
    @FindBy(xpath = "//tbody//tr//td[6]")
    WebElement productPrice;
    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement macBookTextinCart;

    @CacheLookup
    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[4]/div/input")
    WebElement changeQuantity;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement updateCart;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement cartUpdatedSucessfullyText;
    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement checkoutButton;

    public void clickOnCheckoutButton() {
        log.info("Click on guest checkout  Button " + checkoutButton.toString());
        clickOnElement(checkoutButton);
    }

    public String getShoppingCartUpdatedSuccesfully() {
        log.info("The Shopping Cart Updated Text is " + cartUpdatedSucessfullyText.toString());
        return getTextFromElement(cartUpdatedSucessfullyText);
    }

    public void clickOnTheUpdateCartButton() {
        log.info("Update cart " + updateCart.toString());
        clickOnElement(updateCart);
    }

    public void updateQuantity(String qty) {
        clearTextFromField(changeQuantity);
        sendTextToElement(changeQuantity, qty);
    }


    public String getShoppingCartText() {
        log.info("Shopping cart text " + shoppingText.toString());
        return shoppingText.getText();
    }

    public String getProductNameText() {
        log.info("The product Name is " + productNameText.toString());
        return productNameText.getText();
    }

    public String getTextOfProductModel() {
        log.info("The Model Name is " + productModelText.toString());
        return productModelText.getText();
    }

    public String getPriceText(String price) {
        log.info("The price is " + productPrice.toString());
        return productPrice.getText();
    }

    //this method will verify the macbook laptop text
    public String macBookLaptopText() {
        log.info("Macbook text " + macBookTextinCart.toString());
        return macBookTextinCart.getText();
    }

}

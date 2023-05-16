package com.tutorialsninja.steps;

import com.tutorialsninja.pages.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LaptopAndNotbookSteps {
    @When("^Mouse hover on Laptops & Notebooks Tab\\.and click$")
    public void mouseHoverOnLaptopsNotebooksTabAndClick() {
    }

    @And("^I Click on “Show All Laptops & Notebooks”$")
    public void iClickOnShowAllLaptopsNotebooks() {
        new HomePage().clickOnShowALLLaptopAndNotebook();
    }

    @Then("^I Select Sort By \"([^\"]*)\"$")
    public void iSelectSortBy(String High) {
        new LaptopAndNotebookPage().sortByPriceHighToLow();

    }

    @When("^I select the currency to pounds for laptop page$")
    public void iSelectTheCurrencyToPoundsForLaptopPage() {
        new HomePage().selectRequiredCurrency();
    }

    @And("^I Mouse hover on Laptops & Notebooks Tab and click$")
    public void iMouseHoverOnLaptopsNotebooksTabAndClick() {
        new HomePage().hoverOnLaptopsandNotebooks();
    }


    @And("^Click on “Show All Laptops & Notebooks”$")
    public void clickOnShowAllLaptopsNotebooks() {
        new HomePage().clickOnShowALLLaptopAndNotebook();
    }

    @And("^I select Sort By \"([^\"]*)\" on laptop and notebook page$")
    public void iSelectSortByOnLaptopAndNotebookPage(String arg0) {
        new LaptopAndNotebookPage().sortByPriceHighToLow();

    }

    @And("^I Select Product “MacBook”$")
    public void iSelectProductMacBook() {
        new LaptopAndNotebookPage().clickOnMacBookLaptop();
    }

    @And("^I Verify the text “MacBook”$")
    public void iVerifyTheTextMacBook() {
        Assert.assertEquals("wrong text", "MacBook", new ProductPage().getMacBookLaptopText());
    }

    @And("^I click on ‘Add To Cart’ button$")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickAddToCart();
    }

    @And("^I verify the message “Success: You have added MacBook to your shopping cart!”$")
    public void iVerifyTheMessageSuccessYouHaveAddedMacBookToYourShoppingCart() {
        String laptopText = "Success: You have added MacBook to your shopping cart!\n" + "×";
        Assert.assertEquals("incorrect name", laptopText, new ProductPage().getMacBookAddedSuccessfullyText());
    }

    @And("^I click on link “shopping cart” display into success message$")
    public void iClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new ProductPage().clickOnShoppingCartLink();
    }

    @And("^I verify the text \"([^\"]*)\"$")
    public void iVerifyTheText(String arg0) {
        Assert.assertEquals("error", "Shopping Cart  (0.00kg)", new ShoppingCartPage().getShoppingCartText());

    }

    @And("^I verify the Product name \"([^\"]*)\"$")
    public void iVerifyTheProductName(String arg0) {
        Assert.assertEquals("wrong name", "MacBook", new ShoppingCartPage().macBookLaptopText());

    }

    @And("^I change Quantity \"([^\"]*)\"$")
    public void iChangeQuantity(String arg0) {
        new ShoppingCartPage().updateQuantity("2");

    }

    @And("^I click on “Update” Tab$")
    public void iClickOnUpdateTab() {
        new ShoppingCartPage().clickOnTheUpdateCartButton();
    }

    @And("^I verify the message “Success: You have modified your shopping cart!”$")
    public void iVerifyTheMessageSuccessYouHaveModifiedYourShoppingCart() {
        String laptopText = "Success: You have modified your shopping cart!\n" + "×";
        Assert.assertEquals("error", laptopText, new ShoppingCartPage().getShoppingCartUpdatedSuccesfully());
    }

    @And("^I verify the Total £(\\d+)\\.(\\d+)$")
    public void iVerifyTheTotal£(int arg0, int arg1) {
        Assert.assertEquals("Incorrect price", "£737.45", new ShoppingCartPage().getPriceText("737.45"));
    }

    @And("^I Click on “Checkout” button$")
    public void iClickOnCheckoutButton() {
        new ShoppingCartPage().clickOnCheckoutButton();
    }

    @And("^I Verify the text “Checkout”$")
    public void iVerifyTheTextCheckout() {
        Assert.assertEquals("error", "Checkout", new CheckoutPage().getCheckoutText());
    }

    @And("^I Verify the Text “New Customer”$")
    public void iVerifyTheTextNewCustomer() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals("error", "New Customer", new CheckoutPage().getNewCustomerText());

    }

    @And("^I Click on “Guest Checkout” radio button$")
    public void iClickOnGuestCheckoutRadioButton() {
        new CheckoutPage().clickOnGuestCheckout();
    }

    @And("^I Click on “Continue” tab$")
    public void iClickOnContinueTab() {
        new CheckoutPage().clickOnContinueButton();
    }

    @And("^I Fill the mandatory fields$")
    public void iFillTheMandatoryFields() {
        new CheckoutPage().sendTextToFirstNameField("prime");
        new CheckoutPage().sendTextToLastNameField("Testing");
        new CheckoutPage().sendTextToEmailField("prime");
        new CheckoutPage().sendTextToTelephoneField("02089764367");
        new CheckoutPage().sendTextToAddressField("1 London road");
        new CheckoutPage().sendTextToCityField("London");
        new CheckoutPage().sendTextToPostCOdeField("Ub8 8TG");
        new CheckoutPage().selectCountry("United Kingdom");
        new CheckoutPage().selectRegion("Greater London");
    }

    @And("^I Click on “Continue” Button$")
    public void iClickOnContinueButton() {
        new CheckoutPage().contiuneToCheckout();
    }

    @And("^I Add Comments About your order into text area$")
    public void iAddCommentsAboutYourOrderIntoTextArea() {
        new CheckoutPage().sendTextToAddCommentBox("please delivery on time");
    }

    @And("^I Check the Terms & Conditions check box$")
    public void iCheckTheTermsConditionsCheckBox() {
        new CheckoutPage().clickOnTermAndConditionsCheckBox();
    }

    @And("^I Click on “Continue” button on payment page$")
    public void iClickOnContinueButtonOnPaymentPage() {
        new CheckoutPage().clickOnContinueButtonInCommentSection();
    }

    @And("^I Verify the message “Warning: Payment method required!”$")
    public void iVerifyTheMessageWarningPaymentMethodRequired() {
        String payment = "Warning: No Payment options are available. Please contact us for assistance!";
        Assert.assertEquals("payment needed", payment, new CheckoutPage().getPaymentErrorMessage());
    }


}

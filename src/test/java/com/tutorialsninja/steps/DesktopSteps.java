package com.tutorialsninja.steps;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class DesktopSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I hover over desktop$")
    public void iHoverOverDesktop() {
        new HomePage().hoverOnDesktop();
    }

    @And("^I click on dekstop link$")
    public void iClickOnDekstopLink() {
        new HomePage().clickOnDesktoplink();
    }

    @And("^I sorty thr list by Z to A$")
    public void iSortyThrListByZToA() {
        new DesktopPage().sortListByZtoA();
    }

    @Then("^I verify thr sorted list$")
    public void iVerifyThrSortedList() {
        Assert.assertEquals("error", new DesktopPage().beforeSortTheProducts(), new DesktopPage().afterSortingTheProducts());

    }

    @When("^I select the currency to pounds$")
    public void iSelectTheCurrencyToPounds() {
        new HomePage().selectRequiredCurrency();
    }

    @And("^I hover mouse on desktop$")
    public void iHoverMouseOnDesktop() {
        new HomePage().hoverOnDesktop();

    }

    @And("^I click on Desktop link$")
    public void iClickOnDesktopLink() throws InterruptedException {
        Thread.sleep(1000);
        new HomePage().clickOnDesktoplink();
    }

    @And("^I Change the the sort by position Z to A$")
    public void iChangeTheTheSortByPositionAToZ() {
        new DesktopPage().sortListByZtoA();
    }

    @And("^I select the laptop HP LP(\\d+)$")
    public void iSelectTheLaptopHPLP(int arg0) {
        new DesktopPage().clickOnHPLP3065();
    }

    @And("^I verify the laptop text$")
    public void iVerifyTheLaptopText() {
        Assert.assertEquals("error", "HP LP3065", new DesktopPage().getTextOfTheLaptop());
    }

    @And("^I select delivery date from calendar$")
    public void iSelectDeliveryDateFromCalendar() {
        new DesktopPage().selectDateAndYearOnCalendar("November", "2022");
        new DesktopPage().selectDateOnCalendar("30");
    }

    @And("^I change the quantity to (\\d+)$")
    public void iChangeTheQuantityTo(String qty) {
        new DesktopPage().enterQuantityRequired("1");

    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new DesktopPage().clickAddToCart();
    }

    @And("^I verify the laptop have been added to the cart$")
    public void iVerifyTheLaptopHaveBeenAddedToTheCart() throws InterruptedException {
        Thread.sleep(2000);
        String text = "Success: You have added HP LP3065 to your shopping cart!\n" + "×";
        Assert.assertEquals("wrong text", text, new DesktopPage().getAddToCartText());
    }

    @And("^I click on shopping cart link$")
    public void iClickOnShoppingCartLink() throws InterruptedException {
        Thread.sleep(1000);
        new DesktopPage().clickOnShoppingCartLink();
    }

    @And("^I verify the shopping cart text$")
    public void iVerifyTheShoppingCartText() {
        Assert.assertEquals("error", "Shopping Cart  (1.00kg)", new ShoppingCartPage().getShoppingCartText());
    }

    @And("^I verify the product name$")
    public void iVerifyTheProductName() {
        Assert.assertEquals("wrong name", "HP LP3065", new ShoppingCartPage().getProductNameText());

    }

    @And("^I Verify the product model$")
    public void iVerifyTheProductModel() {
        Assert.assertEquals("wrong model", "Product 21", new ShoppingCartPage().getTextOfProductModel());

    }

    @Then("^I verify the total price$")
    public void iVerifyTheTotalPrice() {
        Assert.assertEquals("wrong price", "£74.73", new ShoppingCartPage().getPriceText("£74.73"));

    }

}

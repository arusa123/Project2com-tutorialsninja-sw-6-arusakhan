package com.tutorialsninja.steps;

import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.LaptopAndNotebookPage;
import com.tutorialsninja.pages.TopMenuPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TopmenuSteps {
    @When("^I hover over main menu bar$")
    public void iHoverOverMainMenuBar() {
        new TopMenuPage().hoverOverMainMenuBar("Laptops & Notebooks");
    }

    @And("^I click on laptops and Notebooks tab$")
    public void iClickOnLaptopsAndNotebooksTab() {
        new TopMenuPage().selectMenu("Show AllLaptops & Notebooks");
    }

    @Then("^I verify the laptop and notebook text$")
    public void iVerifyTheLaptopAndNotebookText() {
        Assert.assertEquals("inncorrect text", "Laptops & Notebooks", new LaptopAndNotebookPage().getPageTitleText());
    }

    @When("^I hover over desktops from main menu$")
    public void iHoverOverDesktopsFromMainMenu() {
        new TopMenuPage().hoverOverMainMenuBar("Desktops");
    }

    @And("^I select show all desktops$")
    public void iSelectShowAllDesktops() {
        new TopMenuPage().selectMenu("Show AllDesktops");
    }

    @Then("^I verify the desktop text$")
    public void iVerifyTheDesktopText() {
        Assert.assertEquals("incorrect menu", "Desktops", new DesktopPage().getDesktopText());
    }
}

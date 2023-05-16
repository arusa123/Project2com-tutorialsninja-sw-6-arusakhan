package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LaptopAndNotebookPage extends Utility {
    private static final Logger log = LogManager.getLogger(LaptopAndNotebookPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement sortBy;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='MacBook']")
    WebElement macBook;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement pageTitle;

    public void sortByPriceHighToLow() {
        log.info("Price (High > Low) " + sortBy.toString());
        selectByVisibleTextFromDropDown(sortBy, "Price (High > Low)");

    }

    public void clickOnMacBookLaptop() {
        log.info("macbook " + macBook.toString());
        clickOnElement(macBook);

    }

    //this method will get the text of the page title
    public String getPageTitleText() {
        log.info("Page title " + macBook.toString());
        return pageTitle.getText();
    }

}

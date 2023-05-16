package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Currency']")
    WebElement currencyLink;
    @CacheLookup
    @FindBy(xpath = "//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[1]")
    WebElement desktopLink;
    @CacheLookup
    @FindBy(linkText = "Show AllDesktops")
    WebElement showAllDesktopLink;
    @CacheLookup
    @FindBy(xpath = "//div[@class='collapse navbar-collapse navbar-ex1-collapse']/ul/li[2]")
    WebElement laptopAndNotebookLink;
    @CacheLookup
    @FindBy(linkText = "Show AllLaptops & Notebooks")
    WebElement showAllLaptopAndNotebook;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccountLink;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;
    @CacheLookup
    @FindBy(xpath = "//li[@class='dropdown open']/ul/li[2]")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement logoutLinkText;

    //this method will get logout text
    public String logOutText() {
        log.info("Log out " + logoutLinkText.toString());
        return logoutLinkText.getText();
    }

    //this method will click on register link
    public void clickOnRegisterLink() {
        log.info("Link for registration " + registerLink.toString());
        clickOnElement(registerLink);
    }


    //this method will click on login
    public void clickOnloginLink() {
        log.info("click on login link " + loginLink.toString());
        clickOnElement(loginLink);
        //CustomListeners.test.log(Status.PASS, "click on login link " + loginLink.getText());
    }

    //this method will click on my account link
    public void clickOnmyAccountLink() {
        log.info("My account link  ");
        clickOnElement(myAccountLink);

    }

    public void selectRequiredCurrency() {
        clickOnElement(currencyLink);
        clickOnElement(By.xpath("(//button[@class='currency-select btn btn-link btn-block'])[2]"));

    }

    public void hoverOnDesktop() {
        log.info("desktop link  " + desktopLink.toString());
        mouseHoverToElement(desktopLink);
    }

    public void clickOnDesktoplink() {
        log.info("show alldesktop link  " + showAllDesktopLink.toString());
        clickOnElement(showAllDesktopLink);

    }

    public void hoverOnLaptopsandNotebooks() {
        log.info("Laptop and notebook link  " + laptopAndNotebookLink.toString());
        mouseHoverToElement(laptopAndNotebookLink);

    }

    public void clickOnShowALLLaptopAndNotebook() {
        log.info("show all Laptop and notebook link  " + showAllLaptopAndNotebook.toString());
        clickOnElement(showAllLaptopAndNotebook);


    }


}

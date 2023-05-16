package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement addToShoppingLink;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")
    WebElement monthAndYearText;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//th[@class='next']")
    WebElement nextButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']")
    List<WebElement> dateList;
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'input-group date']//button")
    WebElement datePicker;

    @CacheLookup
    @FindBy(css = "i[class='fa fa-calendar']")
    WebElement calendarButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='datepicker']/div[1]/table/thead/tr[1]/th[2]")
    WebElement monthYearSelect;

    @CacheLookup
    @FindBy(xpath = "//div[@class='datepicker']/div[1]/table/thead/tr[1]/th[3]")
    WebElement nextMonthAndYearButtonInCalendar;


    @CacheLookup
    @FindBy(xpath = "//div[@class='datepicker']//div//table//td")
    List<WebElement> datesInCalendar;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement addToShoppingCart;
    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement macBookText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement laptopAddedSucessfullyText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-quantity']")
    WebElement selectQuantity;

    public void enterQuantityRequired(String quantity) {
        log.info("Clear text " + selectQuantity.toString());
        clearTextFromField(selectQuantity);
        // Reporter.log("Send quantity " + quantity + " to firstname field " + selectQuantity.toString());
        sendTextToElement(selectQuantity, quantity);
    }

    //   this method will add the item in the cart
    public void clickAddToCart() {
        log.info("Add to cart" + addToCart.toString());
        clickOnElement(addToCart);

    }

    //this metod will click on the shopping link
    public void clickOnShoppingCartLink() {
        log.info("Add to shopping cart" + addToShoppingCart.toString());
        clickOnElement(addToShoppingCart);

    }

    //this method will verify the macbook text
    public String getMacBookLaptopText() {
        log.info("Macbook text" + macBookText.toString());
        return macBookText.getText();
    }

    public String getMacBookAddedSuccessfullyText() {
        log.info("Macbook add successfully" + laptopAddedSucessfullyText.toString());
        return laptopAddedSucessfullyText.getText();
    }

    public String getAddToCartText() {
        log.info("add to cart text" + addToShoppingLink.toString());
        return addToShoppingLink.getText();
    }

    public void selectDateAndYearOnCalendar(String month, String year) {
        log.info("Clicking on Calender Button " + calendarButton.toString());
        clickOnElement(calendarButton);
        while (true) {
            String monthYear = getTextFromElement(monthYearSelect);
            String arr[] = monthYear.split(" ");
            String mon = arr[0];
            String yr = arr[1];

            if (mon.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(nextMonthAndYearButtonInCalendar);
            }

        }

    }

    //This method will select the date
    public void selectDateOnCalendar(String date) {
        log.info("Select Date " + datesInCalendar.toString());
        List<WebElement> allDates = datesInCalendar;
        for (WebElement dt : allDates) {
            if (dt.getText().equalsIgnoreCase(date)) {
                dt.click();
                break;

            }
        }
    }


}

package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//select[@id='input-sort']")
    WebElement sortBy;

    @CacheLookup
    @FindBy(xpath = "//h4/a")
    List<WebElement> listOfProducts;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]")
    WebElement titleOfDesktop;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
    WebElement laptopName;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='HP LP3065']")
    WebElement laptopText;
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
    @FindBy(xpath = "//input[@id='input-quantity']")
    WebElement selectQuantity;
    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement addToShoppingCart;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement addToShoppingLink;

    public void clickAddToCart() {
//        Reporter.log("Add to cart" + addToCart.toString());
//        CustomListeners.test.log(Status.PASS, "Add to cart" + addToCart);
        clickOnElement(addToCart);
    }

    public void clickOnShoppingCartLink() {
        log.info("Add to shopping cart" + addToShoppingCart.toString());
        clickOnElement(addToShoppingCart);
        // CustomListeners.test.log(Status.PASS, "Add to shopping cart" + addToShoppingCart);

    }

    public String getAddToCartText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("add to cart text" + addToShoppingLink.toString());
        return addToShoppingLink.getText();
    }


    public void enterQuantityRequired(String quantity) {
        log.info("Clear text " + selectQuantity.toString());
        clearTextFromField(selectQuantity);
        // Reporter.log("Send quantity " + quantity + " to firstname field " + selectQuantity.toString());
        sendTextToElement(selectQuantity, quantity);
        //  CustomListeners.test.log(Status.PASS, "Quantity is " + quantity);
    }


    //this method will get the page title text
    public String getDesktopText() {
        log.info("Title " + titleOfDesktop.toString());
        return titleOfDesktop.getText();
    }

    public ArrayList beforeSortTheProducts() {
        List<WebElement> products = listOfProducts;
        ArrayList<String> originalProductList = new ArrayList<>();
        for (WebElement list : products) {
            originalProductList.add(list.getText());
        }
        return originalProductList;
    }

    public ArrayList afterSortingTheProducts() {

        Collections.reverse(beforeSortTheProducts());
        System.out.println(beforeSortTheProducts());
        List<WebElement> products = listOfProducts;
        ArrayList<String> afterSortList = new ArrayList<>();
        for (WebElement newList : products) {
            afterSortList.add(newList.getText());
        }
        return afterSortList;
    }

    public void clickOnHPLP3065() {
        log.info("Laptop name " + laptopName.toString());
        clickOnElement(laptopName);
    }

    public String getTextOfTheLaptop() {
        log.info("Laptop text " + laptopText.toString());
        return laptopText.getText();
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

    public void sortListByZtoA() {
        log.info("Sort By " + sortBy.toString());
        selectByVisibleTextFromDropDown(sortBy, "Name (Z - A)");

    }

    public void listAtoZ() {
        log.info("A -Z " + sortBy.toString());
        selectByVisibleTextFromDropDown(sortBy, "Name (A - Z)");
    }

}



Feature: Laptop and notebook test

  Scenario: Verify products price display high to low successfully()
    When  Mouse hover on Laptops & Notebooks Tab.and click
    And I Click on “Show All Laptops & Notebooks”
    Then I Select Sort By "Price (High > Low)"


  @smoke @regression
  Scenario: Verify that user place order successfully
    When I select the currency to pounds for laptop page
    And I Mouse hover on Laptops & Notebooks Tab and click
    And Click on “Show All Laptops & Notebooks”
    And  I select Sort By "Price (High > Low)" on laptop and notebook page
    And I Select Product “MacBook”
    And I Verify the text “MacBook”
    And I click on ‘Add To Cart’ button
    And I verify the message “Success: You have added MacBook to your shopping cart!”
    And I click on link “shopping cart” display into success message
    And I verify the text "Shopping Cart"
    And I verify the Product name "MacBook"
    And I change Quantity "2"
    And I click on “Update” Tab
    And I verify the message “Success: You have modified your shopping cart!”
    And I verify the Total £737.45
    And I Click on “Checkout” button
    And I Verify the text “Checkout”
    And I Verify the Text “New Customer”
    And I Click on “Guest Checkout” radio button
    And I Click on “Continue” tab
    And I Fill the mandatory fields
    And I Click on “Continue” Button
    And I Add Comments About your order into text area
    And I Check the Terms & Conditions check box
    And I Click on “Continue” button on payment page
    And I Verify the message “Warning: Payment method required!”
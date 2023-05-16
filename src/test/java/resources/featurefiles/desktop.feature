Feature: Desktop test

  Background:
    Given I am on homepage

  @sanity @regression
  Scenario: verify product arranged in alphabetically
    When I hover over desktop
    And I click on dekstop link
    And I sorty thr list by Z to A
    Then I verify thr sorted list


  @smoke @regression
  Scenario: verify products added to shopping cart successfully
    When I select the currency to pounds
    And I hover mouse on desktop
    And I click on Desktop link
    And I Change the the sort by position Z to A
    And I select the laptop HP LP3065
    And I verify the laptop text
    And I select delivery date from calendar
    And I change the quantity to 1
    And I click on add to cart button
    And I verify the laptop have been added to the cart
    And I click on shopping cart link
    And I verify the shopping cart text
    And I verify the product name
    And I Verify the product model
    Then I verify the total price
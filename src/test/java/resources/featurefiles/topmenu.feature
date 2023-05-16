Feature: TopMenu Test
  Background:
    Given I am on homepage
  @sanity @regression
    Scenario: Verify user should navigate to Laptop and Notebook page successfuly
    When I hover over main menu bar
    And I click on laptops and Notebooks tab
    Then I verify the laptop and notebook text

    @smoke @regression
      Scenario: verify user can navigate to Desktops page successfully
      When I hover over desktops from main menu
      And I select show all desktops
      Then I verify the desktop text
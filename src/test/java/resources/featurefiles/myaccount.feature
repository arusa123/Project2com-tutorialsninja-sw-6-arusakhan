Feature: MyAccount test

  Background:
    Given I am on homepage

  @sanity @regression
  Scenario: Verify user should navigate to register page successfully
    When I click on my account link
    And I click on register link
    Then I verify the register text

  @smoke @regression
  Scenario: verify that user register account successfully
    When I click on my account link
    And I click on on register link
    And I enter "<Prime>" in the first name field
    And I enter "<Testing>" in the last name field
    And I enter "<prime>" in the email field
    And I enter "<02089653876>" in the phone field
    And I enter "<prime>" in the password field
    And I enter "<prime>" in the confirm password field
    And I select subscribe yes radio button
    And I clcik on privacy policy check box
    And I click on continue button
    And I verify account registered successfully
    And I click on continue button after creating account
    And I click on my account link on homepage
    And I click on logout button
    And I verify the Account Logout text
    Then I click on contiune button after registering


  @regression
  Scenario: verify user should navigate to login page successfully
    When I click on my account link for login page
    And I select my account options
    Then I verify returning customer

  @regression
  Scenario: verify that user should login and logout successfully
    When I click on my account link
    And I select my account options
    And I enter "<prime22@gmail.com>" in the email field on login pafe
    And I enter "<Prime123> in the password field on login page
    And I click on login button
    And I verify my account text
    And I click on my account link on login page
    And I click on logout button
    And I verify the Account logout text on account page
    Then I click on continue button after logout

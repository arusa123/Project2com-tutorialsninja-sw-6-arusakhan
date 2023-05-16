package com.tutorialsninja.steps;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.pages.MyAccountPage;
import com.tutorialsninja.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyAccountSteps {
    @When("^I click on my account link$")
    public void iClickOnMyAccountLink() {
        new MyAccountPage().clickOnMyAccountLink();
    }

    @And("^I click on register link$")
    public void iClickOnRegisterLink() {
        new MyAccountPage().clickOnRegisterLink();
    }

    @Then("^I verify the register text$")
    public void iVerifyTheRegisterText() {
        Assert.assertEquals("not navigated to register","Register Account",new MyAccountPage().getTextForRegister());
    }

    @And("^I click on on register link$")
    public void iClickOnOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @And("^I enter \"([^\"]*)\" in the first name field$")
    public void iEnterInTheFirstNameField(String firstName)  {
        new RegisterPage().sendTextFirstNameField("prime");

    }

    @And("^I enter \"([^\"]*)\" in the last name field$")
    public void iEnterInTheLastNameField(String lastName)  {
        new RegisterPage().sendTextLastNameField("Testing");

    }

    @And("^I enter \"([^\"]*)\" in the email field$")
    public void iEnterInTheEmailField(String email)  {
        new RegisterPage().sendTextEmailField("prime");

    }

    @And("^I enter \"([^\"]*)\" in the phone field$")
    public void iEnterInThePhoneField(String phone)  {
        new RegisterPage().sendTexTelephoneField("0123456845");

    }

    @And("^I enter \"([^\"]*)\" in the password field$")
    public void iEnterInThePasswordField(String password)  {
        new RegisterPage().sendTextPasswordField(password);

    }

    @And("^I enter \"([^\"]*)\" in the confirm password field$")
    public void iEnterInTheConfirmPasswordField(String confrmPassword)  {
new RegisterPage().sendTextConfirmPasswordField(confrmPassword);
    }

    @And("^I select subscribe yes radio button$")
    public void iSelectSubscribeYesRadioButton() {
        new RegisterPage().selectSubscribeButtons("Yes");
    }

    @And("^I clcik on privacy policy check box$")
    public void iClcikOnPrivacyPolicyCheckBox() {
        new RegisterPage().clickOnPrivacyButton();
    }


    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new RegisterPage().clickOnContinueButton();
    }
    @And("^I verify account registered successfully$")
    public void iVerifyAccountRegisteredSuccessfully() {
        Assert.assertEquals("not registered","Your Account Has Been Created!",new RegisterPage().getAccountCreatedMessage());
    }

    @And("^I click on my account link on homepage$")
    public void iClickOnMyAccountLinkOnHomepage() {
        new HomePage().clickOnmyAccountLink();
    }

    @And("^I verify the Account Logout text$")
    public void iVerifyTheAccountLogoutText() {
        Assert.assertEquals("wrong message","Account Logout",new MyAccountPage().getLogoutText());
    }

    @And("^I click on continue button after creating account$")
    public void iClickOnContinueButtonAfterCreatingAccount() {

    }

    @Then("^I click on contiune button after registering$")
    public void iClickOnContiuneButtonAfterRegistering() {
        new MyAccountPage().clickOnLogOutButtonAfterAccountCreated();
    }

    @When("^I click on my account link for login page$")
    public void iClickOnMyAccountLinkForLoginPage() {
        new HomePage().clickOnmyAccountLink();
    }

    @And("^I select my account options$")
    public void iSelectMyAccountOptions() {
        new MyAccountPage().selectMyAccountOptions("Login");    }

    @Then("^I verify returning customer$")
    public void iVerifyReturningCustomer() {
        Assert.assertEquals("not directed to login page","Returning Customer",new MyAccountPage().getLoginText());
    }

    @And("^I enter \"([^\"]*)\" in the email field on login pafe$")
    public void iEnterInTheEmailFieldOnLoginPafe(String email)  {
        new LoginPage().sendTextToEmailAddressField("prime22@gmail.com");

    }

    @And("^I enter \"<Prime(\\d+)> in the password field on login page$")
    public void iEnterPrimeInThePasswordFieldOnLoginPage(String password)  {
new LoginPage().sendTextToPasswordField("Prime123");
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @And("^I verify my account text$")
    public void iVerifyMyAccountText() {
        Assert.assertEquals("error", "My Account",new MyAccountPage().getMyAccountText());
    }

    @And("^I click on my account link on login page$")
    public void iClickOnMyAccountLinkOnLoginPage() {
        new MyAccountPage().clickOnMyAccountLink();
    }

    @And("^I click on logout button$")
    public void iClickOnLogoutButton() {
        new MyAccountPage().selectMyAccountOptions("Logout");
    }
    @And("^I verify the Account logout text on account page$")
    public void iVerifyTheAccountLogoutTextOnAccountPage() {
        Assert.assertEquals("not loged out","Account Logout",new MyAccountPage().getLogoutText());
    }

    @Then("^I click on continue button after logout$")
    public void iClickOnContinueButtonAfterLogout() {
        new RegisterPage().clickOnContinueButtonAfterAccountCreation();
        
    }
}

package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa3.fasttrackit.org:8008/my-account")
public class MyAccountPage extends PageObject {
    HomePage homePage;

    @FindBy(css = "p:nth-child(1)")
    private WebElementFacade welcomeMessageStrong;

    @FindBy(css = ".woocommerce-error")
    private WebElementFacade errorMessageStrong;

    @FindBy(css = "[id^='username']")
    private WebElementFacade emailMyAccount;


    @FindBy(css = "[id='password']")
    private WebElementFacade passwordField;

    @FindBy(css = "a[href*='edit-account']")
    private WebElementFacade accountDetailsButton;

    @FindBy(css = " form #password")
    private WebElementFacade passwordMyAccountField;


    //@FindBy(css = ".form-row-first #account_first_name")
    @FindBy (css = "input[type*='text']#account_first_name")
    private WebElementFacade firstNameFieldMyAccount;

    //@FindBy(css = ".form-row-last #account_last_name")
    @FindBy (css = "input[type*='text']#account_last_name")
    private WebElementFacade lastNameFieldMyAccount;

    @FindBy(css = ".form-row-wide #password_1")
    private WebElementFacade newPassWordFieldMyAccount;

    @FindBy(css = "fieldset .form-row-wide #password_1")
    private WebElementFacade confirmNewPassWordFieldMyAccount;


    public boolean checkLoggedIn() {
        waitFor(welcomeMessageStrong);
        return welcomeMessageStrong.containsText("hermioneg");
    }

    public void enterEmailMyAccountField() {
        typeInto(emailMyAccount, "hermioneg@gmail.com");
    }

    public boolean checkInvalidUsername257() {
        waitFor(errorMessageStrong);
        return errorMessageStrong.containsText("ERROR: Invalid email address.");
    }

    public boolean checkValidEmailMyAccount() {
        waitFor(emailMyAccount);
        typeInto(emailMyAccount, "hermioneg@gmail.com");
        return emailMyAccount.containsText("hermioneg@gmail.com");
    }

    public void clickAccountDetailsButton() {
        clickOn(accountDetailsButton);
    }


    public boolean checkPasswordMyAccountField() {
        waitFor(passwordMyAccountField);
        return passwordMyAccountField.containsText("notamuggle77");
    }

    public boolean checkRegisterValid() {
        waitFor(welcomeMessageStrong);
        return welcomeMessageStrong.containsText("Hello hermioneg (not hermioneg? Log out)");
    }

    public boolean checkRegister(String username) {
        waitFor(welcomeMessageStrong);
        return welcomeMessageStrong.containsText("Hello " + username);
    }

    public boolean checkFirstNameFieldMyAccount() {
        waitFor(firstNameFieldMyAccount);
        return firstNameFieldMyAccount.getText().contains("Hermione");
    }

    public boolean checkLastNameFieldMyAccount() {

        waitFor(lastNameFieldMyAccount);
        return lastNameFieldMyAccount.getText().contains("Granger");
    }

    public boolean verifyNewPassWordFieldMyAccount() {
        return passwordMyAccountField.equals(newPassWordFieldMyAccount);

    }

    public boolean verifyFirstLastNameConditions() {
        if (firstNameFieldMyAccount.getText().contains("Hermione") && (lastNameFieldMyAccount.getText().contains("Granger"))) {
            return true;
        }
        return false;
    }




}








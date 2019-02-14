package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa3.fasttrackit.org:8008/my-account")
public class LoginPage extends PageObject {


    @FindBy(css = "[id^='username']")
    private WebElementFacade emailField;


    @FindBy(css = "[id^='password']")
    private WebElementFacade passwordField;

    @FindBy(css = "[name^='login']")
    private WebElementFacade loginButton;

    @FindBy(css = ".woocommerce .woocommerce-error")
    private WebElementFacade errormessageLogin;

    public void setEmailField() {
        waitFor(emailField);
        typeInto(emailField, "hermioneg@gmail.com");
    }

    public void setInvalidEmailCaps() {
        waitFor(emailField);
        typeInto(emailField, "heRmioneg@gmail.com");
    }

    public void setUserInvalid257() {
        waitFor(emailField);
        typeInto(emailField, "swajhduuenuztwyxrlrylepcdwfcjwbdvgtnoyvjedktyjvtyxjhtizwhlkrzbmojmtqgvjjbapisfvsusnvcxrgfxpfcmkolrtjzuogfjsdsimnbflqmixvnozyyuepzuitgugteovwezrdrlleobanfjrrepjpuwmhcqzfsujqqvztsfykvnqdaikacrostpnkjkonosrfbefsplluybtsluqkpstbylykfnhjuzgljranmgiprlfqmwkdwxqze@gmail.com");
    }

    public void setPasswordField() {
        typeInto(passwordField, "notamuggle77");
    }

    public void clickLoginButton() {
        clickOn(loginButton);
    }


    public boolean errorMessageLogin() {
        waitFor(errormessageLogin);
        return errormessageLogin.containsText("ERROR");
    }

    public boolean InvalidLogInWithIf() {
        if (errorMessageLogin()) {
            setEmailField();
            setPasswordField();
            clickLoginButton();
            return true;
        }
        return false;
    }

    public void setEmailField2() {
        waitFor(emailField);
        typeInto(emailField, "hermg@gmail.com");
    }






}







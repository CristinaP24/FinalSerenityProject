package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("http://qa3.fasttrackit.org:8008/my-account")
public class MyAccountAdminPage extends PageObject {


    @FindBy(css ="[id^='username']")
    private WebElementFacade UsernameAdmin;

    @FindBy(css = "[id='password']")
    private WebElementFacade passwordField;

    @FindBy (css = "li a[href*='my-account']")
    private WebElementFacade myAccountButton;

    @FindBy(css = "[name^='login']")
    private WebElementFacade loginButton;


    @FindBy(css = "p:nth-child(1)")
    private WebElementFacade welcomeMessageStrongAdmin;

    public void clickOnmyAccountButton (){
        clickOn(myAccountButton);
    }


    public void enterAdminUsername () {
        typeInto(UsernameAdmin, "admin");}

    public void enterAdminPassword() {
        typeInto(passwordField, "parola11");
    }

    public void clickLogInButton (){
        clickOn(loginButton);
    }

    public boolean checkLoggedInAdmin(){
        waitFor(welcomeMessageStrongAdmin);
        return welcomeMessageStrongAdmin.containsText("Hello admin");
    }
















}

package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa3.fasttrackit.org:8008/my-account")

public class RegisterPage extends PageObject {

    @FindBy (css = "input[id*='reg_email']")
    private WebElementFacade registerEmailField;

    @FindBy (css = "#menu-item-1730")
    private WebElementFacade myAccountButton;

    @FindBy (css = "input[id*='reg_password']")
    private WebElementFacade registerPasswordField;

    @FindBy (css = "button[value*='Register']")
    private WebElementFacade registerButton;

    public void clickMyAccountButton (){clickOn(myAccountButton);}

    public void enterRegisterEmailStr (String registerEmail){
        typeInto(registerEmailField, registerEmail);
    }

    public void enterRegisterPassword (){
        typeInto(registerPasswordField, "whateverpassasapass237");
    }

    public void registerButton (){
        clickOn(registerButton);
    }

}

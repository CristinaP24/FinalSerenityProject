package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import java.util.concurrent.TimeUnit;

@DefaultUrl("http://qa3.fasttrackit.org:8008")
public class HomePage extends PageObject {

    @FindBy(css = "#menu-item-1730")
    private WebElementFacade myAccountButton;


    public void clickMyAccountButton(){
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(myAccountButton);
        clickOn(myAccountButton);
    }

    //public void clickLoginLink(){
       // clickOn(logInLink);
    }



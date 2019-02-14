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

    @FindBy (css = "li[id*='menu-item-1642']")
    private WebElementFacade homePageButton;

    @FindBy (css = "a[href*='checkout']")
    private WebElementFacade checkoutHomePageButton;

    public void clickMyAccountButton(){
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(myAccountButton);
        clickOn(myAccountButton);
    }
public void homePageButton (){
        clickOn(homePageButton);
}

public void checkoutHomePageButton (){
        clickOn(checkoutHomePageButton);
}

    //public void clickLoginLink(){
       // clickOn(logInLink);
    }



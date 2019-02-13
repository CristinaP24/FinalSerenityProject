package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("http://qa3.fasttrackit.org:8008/my-account")
public class MyAccountPage extends PageObject {


    @FindBy(css = "p:nth-child(1)")
    private WebElementFacade welcomeMessageStrong;

    @FindBy (css = ".woocommerce-error")
private WebElementFacade errorMessageStrong;

    //@FindBy (css = "[value~='hermioneg@gmail.com']")
    //@FindBy (css = "input[type*='text']")
    @FindBy (css ="[id^='username']")
    private WebElementFacade emailMyAccount;


    @FindBy(css = "[id='password']")
    private WebElementFacade passwordField;

    @FindBy (css = "a[href*='edit-account']")
    private WebElementFacade accountDetailsButton;

    @FindBy (css = "[id^='password']")//de corectat
    private WebElementFacade passwordMyAccountField;

    public boolean checkLoggedIn(){
        waitFor(welcomeMessageStrong);
        return welcomeMessageStrong.containsText("hermioneg");
    }
public void enterEmailMyAccountField(){
        typeInto(emailMyAccount, "hermioneg@gmail.com");
}
    public boolean checkInvalidUsername257(){
        waitFor(errorMessageStrong);
        return errorMessageStrong.containsText("ERROR: Invalid email address.");
    }

    public boolean checkValidEmailMyAccount (){
        waitFor(emailMyAccount);//corectare
        typeInto(emailMyAccount,"hermioneg@gmail.com");
        return emailMyAccount.containsText("hermioneg@gmail.com");
    }

    public void clickAccountDetailsButton (){
        clickOn(accountDetailsButton);
    }

//   public void clickPasswordMyAccountField (){
//      clickOn(passwordMyAccountField);
//    }

    public boolean checkPasswordMyAccountField (){
        waitFor(passwordMyAccountField); //de corectat
        typeInto(passwordMyAccountField, "notamuggle77");
        return passwordMyAccountField.containsText("notamuggle77");
    }

    public boolean checkRegisterValid(){
        waitFor(welcomeMessageStrong);
        return welcomeMessageStrong.containsText("Hello hermioneg (not hermioneg? Log out)");
    }



    public boolean checkRegister(String username){ //pt mine sa verific
        waitFor(welcomeMessageStrong);
        System.out.println(welcomeMessageStrong.getText());
        return welcomeMessageStrong.containsText("Hello " + username);
    }


     }






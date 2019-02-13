package com.fast.pages;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa3.fasttrackit.org:8008/")
public class CheckoutPage extends PageObject {

    @FindBy (css = "a[href*='checkout']")
    private WebElementFacade checkoutButton;

   @FindBy (css =  "input[id*='billing_first_name']")
    private WebElementFacade firstNameField;

    @FindBy (css =  "input[id*='billing_last_name']")
    private WebElementFacade lastNameField;

    @FindBy (css = "input[id*='billing_address_1']")
    private WebElementFacade billingAddress1Field;

    @FindBy (css = "input[id*='billing_city']")
    private WebElementFacade billingCityField;

    @FindBy (css = "input[id*='billing_postcode']")
    private WebElementFacade billingPostcodeField;

    @FindBy (css = "input[id*='billing_phone']")
    private WebElementFacade billingPhoneField;

    @FindBy (css = "textarea[id*='order_comments']")
    private WebElementFacade orderCommentsField;

    @FindBy (css = "button[id*='place_order']")
    private WebElementFacade placeOrderButton;

    @FindBy (css = "div p:first-child")
    private WebElementFacade checkoutThanksMessage;

    @FindBy (css = "li strong")
    private WebElementFacade checkErrorPhoneMessageBilling;

    @FindBy (css = "ul strong")
    private WebElementFacade checkErrorCountryMessageBilling;


    public void clickCheckoutButton (){clickOn(checkoutButton);}
    public void enterFirstNameField (){typeInto(firstNameField, "Hermione");}
    public void enterLastNameField (){typeInto(lastNameField,"Granger" );}
    public void enterBillingAddressField (){typeInto(billingAddress1Field, "Hogwarts School of Magic");}
    public void enterBillingCityField (){typeInto(billingCityField, "London");}
    public void enterBillingPostCodeField (){typeInto(billingPostcodeField, "12345678");}
    public void enterBillingPhoneField (){typeInto(billingPhoneField, "012345678");}
    public void enterBilling0PhoneField (){typeInto(billingPhoneField, "0");}
    public void enterOrderCommentsField (){typeInto(orderCommentsField, "Wingardium-Leviosa forever!");}
    public void clickPlaceOrderButton (){clickOn(placeOrderButton);}

    public boolean checkoutThanksMessagecheck(){
        waitFor(checkoutThanksMessage);
        return checkoutThanksMessage.containsText("Thank you. Your order has been received.");
    }
    public boolean checkErrorPhoneMessageBilling(){
     waitFor(checkErrorPhoneMessageBilling);
     return checkErrorPhoneMessageBilling.containsText("Billing Phone is a required field.");
    }
    public boolean checkErrorCountryMessageBilling(){
  waitFor(checkErrorCountryMessageBilling);
  return checkErrorCountryMessageBilling.containsText("Billing Street address is a required field.");
 }



    public boolean ifCheckPhoneTksMessage (){
     if ((checkErrorPhoneMessageBilling()&& (checkErrorCountryMessageBilling())==true)){
      return checkoutThanksMessagecheck();
     }
     return true;
    }

}

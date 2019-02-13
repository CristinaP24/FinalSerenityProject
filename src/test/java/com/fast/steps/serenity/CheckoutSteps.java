package com.fast.steps.serenity;

import com.fast.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class CheckoutSteps extends ScenarioSteps {
    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;
    CheckoutPage checkoutPage;
    CartPage cartPage;

    @Step
    public void navigateToHomepage() {
        homePage.open(); }

    @Step
    public void goToLogin() {
        homePage.clickMyAccountButton(); }
    @Step
    public void emailMyAccountField (){
        myAccountPage.enterEmailMyAccountField(); }
      @Step
    public void checkPasswordMyAccountField() {
        myAccountPage.checkPasswordMyAccountField(); }
   @Step
    public void clickLoginButton (){
        loginPage.clickLoginButton(); }

        @Step
        public void clickShopButton (){
        cartPage.clickOnShopButton();
        }
        @Step
       public void addCapToCart (){
        cartPage.viewCapProduct();
        cartPage.clickAddtoCartButton();
       }


  @Step
    public void clickCheckoutButton (){
        checkoutPage.clickCheckoutButton(); }
  @Step
    public void enterFirstNameField (){
        checkoutPage.enterFirstNameField(); }
    @Step
    public void enterLastNameField (){
        checkoutPage.enterLastNameField(); }
    @Step
    public void enterBillingAddressField (){
        checkoutPage.enterBillingAddressField(); }

    @Step
    public void enterBillingCityField (){
        checkoutPage.enterBillingCityField(); }
    @Step
    public void enterBillingPostcodeField (){
        checkoutPage.enterBillingPostCodeField(); }
     @Step
    public void enterBillingPhoneField (){
        checkoutPage.enterBillingPhoneField(); }
        @Step
        public void enterBilling0PhoneField (){
        checkoutPage.enterBilling0PhoneField();
        }
    @Step
    public void enterOrderCommentsField (){
        checkoutPage.enterOrderCommentsField(); }

    @Step
    public void clickPlaceOrderButton (){
        checkoutPage.clickPlaceOrderButton(); }
    @Step
    public boolean checkoutThanksMessagecheck (){
        Assert.assertTrue(checkoutPage.checkoutThanksMessagecheck());
        return true;
    }

        @Step
        public boolean checkErrorPhoneMessageBilling (){
        Assert.assertTrue(checkoutPage.checkErrorPhoneMessageBilling());
    return false;}

        @Step
        public boolean checkErrorCountryMessageBilling (){
        Assert.assertTrue(checkoutPage.checkErrorCountryMessageBilling());
        return true; }

        @Step
        public boolean ifCheckPhoneTksMessage (){

            if (((checkErrorPhoneMessageBilling()&& (checkErrorCountryMessageBilling())))){
                return checkoutThanksMessagecheck();
            }
            return false;
        }


    @StepGroup
    public void validCheckout (){
        navigateToHomepage();
        goToLogin();
        emailMyAccountField();
        checkPasswordMyAccountField();
        clickLoginButton();
        clickShopButton();
        addCapToCart();
        clickCheckoutButton();
        enterFirstNameField();
        enterLastNameField();
        enterBillingAddressField();
        enterBillingCityField();
        enterBillingPostcodeField();
        enterBillingPhoneField();
        enterOrderCommentsField();
        clickPlaceOrderButton();
        checkoutThanksMessagecheck();
    }
    @StepGroup
    public void ifCheckinvalidCheckout (){
        navigateToHomepage();
        goToLogin();
        emailMyAccountField();
        checkPasswordMyAccountField();
        clickLoginButton();
        clickShopButton();
        addCapToCart();
        clickCheckoutButton();
        enterFirstNameField();
        enterLastNameField();
        enterBillingAddressField();
        enterBillingCityField();
        enterBillingPostcodeField();
        enterBilling0PhoneField();
        enterOrderCommentsField();
        clickPlaceOrderButton();
        checkErrorPhoneMessageBilling();
        checkErrorCountryMessageBilling();
        checkoutThanksMessagecheck();
        ifCheckPhoneTksMessage();
    }


}

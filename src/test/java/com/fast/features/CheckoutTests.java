package com.fast.features;

import com.fast.steps.serenity.CheckoutSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CheckoutTests {
    @Managed(uniqueSession = true)
    private WebDriver driver;
    @Steps
    private CheckoutSteps checkoutSteps;

    @Test
    public void validCheckout() {
        checkoutSteps.navigateToHomepage();
        checkoutSteps.goToLogin();
        checkoutSteps.emailMyAccountField();
        checkoutSteps.checkPasswordMyAccountField();
        checkoutSteps.clickLoginButton();
        checkoutSteps.clickShopButton();
        checkoutSteps.addCapToCart();
        checkoutSteps.clickCheckoutButton();
        checkoutSteps.enterFirstNameField();
        checkoutSteps.enterLastNameField();
        checkoutSteps.enterBillingAddressField();
        checkoutSteps.enterBillingCityField();
        checkoutSteps.enterBillingPostcodeField();
        checkoutSteps.enterBillingPhoneField();
        checkoutSteps.enterOrderCommentsField();
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkoutThanksMessagecheck();
    }

    @Test
    public void ifCheckinvalidCheckout() {
        checkoutSteps.navigateToHomepage();
        checkoutSteps.goToLogin();
        checkoutSteps.emailMyAccountField();
        checkoutSteps.checkPasswordMyAccountField();
        checkoutSteps.clickLoginButton();
        checkoutSteps.clickShopButton();
        checkoutSteps.addCapToCart();
        checkoutSteps.clickCheckoutButton();
        checkoutSteps.enterFirstNameField();
        checkoutSteps.enterLastNameField();
        checkoutSteps.enterBillingAddressField();
        checkoutSteps.enterBillingCityField();
        checkoutSteps.enterBillingPostcodeField();
        checkoutSteps.enterBilling0PhoneField();
        checkoutSteps.enterOrderCommentsField();
        checkoutSteps.clickPlaceOrderButton();
        checkoutSteps.checkErrorPhoneMessageBilling();
        checkoutSteps.ifCheckPhoneTksMessage();
    }
}

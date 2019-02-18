package com.fast.features;

import com.fast.pages.HomePage;
import com.fast.steps.serenity.CartSteps;
import com.fast.steps.serenity.CheckoutSteps;
import com.fast.steps.serenity.LoginSteps;
import com.fast.steps.serenity.ShopSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTests {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    CartSteps cartSteps;
    @Steps
    ShopSteps shopSteps;


    @Test
    public void addProductCartWithoutLogIn() {
        cartSteps.navigateToHomepage();
        cartSteps.clickOnShopButton();
        cartSteps.addBeanieToCart();
        cartSteps.viewShoppingCartButton();
    }

    @Test
    public void addProductCart_10000() {
        cartSteps.navigateToHomepage();
        cartSteps.clickOnShopButton();
        cartSteps.viewCapProduct();
        cartSteps.clickQtyBox();
        cartSteps.addToCartButton_10000();
        cartSteps.clickAddToCartButton();
    }

    @Test
    public void checkQtyCartIf() {
        cartSteps.navigateToHomepage();
        cartSteps.clickOnShopButton();
        cartSteps.viewCapProduct();
        cartSteps.click3QtyBox();
        cartSteps.clickAddToCartButton();
        cartSteps.checkoutHomePageButton();
        cartSteps.viewShoppingCartButton();
        cartSteps.checkQtyCartIf();
        cartSteps.proceedToCheckoutButton();

    }

}

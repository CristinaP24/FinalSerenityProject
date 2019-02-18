package com.fast.features;

import com.fast.pages.HomePage;
import com.fast.steps.serenity.CartSteps;
import com.fast.steps.serenity.ShopSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class ShopTests {
    @Managed(uniqueSession = true)
    private WebDriver driver;
    @Steps
    ShopSteps shopSteps;
    @Steps
    CartSteps cartSteps; // daca nu pui @steps inainte, nu ti-l initializeaza, si de-aia ai eroarea: NullPointerException


    @Test
    public void selectBeltForList() {
        shopSteps.validLogin();
        shopSteps.clickOnShopButtonMainMenu();
        shopSteps.selectBeltForProduct();
    }
    @Test
    public void selectHoodieElseProduct() {
        shopSteps.validLogin();
        shopSteps.clickOnShopButtonMainMenu();
        shopSteps.selectHoodieElseProduct();
        shopSteps.addToCartButtonPageProduct();
        shopSteps.shoppingCartIcon();
        cartSteps.removeProductFromCart();
        cartSteps.removeProductCartConfirm();
    }
    @Test
    public void selectCapElseIfProduct() {
        shopSteps.validLogin();
        shopSteps.clickOnShopButtonMainMenu();
        shopSteps.selectCapElseIfProduct();
        shopSteps.checkProductAfterSearchBar();
    }
}



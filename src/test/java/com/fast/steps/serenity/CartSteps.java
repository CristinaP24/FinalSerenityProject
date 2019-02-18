package com.fast.steps.serenity;

import com.fast.pages.CartPage;
import com.fast.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class CartSteps extends ScenarioSteps {

    private HomePage homePage;
    private CartPage cartPage;


    @Step
    public void clickHomePageButton() {
        homePage.homePageButton();
    }

    @Step
    public void navigateToHomepage() {
        getDriver().manage().window().maximize();
        homePage.open();
    }

    @Step
    public void clickOnShopButton() {
        cartPage.clickOnShopButton();
    }

    @Step
    public void addBeanieToCart() {
        cartPage.addBeanieToCartProduct();
    }

    @Step
    public void viewShoppingCartButton() {
        cartPage.viewShoppingCartButton();
    }

    @Step
    public void viewCapProduct() {
        cartPage.viewCapProduct();
    }

    @Step
    public void clickQtyBox() {
        cartPage.clickQtyBox();
    }

    @Step
    public void addToCartButton_10000() {
        cartPage.addToCartButton_10000();
    }

    @Step
    public void clickAddToCartButton() {
        cartPage.clickAddtoCartButton();
    }

    @Step
    public void click3QtyBox() {
        cartPage.click3QtyBox();
    }

    @Step
    public void proceedToCheckoutButton() {
        cartPage.proceedToCheckoutButton();
    }

    @Step
    public void checkQtyCartIf() {
        cartPage.checkQtyCartIf();
    }


    @Step
    public void removeProductFromCart() {
        cartPage.removeProductFromCart();
    }


    @Step
    public void removeProductCartConfirm() {
        Assert.assertTrue(cartPage.removeProductCartConfirm());
    }

    @Step
    public void checkoutHomePageButton() {
        homePage.checkoutHomePageButton();
    }

    @Step
    public void addProductCartConfirmMessage() {
        Assert.assertTrue(cartPage.addProductCartConfirmMessage());
    }

}

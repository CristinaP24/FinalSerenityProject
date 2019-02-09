package com.fast.steps.serenity;

import com.fast.pages.CartPage;
import com.fast.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;

public class CartSteps extends ScenarioSteps {

    HomePage homePage;
    CartPage cartPage;

    @Step
    public void clickHomePageButton (){homePage.homePageButton();}

    @Step
    public void navigateToHomepage(){
        homePage.open();
    }

    @Step
    public void clickOnShopButton (){cartPage.clickOnShopButton();}

    @Step
    public void addBeanieToCart (){cartPage.addBeanieToCartProduct();}

    @Step
    public void viewShoppingCartButton (){cartPage.viewShoppingCartButton();}

    @Step
    public void viewCapProduct (){cartPage.viewCapProduct();}

    @Step
    public void clickQtyBox (){cartPage.clickQtyBox();}

    @Step
    public void addToCartButton_10000 () {cartPage.addToCartButton_10000();}

    @Step
    public void clickAddToCartButton ()
    {cartPage.clickAddtoCartButton();}

    @Step
    public void click3QtyBox (){
        cartPage.click3QtyBox();
    }
    @Step
    public void proceedToCheckoutButton (){
        cartPage.proceedToCheckoutButton();
    }

    @Step
    public void checkQtyCartIf (){
        cartPage.checkQtyCartIf();
    }

    @Step
    public void  viewCartButton (){
        cartPage.viewCartButton();
    }
    @Step
    public void shoppingCartIcon (){
        cartPage.shoppingCartIcon();
    }
    @StepGroup
    public void addProductCartWithoutLogIn (){
        navigateToHomepage();
        clickOnShopButton();
        addBeanieToCart();
        viewShoppingCartButton();
    }

    @StepGroup
    public void addProductCart_10000 (){
        navigateToHomepage();
        clickOnShopButton();
        viewCapProduct();
        clickQtyBox();
        addToCartButton_10000();
        clickAddToCartButton();
    }


}

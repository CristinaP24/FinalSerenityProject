package com.fast.features;

import com.fast.steps.serenity.CartSteps;
import com.fast.steps.serenity.ShopSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class ShopTests  {
    @Managed(uniqueSession = true)
    private WebDriver driver;
@Steps
    ShopSteps shopSteps;
    CartSteps cartSteps;

@Test
public void selectBeltForList (){
    shopSteps.validLogin();
    shopSteps.clickOnShopButtonMainMenu();
    shopSteps.selectBeltForProduct();
}
@Test
    public void selectHoodieElseProduct (){
    shopSteps.validLogin();
    shopSteps.clickOnShopButtonMainMenu();
   // shopSteps.clickOn1stPageButton();
    shopSteps.selectHoodieElseProduct();
    shopSteps.addToCartButtonPageProduct();
    shopSteps.shoppingCartIcon();
    cartSteps.removeProductFromCart();
    cartSteps.removeProductCartConfirm();
}
@Test
    public void selectCapElseIfProduct (){
    shopSteps.validLogin();
    shopSteps.clickOnShopButtonMainMenu();
    shopSteps.selectCapElseIfProduct();
}

}



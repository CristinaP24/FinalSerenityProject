package com.fast.features;

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
    shopSteps.selectHoodieIfElseProduct();
}
@Test
    public void selectCapElseIfProduct (){
    shopSteps.validLogin();
    shopSteps.clickOnShopButtonMainMenu();
    shopSteps.selectCapWithElseIfProduct();
}
@Test
    public void selectIndex3OfProduct (){
    shopSteps.validLogin();
    shopSteps.clickOnShopButtonMainMenu();
    shopSteps.selectIndex3OfListProduct();
    shopSteps.clickOnBeanieWithLogoProduct();
    shopSteps.addToCartBeanieWithLogo();

}

}

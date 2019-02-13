package com.fast.steps.serenity;

import com.fast.pages.HomePage;
import com.fast.pages.LoginPage;
import com.fast.pages.MyAccountPage;
import com.fast.pages.ShopPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class ShopSteps extends ScenarioSteps {

    HomePage homePage;
    LoginPage loginPage;
    ShopPage shopPage;
    MyAccountPage myAccountPage;

@Step

    public void validLogin () {
    homePage.open();
    //homePage.clickMyAccountButton();
    //loginPage.setEmailField();
    //loginPage.setPasswordField();
    //loginPage.clickLoginButton();

    //myAccountPage.checkLoggedIn();
}
@Step
    public void selectBeltForProduct (){
    Assert.assertTrue(shopPage.selectBeltForProduct());
}

@Step
public void selectHoodieElseProduct (){
    shopPage.selectHoodieElseProduct();
}

    @Step
    public void clickOnShopButtonMainMenu (){
        shopPage.clickOnShopButtonMainMenu();
    }

    @Step
    public void selectCapElseIfProduct (){
    shopPage.selectCapElseIfProduct();
    }

    @Step
    public void selectIndex3OfListProduct (){
    shopPage.selectIndex3OfProduct();
    }

   @Step
   public void clickOnBeanieWithLogoProduct (){
    shopPage.clickOnBeanieWithLogoProduct();
   }

   @Step
   public void addToCartBeanieWithLogo (){
    shopPage.addToCartBeanieWithLogo();
   }


//    @StepGroup
//    public void selectBeltFromList (){
//    validLogin();
//    clickOnShopButtonMainMenu();
//    selectBeltForProduct();
//  }

   @StepGroup
    public void selectHoodieIfElseProduct (){
    validLogin();
    clickOnShopButtonMainMenu();
    selectHoodieElseProduct();
 }
 @StepGroup
    public void selectCapWithElseIfProduct (){
    validLogin();
    clickOnShopButtonMainMenu();
    selectCapElseIfProduct();

}
 @StepGroup
    public void selectIndex3OfProduct (){
    validLogin();
    clickOnShopButtonMainMenu();
    selectIndex3OfListProduct();
    clickOnBeanieWithLogoProduct();
    addToCartBeanieWithLogo();
 }


}
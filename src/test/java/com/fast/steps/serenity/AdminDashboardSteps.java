package com.fast.steps.serenity;

import com.fast.pages.AdminDashboardPage;
import com.fast.pages.HomePage;
import com.fast.pages.MyAccountAdminPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class AdminDashboardSteps extends ScenarioSteps {
    HomePage homePage;
    MyAccountAdminPage myAccountAdminPage;
    AdminDashboardPage adminDashboardPage;

    @Step
    public void validAdminLogin() {
        homePage.open();
        myAccountAdminPage.clickOnmyAccountButton();
        myAccountAdminPage.enterAdminUsername();
        myAccountAdminPage.enterAdminPassword();
        myAccountAdminPage.clickLogInButton();
    }

    @Step
    public boolean checkLoggedInAdmin() {
        Assert.assertTrue(myAccountAdminPage.checkLoggedInAdmin());
        return true;
    }

    @Step
    public void selectDashboardRootMenu() {
        adminDashboardPage.selectDashboardRootMenu();
    }

    @Step
    public void setClickAdminRootMenu() {
        adminDashboardPage.setClickAdminRootMenu();
    }

    @Step
    public void clickWooCommerceCateg() {
        adminDashboardPage.clickWooCommerceCateg();
    }

    @Step
    public void selectOrdersDropDown() {
        adminDashboardPage.selectOrdersDropDown();
    }

    @Step
    public void selectFirst5Orders() {
        adminDashboardPage.selectFirst5Orders();
    }


    @Step
    public void applyButton() {
        adminDashboardPage.applyButton();
    }

    @Step
    public boolean checkOnHoldStatusChangeMessage() {
        Assert.assertTrue(adminDashboardPage.checkStatusChangeMessage());
        return true;
    }

    @Step
    public void selectMainMenuCategories (){
        adminDashboardPage.selectMainMenuCategories();
    }

    @Step
    public void clickAddNewProductButton (){
        adminDashboardPage.clickAddNewProductButton();
    }

    @Step
    public void enterProductNameField (){
        adminDashboardPage.enterProductNameField();
    }

//    @Step
//    public void enterDescriptionField (){
//        adminDashboardPage.enterDescriptionField();
//    }
   @Step
    public void enterRegularPriceField (){
        adminDashboardPage.enterRegularPriceField();
   }
   @Step
    public void enterSalePriceField (){
        adminDashboardPage.enterSalePriceField();
   }
   @Step
    public void inventoryCategory (){
        adminDashboardPage.inventoryCategory();
   }
   @Step
   public void skuCode (){
        adminDashboardPage.skuCode();
   }

   @Step
    public void manageStockCheckBox (){
        adminDashboardPage.manageStockCheckBox();
   }

   @Step
    public void setStockNumber (){
        adminDashboardPage.setStockNumber();
   }

   @Step
    public void attributesCategory (){
        adminDashboardPage.attributesCategory();
   }

   @Step
    public void customProductAttributeDd (){
        adminDashboardPage.customProductAttributeDd();
   }

   @Step
    public void selectColorAttribute (){
        adminDashboardPage.selectColorAttribute();
   }

   @Step
   public void addAttributeProdButton (){
        adminDashboardPage.addAttributeProdButton();
   }
   @Step
    public void saveAtrributesButton (){
        adminDashboardPage.saveAtrributesButton();
   }
   @Step
    public void selectColorDd (){
        adminDashboardPage.selectColorDd();
   }
   @Step
    public void clickAccessoriesCategory (){
        adminDashboardPage.clickAccessoriesCategory();
   }
   @Step
    public void setClickPublishButton (){
        adminDashboardPage.setClickPublishButton();
   }
}

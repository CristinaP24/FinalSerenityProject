package com.fast.features;

import com.fast.steps.serenity.AdminDashboardSteps;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class AdminDashboardTests {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    AdminDashboardSteps adminDashboardSteps;

    @Test
    public void selectStatusOnHold() {
        adminDashboardSteps.validAdminLogin();
        adminDashboardSteps.checkLoggedInAdmin();
        adminDashboardSteps.selectDashboardRootMenu();
        adminDashboardSteps.setClickAdminRootMenu();
        adminDashboardSteps.clickWooCommerceCateg();
        adminDashboardSteps.selectFirst5Orders();
        adminDashboardSteps.selectOrdersDropDown();
        adminDashboardSteps.applyButton();
        //adminDashboardSteps.checkOnHoldStatusChangeMessage();
    }
    @Test
    public void createProduct(){
        adminDashboardSteps.validAdminLogin();
        adminDashboardSteps.checkLoggedInAdmin();
        adminDashboardSteps.selectDashboardRootMenu();
        adminDashboardSteps.setClickAdminRootMenu();
        adminDashboardSteps.selectMainMenuCategories();
        adminDashboardSteps.clickAddNewProductButton();
        adminDashboardSteps.enterProductNameField();
        adminDashboardSteps.enterRegularPriceField();
        adminDashboardSteps.enterSalePriceField();
        adminDashboardSteps.inventoryCategory();
        adminDashboardSteps.skuCode();
        adminDashboardSteps.manageStockCheckBox();
        adminDashboardSteps.setStockNumber();
        adminDashboardSteps.attributesCategory();
        adminDashboardSteps.customProductAttributeDd();
        adminDashboardSteps.selectColorAttribute();
        adminDashboardSteps.addAttributeProdButton();
        adminDashboardSteps.saveAtrributesButton();
        adminDashboardSteps.selectColorDd();
        adminDashboardSteps.clickAccessoriesCategory();
        adminDashboardSteps.enterProductNameField();
        adminDashboardSteps.setClickPublishButton();
    }
}


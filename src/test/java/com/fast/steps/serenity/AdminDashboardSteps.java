package com.fast.steps.serenity;

import com.fast.pages.AdminDashboardPage;
import com.fast.pages.HomePage;
import com.fast.pages.MyAccountAdminPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class AdminDashboardSteps extends ScenarioSteps {
    private HomePage homePage;
    private MyAccountAdminPage myAccountAdminPage;
    private AdminDashboardPage adminDashboardPage;

    @Step
    public void validAdminLogin() {
        getDriver().manage().window().maximize();
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
    public void applyButton() {
        adminDashboardPage.applyButton();
    }

    @Step
    public void checkOnHoldStatusChangeMessage() {
        Assert.assertTrue(adminDashboardPage.checkStatusChangeMessage());
    }


    @Step
    public void selectMainMenuCategories() {
        adminDashboardPage.selectMainMenuCategories();
    }

    @Step
    public void clickAddNewProductButton() {
        adminDashboardPage.clickAddNewProductButton();
    }

    @Step
    public void enterProductNameField() {
        adminDashboardPage.enterProductNameField();
    }


    @Step
    public void enterRegularPriceField() {
        adminDashboardPage.enterRegularPriceField();
    }

    @Step
    public void enterSalePriceField() {
        adminDashboardPage.enterSalePriceField();
    }

    @Step
    public void inventoryCategory() {
        adminDashboardPage.inventoryCategory();
    }

    @Step
    public void skuCode() {
        adminDashboardPage.skuCode();
    }

    @Step
    public void manageStockCheckBox() {
        adminDashboardPage.manageStockCheckBox();
    }

    @Step
    public void setStockNumber() {
        adminDashboardPage.setStockNumber();
    }

    @Step
    public void attributesCategory() {
        adminDashboardPage.attributesCategory();
    }

    @Step
    public void customProductAttributeDd() {
        adminDashboardPage.customProductAttributeDd();
    }

    @Step
    public void selectColorAttribute() {
        adminDashboardPage.selectColorAttribute();
    }

    @Step
    public void addAttributeProdButton() {
        adminDashboardPage.addAttributeProdButton();
    }

    @Step
    public void saveAtrributesButton() {
        adminDashboardPage.saveAtrributesButton();
    }

    @Step
    public void selectColorDd() {
        adminDashboardPage.selectColorDd();
    }

    @Step
    public void clickAccessoriesCategory() {
        adminDashboardPage.clickAccessoriesCategory();
    }

    @Step
    public void setClickPublishButton() {
        adminDashboardPage.setClickPublishButton();
    }

    @Step
    public void checkProductPublished() {
        Assert.assertTrue(adminDashboardPage.checkProductPublished());

    }

    @Step
    public void viewPublishedProduct() {
        adminDashboardPage.viewPublishedProduct();
    }


    @Step
    public void checkMainProductSku() {
        Assert.assertTrue(adminDashboardPage.checkMainProductSku());

    }

    @Step
    public void verifyProductExistenceWith3Details() {
        adminDashboardPage.verifyProductExistenceWith3Details();
    }

    @Step
    public void searchOrderField() {
        adminDashboardPage.searchOrderField();
    }

    @Step
    public void checkBoxTick() {
        adminDashboardPage.checkBoxTick();
    }
}

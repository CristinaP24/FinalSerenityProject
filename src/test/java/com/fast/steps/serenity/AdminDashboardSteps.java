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

}

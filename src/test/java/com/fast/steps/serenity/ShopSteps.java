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

    private HomePage homePage;
    private LoginPage loginPage;
    private ShopPage shopPage;
    private MyAccountPage myAccountPage;

    @Step
    public void validLogin() {
        getDriver().manage().window().maximize();
        homePage.open();
    }

    @Step
    public void selectBeltForProduct() {
        Assert.assertTrue(shopPage.selectBeltForProduct());
    }

    @Step
    public void selectHoodieElseProduct() {
        shopPage.selectHoodieElseProduct();
    }

    @Step
    public void clickOnShopButtonMainMenu() {
        shopPage.clickOnShopButtonMainMenu();
    }

    @Step
    public void selectCapElseIfProduct() {
        shopPage.selectCapElseIfProduct();
    }

    @Step
    public void clickOnBeanieWithLogoProduct() {
        shopPage.clickOnBeanieWithLogoProduct();
    }

    @Step
    public void shoppingCartIcon() {
        shopPage.shoppingCartIcon();
    }

    @Step
    public void addToCartButtonPageProduct() {
        shopPage.addToCartButtonPageProduct();
    }

    @Step
    public void checkProductAfterSearchBar() {
        Assert.assertTrue(shopPage.checkProductAfterSearchBar());
    }

}
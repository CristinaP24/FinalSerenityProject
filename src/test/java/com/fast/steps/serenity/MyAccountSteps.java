package com.fast.steps.serenity;

import com.fast.pages.HomePage;
import com.fast.pages.LoginPage;
import com.fast.pages.MyAccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class MyAccountSteps extends ScenarioSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;

    @Step
    public void navigateToHomepage() {
        getDriver().manage().window().maximize();
        homePage.open();
    }

    @Step
    public void goToLogin() {
        homePage.clickMyAccountButton();
    }

    @Step
    public void setUser() {
        myAccountPage.enterEmailMyAccountField();
    }

    @Step

    public void setPassword() {
        loginPage.setPasswordField();
    }

    @Step
    public void clickOnLoginButton() {
        loginPage.clickLoginButton();
    }

    @Step
    public void checkLoggedIn() {
        Assert.assertTrue(myAccountPage.checkLoggedIn());
    }

    @Step
    public void checkFirstNameFieldMyAccount() {
        Assert.assertTrue(myAccountPage.checkFirstNameFieldMyAccount());
    }

    @Step
    public void checkLastNameFieldMyAccount() {
        Assert.assertTrue(myAccountPage.checkLastNameFieldMyAccount());
    }

    @Step
    public void clickOnAccountDetailsButton() {
        myAccountPage.clickAccountDetailsButton();
    }


    @Step
    public void clickAccountDetails() {
        myAccountPage.checkValidEmailMyAccount();
    }

    @Step
    public void verifyFirstLastNameConditions() {
        myAccountPage.verifyFirstLastNameConditions();
    }

    @Step
    public void verifyNewPassWordFieldMyAccount() {
        myAccountPage.verifyNewPassWordFieldMyAccount();
    }


}
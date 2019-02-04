package com.fast.steps.serenity;

import com.fast.pages.HomePage;
import com.fast.pages.LoginPage;
import com.fast.pages.MyAccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class MyAccountSteps extends ScenarioSteps {

    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    @Step
    public void navigateToHomepage() {
        homePage.open();
    }

    @Step
    public void goToLogin() {
        homePage.clickMyAccountButton();
    }

//    @Step
//    public void clickPasswordMyAccountField() {
//        myAccountPage.clickPasswordMyAccountField();
//    }

    @Step
    public void setUser() {
        myAccountPage.enterEmailMyAccountField(); //de corectat
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
    public void clickOnAccountDetailsButton() {
        myAccountPage.clickAccountDetailsButton();
    }


    @Step
    public void clickAccountDetails() {
        myAccountPage.checkValidEmailMyAccount();
    }


    @Step
    public void checkPasswordMyAccount() {
        Assert.assertTrue(myAccountPage.checkPasswordMyAccountField());
    }

    @StepGroup
    public void validMyAccountCheck() {
        navigateToHomepage();
        goToLogin();
        setUser();
        checkPasswordMyAccount();
        //clickPasswordMyAccountField();
        clickOnLoginButton();
        checkLoggedIn();
        clickOnAccountDetailsButton();
        clickAccountDetails();
    }

    @StepGroup
    public void validMyAccountPasswordCheck() {
        navigateToHomepage();
        goToLogin();
        setUser();
        checkPasswordMyAccount();
        //clickPasswordMyAccountField();
        clickOnLoginButton();
        checkLoggedIn();
        clickOnAccountDetailsButton();
        clickAccountDetails();
        checkPasswordMyAccount();
    }

}
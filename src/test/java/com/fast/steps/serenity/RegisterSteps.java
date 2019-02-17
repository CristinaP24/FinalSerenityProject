package com.fast.steps.serenity;

import com.fast.pages.HomePage;
import com.fast.pages.MyAccountPage;
import com.fast.pages.RegisterPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;

public class RegisterSteps extends ScenarioSteps {
    HomePage homePage;
    RegisterPage registerPage;
    MyAccountPage myAccountPage;

    private String userName = RandomStringUtils.randomAlphanumeric(10);
    private String email = userName + "@email.com";

    @Step
    public void navigateToHomepage() {
        getDriver().manage().window().maximize();
        homePage.open();
    }

    @Step
    public void clickMyAccountButton() {
        homePage.clickMyAccountButton();
    }

    @Step

    public void enterRegisterEmailStr() {
        registerPage.enterRegisterEmailStr(email);
    }

    @Step
    public void enterRegisterPassword() {
        registerPage.enterRegisterPassword();
    }

    @Step
    public void registerButton() {
        registerPage.registerButton();
    }

    @Step
    public void checkRegistration() {
        Assert.assertTrue(myAccountPage.checkRegister(userName));
    }

}

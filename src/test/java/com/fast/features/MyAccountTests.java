package com.fast.features;

import com.fast.pages.HomePage;
import com.fast.pages.MyAccountPage;
import com.fast.steps.serenity.LoginSteps;
import com.fast.steps.serenity.MyAccountSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class MyAccountTests {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    MyAccountSteps myAccountSteps;


    @Test
    public void validMyAccountCheck() {
        myAccountSteps.navigateToHomepage();
        myAccountSteps.goToLogin();
        myAccountSteps.setUser();
        myAccountSteps.setPassword();
        myAccountSteps.clickOnLoginButton();
        myAccountSteps.checkLoggedIn();
        myAccountSteps.clickOnAccountDetailsButton();

    }

    @Test
    public void validMyAccountPasswordCheck() {
        myAccountSteps.navigateToHomepage();
        myAccountSteps.goToLogin();
        myAccountSteps.setUser();
        myAccountSteps.setPassword();
        myAccountSteps.clickOnLoginButton();
        myAccountSteps.checkLoggedIn();
        myAccountSteps.clickOnAccountDetailsButton();
//        myAccountSteps.checkFirstNameFieldMyAccount();
       // myAccountSteps.checkLastNameFieldMyAccount();
        myAccountSteps.verifyFirstLastNameConditions();
        myAccountSteps.verifyNewPassWordFieldMyAccount();
    }

}

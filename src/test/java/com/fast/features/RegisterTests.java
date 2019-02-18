package com.fast.features;

import com.fast.steps.serenity.RegisterSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class RegisterTests {
    @Managed(uniqueSession = true)
    private WebDriver driver;
    @Steps

    RegisterSteps registerSteps;

    @Test
    public void checkRegisterRandomString() {
        registerSteps.navigateToHomepage();
        registerSteps.clickMyAccountButton();
        registerSteps.enterRegisterEmailStr();
        registerSteps.enterRegisterPassword();
        registerSteps.registerButton();
        registerSteps.checkRegistration();
    }


}

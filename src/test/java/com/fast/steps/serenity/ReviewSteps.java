package com.fast.steps.serenity;

import com.fast.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class ReviewSteps extends ScenarioSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private MyAccountPage myAccountPage;
    private ReviewPage reviewPage;

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
    public void clickPasswordMyAccountField() {
        myAccountPage.checkPasswordMyAccountField();
    }

    @Step
    public void setUser() {
        loginPage.setEmailField();
    }

    @Step

    public void setPassword() {
        loginPage.setPasswordField();
    }

    @Step
    public void clickLoginButton() {
        reviewPage.clickLoginButton();
    }

    @Step
    public void clickOnShopButton() {
        reviewPage.clickOnShopButton();
    }

    @Step

    public void viewBeltProduct() {
        reviewPage.viewBeltProduct();
    }

    @Step
    public void clickReviewButton() {
        reviewPage.clickReviewButton();
    }

    @Step
    public void clickStar3RatingProduct() {
        reviewPage.clickStar3RatingProduct();
    }

    @Step
    public void addValidReview() {
        reviewPage.addValidReview();
    }

    @Step
    public void clickSubmitReviewButton() {
        reviewPage.clickSubmitButtonReview();
    }

    @Step
    public void clickStar2RatingProduct() {
        reviewPage.clickStar2RatingProduct();
    }

    @Step
    public void viewCapProduct() {
        reviewPage.viewCapProduct();
    }

    @Step
    public void clickSubmitButtonReview() {
        reviewPage.clickSubmitButtonReview();
    }

    @Step
    public void ifCheckSpaceReview() {
        reviewPage.ifCheckSpaceReview();
    }


}

package com.fast.features;

import com.fast.steps.serenity.ReviewSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ReviewTests  {
    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    ReviewSteps reviewSteps;

    @Test
    public void validReview (){
        reviewSteps.navigateToHomepage();
        reviewSteps.goToLogin();
        reviewSteps.setUser();
        reviewSteps.setPassword();
        reviewSteps.clickPasswordMyAccountField();
        reviewSteps.clickLoginButton();
        reviewSteps.clickOnShopButton();
        reviewSteps.viewBeltProduct();
        reviewSteps.clickReviewButton();
        reviewSteps.clickStar3RatingProduct();
        reviewSteps.addValidReview();
        reviewSteps.clickSubmitReviewButton();
    }
    @Test
    public void invalidSpaceReview (){
        reviewSteps.navigateToHomepage();
        reviewSteps.goToLogin();
        reviewSteps.clickPasswordMyAccountField();
        reviewSteps.setUser();
        reviewSteps.setPassword();
        reviewSteps.clickLoginButton();
        reviewSteps.clickOnShopButton();
        reviewSteps.viewCapProduct();
        reviewSteps.clickReviewButton();
        reviewSteps.clickStar2RatingProduct();
        reviewSteps.ifCheckSpaceReview();
        reviewSteps.clickSubmitReviewButton();

    }
}

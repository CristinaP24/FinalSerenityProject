package com.fast.steps.serenity;

import com.fast.pages.BlogPostPage;
import com.fast.pages.HomePage;
import com.fast.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class BlogPostSteps extends ScenarioSteps {

   private HomePage homePage;
   private LoginPage loginPage;
   private BlogPostPage blogPostPage;

    @Step
    public void validLogin() {
        getDriver().manage().window().maximize();
        homePage.open();
        homePage.clickMyAccountButton();
        loginPage.setEmailField();
        loginPage.setPasswordField();
        loginPage.clickLoginButton();
    }

    @Step
    public void clickBlogButton() {
        blogPostPage.clickOnBlogButton();
    }


    @Step
    public void clickPostBlogCommentButton() {
        blogPostPage.clickPostBlogCommentButton();
    }

    @Step
    public void logutAtWordinComment() {
        blogPostPage.logutAtRandomString();
    }


    @Step
    public void commentBlogFieldRandomText() {
        blogPostPage.commentBlogFieldRandomText();
    }

}

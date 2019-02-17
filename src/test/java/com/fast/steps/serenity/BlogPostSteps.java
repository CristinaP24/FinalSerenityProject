package com.fast.steps.serenity;

import com.fast.pages.BlogPostPage;
import com.fast.pages.HomePage;
import com.fast.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class BlogPostSteps extends ScenarioSteps {

    HomePage homePage;
    LoginPage loginPage;
    BlogPostPage blogPostPage;

    @Step
    public void validLogin() {
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
    public void typeCommentBlogField() {
        blogPostPage.typeCommentBlogField();
    }

    @Step
    public void clickPostBlogCommentButton() {
        blogPostPage.clickPostBlogCommentButton();
    }

    @Step
    public void confirmLoginBlogMessage() {
        Assert.assertTrue(blogPostPage.confirmLoginBlogMessage());
    }

    @Step
    public void logutAtWordinComment() {
        blogPostPage.logutAtWordinComment();
    }

    @Step
    public void typeCommentBlogFieldPups() {
        blogPostPage.typeCommentBlogFieldPups();
    }

    @Step
    public void typeCommentBlogFieldpups() {
        blogPostPage.typeCommentBlogFieldpups();
    }

    @StepGroup
    public void logoutAtWordInComment() {
        validLogin();
        clickBlogButton();
        typeCommentBlogField();
        clickPostBlogCommentButton();
        confirmLoginBlogMessage();
        logutAtWordinComment();
    }

    @StepGroup
    public void logoutAtWordInComment_pups() {
        validLogin();
        clickBlogButton();
        typeCommentBlogFieldpups();
        clickPostBlogCommentButton();
        confirmLoginBlogMessage();
        logutAtWordinComment();
    }


}

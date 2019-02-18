package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.PageObject;
import org.apache.commons.lang3.RandomStringUtils;

@DefaultUrl("http://qa3.fasttrackit.org:8008")

public class BlogPostPage extends PageObject {

    HomePage homePage;
    @FindBy(css = "a[href*='blog']")
    private WebElementFacade blogButton;

    @FindBy(css = "textarea[id*='comment']")
    private WebElementFacade commentBlogField;

    @FindBy(css = "input[id*='author']")
    private WebElementFacade nameBlogField;

    @FindBy(css = "input[id*='email']")
    private WebElementFacade emailBlogField;

    @FindBy(css = "input[value*='Post Comment']")
    private WebElementFacade postBlogCommentButton;

    @FindBy(css = "span[id*='email-notes']")
    private WebElementFacade confirmBlogCommentMessage;

    @FindBy(css = "body[id*='error-page']")
    private WebElementFacade timeOutBlogCommentMessage;

    @FindBy(css = "#error-page a[href*='back']")
    private WebElementFacade backBlogButton;

    @FindBy(css = "a[href*='wp-admin/profile']")
    private WebElementFacade confirmLoginBlogMessage;

    @FindBy(css = "a[href*='logout&redirect']")
    private WebElementFacade logoutRedirectLink;

    @FindBy(css = "body#error-page")
    private WebElementFacade duplicatePostErrorMessage;

    public void clickOnBlogButton() {
        clickOn(blogButton);
    }

    public void clickPostBlogCommentButton() {
        clickOn(postBlogCommentButton);
        waitABit(3000);
    }


    public boolean timeOutBlogCommentMessage() {
        waitFor(timeOutBlogCommentMessage);
        return timeOutBlogCommentMessage.containsText("You are posting comments too quickly. Slow down.");
    }

    public boolean duplicatePostErrorMessage() {
        waitFor(duplicatePostErrorMessage);
        return duplicatePostErrorMessage.containsText("Duplicate comment detected; it looks as though you’ve already said that!");
    }


    public boolean logutAtRandomString() {

        if (commentBlogFieldRandomText.equals(commentBlogFieldRandomText)){
            clickOn(logoutRedirectLink);
        System.out.println("string IF");
        return true;
        }
        return false;
    }

    private String commentBlogFieldRandomText = RandomStringUtils.randomAlphabetic(250);

    public void commentBlogFieldRandomText() {
        typeInto(commentBlogField, commentBlogFieldRandomText);

    }

}

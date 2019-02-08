package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa3.fasttrackit.org:8008")

public class BlogPostPage extends PageObject {
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

    @FindBy(css = "a[href*='back']")
    private WebElementFacade backBlogButton;

    @FindBy (css = "a[href*='wp-admin/profile']")
    private WebElementFacade confirmLoginBlogMessage;

    @FindBy(css = "a[href*='logout&redirect']")
    private WebElementFacade logoutRedirectLink;


    public void clickOnBlogButton() {
        clickOn(blogButton);
    }

    public void typeCommentBlogField() {
        typeInto(commentBlogField, "Puppie, puppie, puppie is forever!");
    }

    public void typeCommentBlogFieldPups (){typeInto(commentBlogField, "Pups, just nice Pups.");}

    public void typeCommentBlogFieldpups (){typeInto(commentBlogField, "pups are my favourite pets");}

    public void typeNameBlogField() {
        typeInto(nameBlogField, "Whaterver Name It Is");
    }

    public void typeEmailBlogField() {
        typeInto(emailBlogField, "puppie_lover@yahoo.com");
    }

    public void clickPostBlogCommentButton() {
        clickOn(postBlogCommentButton);
    }

    public boolean confirmBlogCommentMessage() {
        waitFor(confirmBlogCommentMessage);
        return confirmBlogCommentMessage.containsText("Your email address will not be published. Required fields are marked *");
    }

    public boolean confirmLoginBlogMessage() {
        waitFor(confirmLoginBlogMessage);
        return confirmLoginBlogMessage.containsText("Logged in as hermioneg");
    }


    public boolean timeOutBlogCommentMessage() {
        waitFor(timeOutBlogCommentMessage);
        return timeOutBlogCommentMessage.containsText("You are posting comments too quickly. Slow down.");
    }

    public void clickBackBlogButton() {
        clickOn(backBlogButton);
    }

    public void logutAtWordinComment() {

        if (commentBlogField.getText().contains("Puppie"))
            clickOn(logoutRedirectLink);
        else if (commentBlogField.getText().contains("puppie")) {
            clickOn(logoutRedirectLink);
        } else if (commentBlogField.getText().contains("Pups")) {
            clickOn(logoutRedirectLink);
        } else if (commentBlogField.getText().contains("pups")) {
            clickOn(logoutRedirectLink);


        }
    }
}
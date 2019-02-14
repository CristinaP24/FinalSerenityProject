package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://qa3.fasttrackit.org:8008")
public class ReviewPage extends PageObject {

    @FindBy(css = "[name*='username']")
    private WebElementFacade emailField;

    @FindBy(css = "[id^='password']")
    private WebElementFacade passwordField;

    @FindBy(css = "[name^='login']")
    private WebElementFacade loginButton;

    @FindBy(css = "a[href*='shop']")
    private WebElementFacade shopButton;

    @FindBy(css = "a[href*='belt']")
    private WebElementFacade viewBeltProduct;

    @FindBy(css = "a[href*='product/cap']")
    private WebElementFacade viewCapProduct;

    @FindBy(css = "a[href*='#tab-reviews']")
    private WebElementFacade clickReviewButton;

    @FindBy(css = "a[class*='star-3']")
    private WebElementFacade star2RatingProduct;

    @FindBy(css = "a[class*='star-3']")
    private WebElementFacade star3RatingProduct;


    @FindBy(css = "textarea[id*='comment']")
    private WebElementFacade clickTextBoxReview;

    @FindBy(css = "input[value*='Submit']")
    private WebElementFacade clickSubmitButtonReview;

    @FindBy(css = "a[href*='history.back']")
    private WebElementFacade backButtonInvalidReview;

    @FindBy(css = "#error-page p strong")
    private WebElementFacade errorMessageReviewStrong;

    public void setEmailField() {
        waitFor(emailField);
        typeInto(emailField, "hermioneg@gmail.com");
    }

    public void setPasswordField() {
        typeInto(passwordField, "notamuggle77");
    }

    public void clickLoginButton() {
        clickOn(loginButton);
    }

    public void clickOnShopButton() {
        clickOn(shopButton);
    }

    public void viewBeltProduct() {
        clickOn(viewBeltProduct);
    }

    public void viewCapProduct() {
        clickOn(viewCapProduct);
    }

    public void clickStar3RatingProduct() {
        clickOn(star3RatingProduct);
    }

    public void clickStar2RatingProduct() {
        clickOn(star2RatingProduct);
    }

    public void clickReviewButton() {
        clickOn(clickReviewButton);
    }

    public boolean errorMessageReviewStrong() {
        waitFor(errorMessageReviewStrong);
        return errorMessageReviewStrong.containsText("ERROR");
    }

    public void addValidReview() {
        clickOn(clickTextBoxReview);
        typeInto(clickTextBoxReview, "This review will matter as much as what you ate for breakfast two days ago.");
    }


    public void addSpaceReview() {
        clickOn(clickTextBoxReview);
        typeInto(clickTextBoxReview, "  ");
    }


    public void clickSubmitButtonReview() {
        clickOn(clickSubmitButtonReview);
    }

    public void backButtonInvalidReview() {
        clickOn(backButtonInvalidReview);
    }


    public boolean ifCheckSpaceReview() {

        if (errorMessageReviewStrong()) { //de corectat
            backButtonInvalidReview();
        }
        return true;
    }


}

package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;

@DefaultUrl("http://qa3.fasttrackit.org:8008")
public class SearchBarPage extends PageObject {

    @FindBy(css = ".site-top-bar-right i")
    private WebElementFacade searchBarIcon;

    @FindBy(css = "input[type='search']")
    private WebElementFacade enterInSearchBarField;

    @FindBy(css = ".search-submit")
    private WebElementFacade clickSearchBarButton;

    @FindBy(css = "#main div p")
    private WebElementFacade errorMessageSearchBar;

    @FindBy(id = "#primary h1")
    private WebElementFacade searchResultsFoundMessage;

    @FindBy (css = "button no-results-btn search-btn")
    private WebElementFacade searchAgainButton;

    private String searchTermLength = RandomStringUtils.randomAlphabetic(30);

    private ArrayList<String> listSearchTerms = new ArrayList<>();


    public void clickSearchBarIcon() {
        clickOn(searchBarIcon);
    }

    public void enterBeanieProductSearchBarField() {
        typeInto(enterInSearchBarField, "Beanie");
    }

    public void clickSearchBarButton() {
        clickOn(clickSearchBarButton);
    }

    public void enterSearchTermLength(String searchTermLength) {
        typeInto(enterInSearchBarField, searchTermLength);
    }

    public boolean checkMessageSearchBar() {
        waitFor(errorMessageSearchBar);
        return errorMessageSearchBar.containsText("Sorry, but nothing matched your search terms. Please try again with some different keywords.");
    }

    public void selectProductValidInvalid() {
        listSearchTerms.add("Beanie");
        listSearchTerms.add("Whateveaa");
        listSearchTerms.add("Hoodie");
        listSearchTerms.add("ABCDEFGHIJK");
        listSearchTerms.add("Octopus");
        listSearchTerms.add("123456789");
        listSearchTerms.add("@#$%^&&*");

          String listA = listSearchTerms.get(5);
                typeInto(enterInSearchBarField, listA);
    }
    public void clickSearchAgainButton (){
        waitFor(searchAgainButton);
        clickOn(searchAgainButton);
    }
}



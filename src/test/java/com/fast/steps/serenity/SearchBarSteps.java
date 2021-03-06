package com.fast.steps.serenity;

import com.fast.pages.HomePage;
import com.fast.pages.SearchBarPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;

public class SearchBarSteps extends ScenarioSteps {
    private HomePage homePage;
    private SearchBarPage searchBarPage;

    private String searchTermLength = RandomStringUtils.randomAlphabetic(30);

    @Step
    public void navigateToHomePage() {
        getDriver().manage().window().maximize();
        homePage.open();
    }

    @Step
    public void clickSearchBarIcon() {
        searchBarPage.clickSearchBarIcon();
    }

    @Step
    public void enterBeanieProductSearchBarField() {
        searchBarPage.enterBeanieProductSearchBarField();
    }

    @Step
    public void clickSearchBarButton() {
        searchBarPage.clickSearchBarButton();
    }

    @Step
    public void enterSearchTermLength() {
        searchBarPage.enterSearchTermLength(searchTermLength);
    }

    @Step
    public void checkMessageSearchBar() {
        Assert.assertTrue(searchBarPage.checkMessageSearchBar());
    }

    @Step
    public void selectProductValidInvalid() {
        searchBarPage.selectProductValidInvalid();
    }

    @Step
    public void enterValidTermSearchBar() {
        searchBarPage.enterValidTermSearchBar();
    }

}

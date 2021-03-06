package com.fast.features;

import com.fast.steps.serenity.CartSteps;
import com.fast.steps.serenity.SearchBarSteps;
import com.fast.steps.serenity.ShopSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class SearchBarTests {
    @Managed(uniqueSession = true)
    private WebDriver driver;
    @Steps
    private SearchBarSteps searchBarSteps;
    @Steps
    private ShopSteps shopSteps;
    @Steps
    private CartSteps cartSteps;

    @Test
    public void enterBeanieProductSearchBarField() {
        searchBarSteps.navigateToHomePage();
        searchBarSteps.clickSearchBarIcon();
        searchBarSteps.enterBeanieProductSearchBarField();
        searchBarSteps.clickSearchBarButton();
        shopSteps.clickOnBeanieWithLogoProduct();
        cartSteps.clickAddToCartButton();
        cartSteps.addProductCartConfirmMessage();
        cartSteps.clickAddToCartButton();
        cartSteps.viewShoppingCartButton();
        cartSteps.removeProductFromCart();
    }

    @Test
    public void enterSearchTermLength() {
        searchBarSteps.navigateToHomePage();
        searchBarSteps.clickSearchBarIcon();
        searchBarSteps.enterSearchTermLength();
        searchBarSteps.clickSearchBarButton();
        searchBarSteps.checkMessageSearchBar();
        searchBarSteps.enterValidTermSearchBar();

    }

    @Test
    public void selectProductValidInvalid() {
        searchBarSteps.navigateToHomePage();
        searchBarSteps.clickSearchBarIcon();
        searchBarSteps.selectProductValidInvalid();
        searchBarSteps.clickSearchBarButton();
    }

}

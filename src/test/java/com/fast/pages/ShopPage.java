package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


import java.util.List;


@DefaultUrl("http://qa3.fasttrackit.org:8008/shop")

public class ShopPage extends PageObject {

    @FindBy(css = "li a[href*='shop']")
    private WebElementFacade clickOnShopButtonMainMenu;

    @FindBy(css = "post-48 product type-product status-publish has-post-thumbnail product_cat-accessories-clothing  instock sale shipping-taxable purchasable product-type-simple")
    private WebElementFacade viewtBeanieProduct;

    @FindBy(css = "a[href*='cap']")
    private WebElementFacade viewCapProduct;

    @FindBy(css = "img[srcset*='album']")
    private WebElementFacade viewAlbumProduct;

    @FindBy(css = " .entry-title a[href*='beanie-with-logo']")
    private WebElementFacade viewBeanieWithLogoProduct;

    @FindBy(css = "a[href*='belt']")
    private WebElementFacade viewBeltProduct;

    @FindBy(css = "a[href*='hoodie-with-logo']")
    private WebElementFacade view_hoodieWithLogoProduct;

    @FindBy(css = "a[href*='hoodie-with-zipper']")
    private WebElementFacade view_hoodieWithZipperProduct;

    @FindBy(css = "button[name*='add-to-cart']")
    private WebElementFacade addToCartButtonSingleProduct;

    @FindBy(css = "#search-2 input[title*='Search for']")
    private WebElementFacade searchBarLateral;

    @FindBy(css = "a[title*='View your shopping cart']")
    private WebElementFacade shoppingcartIcon;

    @FindBy(css = ".single_add_to_cart_button")
    private WebElementFacade addToCartButtonPageProduct;

    @FindBy(css = "div main nav ul li:first-child")
    private WebElementFacade clickOn1stPageButton;

    @FindBy(css = "li[id*='menu-item-1642']")
    private WebElementFacade homePageButton;

    @FindBy(css = ".page-title")
    private WebElementFacade checkProductAfterSearchBar;


    @FindBy(css = " .woocommerce-loop-product__title")
    List<WebElementFacade> listProductsPage1;

    public void clickOnShopButtonMainMenu() {
        clickOn(clickOnShopButtonMainMenu);
    }

    public boolean selectBeltForProduct() {
        for (WebElementFacade product : listProductsPage1) {
            if (product.getText().contains("Belt")) {
                clickOn(product);
                return true;
            }
        }
        return false;
    }

    public boolean selectHoodieElseProduct() {
        for (WebElementFacade product : listProductsPage1) {

            if (product.getText().contains("Octopus is not here")) {
                clickOn(product);
                return true;

            } else if (product.getText().contains("Hoodie with Zipper")) {
                clickOn(product);
                return true;
            }
        }
        return false;
    }

    public boolean selectCapElseIfProduct() {
        for (WebElementFacade product : listProductsPage1) {
            if (product.getText().contains("Fork is not on the page.")) {
                clickOn(product);
                return true;
            } else if (product.getText().contains("Neither is knife.")) {
                clickOn(product);
                return true;
            } else {
                searchBarLateral.typeAndEnter("Cap");
                return true;
            }
        }
        return false;
    }

    public void shoppingCartIcon() {
        clickOn(shoppingcartIcon);
    }

    public void clickOnBeanieWithLogoProduct() {
        waitABit(3000);
        clickOn(viewBeanieWithLogoProduct);
    }

    public void clickOnHoodieWithZipperProduct() {
        clickOn(view_hoodieWithZipperProduct);
    }

    public void addToCartBeanieWithLogo() {
        clickOn(addToCartButtonSingleProduct);
    }

    public void addToCartButtonPageProduct() {
        waitFor(20);
        clickOn(addToCartButtonPageProduct);
    }

    public boolean checkProductAfterSearchBar() {
        waitFor(checkProductAfterSearchBar);
        return checkProductAfterSearchBar.containsText("Search Results for:");
    }

}
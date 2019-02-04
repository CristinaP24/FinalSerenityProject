package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa3.fasttrackit.org:8008/")
public class CartPage extends PageObject {

    @FindBy (css = "a[href*='shop']")
    private WebElementFacade shopButton;

    @FindBy (css = "a[href*='add-to-cart=48']")
    private WebElementFacade addToCartBeanieProduct;

    @FindBy (css = "[title*='View your shopping cart']")
    private WebElementFacade viewShoppingCartButton;

    @FindBy (css ="a[href*='cap']")
    private WebElementFacade viewCapProduct;

    @FindBy (css = "[title*='Qty']")
    private WebElementFacade clickQtyBox;

    @FindBy (css = "[name*='add-to-cart']")
    private WebElementFacade addToCartButton;

    @FindBy (css = " button wc-forward")
    private WebElementFacade viewCartButton;


    public void clickOnShopButton (){ clickOn(shopButton); }

    public void addBeanieToCartProduct (){clickOn(addToCartBeanieProduct);}

    public void viewShoppingCartButton (){clickOn(viewShoppingCartButton);}

    public void viewCapProduct (){clickOn(viewCapProduct);}

    public void clickQtyBox (){clickOn(clickQtyBox);}

    public void addToCartButton_10000 ()
    {clickOn(clickQtyBox);
    typeInto(clickQtyBox, "-10000");}

    public void clickAddtoCartButton () {clickOn(addToCartButton);}
}

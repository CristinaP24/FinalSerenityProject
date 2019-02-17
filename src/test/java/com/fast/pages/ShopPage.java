package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


import java.util.List;

//import static jdk.nashorn.internal.objects.NativeJava.type;

@DefaultUrl("http://qa3.fasttrackit.org:8008/shop")

public class ShopPage extends PageObject {

    @FindBy(css = "li a[href*='shop']")
    private WebElementFacade clickOnShopButtonMainMenu;

    @FindBy(css = "post-48 product type-product status-publish has-post-thumbnail product_cat-accessories-clothing  instock sale shipping-taxable purchasable product-type-simple")
    private WebElementFacade viewtBeanieProduct;

    @FindBy(css = "post-1990 product type-product status-publish product_cat-uncategorized  instock shipping-taxable product-type-simple")
    private WebElementFacade readMore_AtmBWycWProduct;

    @FindBy(css = "a[href*='cap']")
    private WebElementFacade viewCapProduct;

    @FindBy(css = "img[srcset*='album']")
    private WebElementFacade viewAlbumProduct;

    @FindBy(css = ".entry-title a[href*='beanie-with-logo']")
    private WebElementFacade viewBeanieWithLogoProduct;

    @FindBy(css = "a[href*='belt']")
    private WebElementFacade viewBeltProduct;

    @FindBy(className = "post-2156 product type-product status-publish product_cat-uncategorized  instock sale shipping-taxable purchasable product-type-simple")
    private WebElementFacade view_bzZDKvQo_Product7;

    @FindBy(css = "a[href*='bzzdkvqo-2']")
    private WebElementFacade view_bzZDKvQo_Product78;

    @FindBy(css = "post-2051 product type-product status-publish product_cat-uncategorized first instock sale shipping-taxable purchasable product-type-simple")
    private WebElementFacade view_dYhklAZh_Product;

    @FindBy(css = "dYhklAZh")
    private WebElementFacade view_EMTxZNTx_Product;

    @FindBy(css = "a[href*='gamaiehg']")
    private WebElementFacade view_gamiehg_Product;

    @FindBy(css = "a[href*='hghjg'] h2")
    private WebElementFacade readMore_hghjg_Product;

    @FindBy(css = "img[srcset*='hoodie-2']")
    private WebElementFacade selectOptions_Hoodie;

    @FindBy(css = "a[href*='hoodie-with-logo']")
    private WebElementFacade view_hoodieWithLogoProduct;

    @FindBy(css = "a[href*='hoodie-with-zipper']")
    private WebElementFacade view_hoodieWithZipperProduct;

    @FindBy(css = "a[href*='huwaxbto']")
    private WebElementFacade view_huwaxbto_Product;

    @FindBy(css = "button[name*='add-to-cart']")
    private WebElementFacade addToCartButtonSingleProduct;

    @FindBy(css = "#search-2 input[title*='Search for']")
    private WebElementFacade searchBarLateral;

    @FindBy (css = "a[title*='View your shopping cart']")
    private WebElementFacade shoppingcartIcon;

    @FindBy (css = ".single_add_to_cart_button")
    private WebElementFacade addToCartButtonPageProduct;


    @FindBy (css = "div main nav ul li:first-child")
    private WebElementFacade clickOn1stPageButton;

    @FindBy (css = "li[id*='menu-item-1642']")
    private WebElementFacade homePageButton;


    @FindBy(css = " .woocommerce-loop-product__title")
            //@FindBy (css = " .products columns-4")
            //@FindBy (css = "#main")
    //@FindBy (css = " .products")
            List<WebElementFacade> listProductsPage1;

    public void clickOnShopButtonMainMenu() {
        clickOn(clickOnShopButtonMainMenu);
    }

    public boolean selectBeltForProduct() {
        for (WebElementFacade product : listProductsPage1) {
            if (product.getText().contains("Belt")) {
                //product.findElement(By.cssSelector("img")).click();
                clickOn(product);
                System.out.println("belt");
                return true;
            }
        }
        return false;
    }

    public boolean selectHoodieElseProduct() {
        for (WebElementFacade product : listProductsPage1) {
            if (product.getText().contains("Belt")) {
                clickOn(product);
                return true;

            } else if (product.getText().contains("Hoodie With Zipper")) {
                System.out.println("prints else if"); //de vazut aici
                //clickOn(clickOn1stPageButton);
                clickOn(product);
                return true;
            } else {
                System.out.println("prints the else");
                clickOn(homePageButton);
            }
            return true;
        }
        return false;
    }

    public boolean selectCapElseIfProduct() {
        for (WebElementFacade product : listProductsPage1) {
            if (product.getText().contains("Fork is not on this page.")) {
                clickOn(product);
                return true;
            } else if (product.getText().contains("Neither is knife.")) {
                clickOn(product);
                return true;

            } else {
                typeInto(searchBarLateral, "Cap");
                return true;
            }
        }
        return false;
    }
    public void shoppingCartIcon ()
    {clickOn(shoppingcartIcon);}


    public void clickOnBeanieWithLogoProduct() {
        waitABit(3000);
        clickOn(viewBeanieWithLogoProduct);
    }
    public void clickOnHoodieWithZipperProduct (){
        clickOn(view_hoodieWithZipperProduct);
    }

    public void addToCartBeanieWithLogo() {
        clickOn(addToCartButtonSingleProduct);
    }

    public void addToCartButtonPageProduct (){
        waitFor(20);
        clickOn(addToCartButtonPageProduct);}

        public void clickOn1stPageButton (){
        waitABit(4000);
        clickOn(clickOn1stPageButton);
        }
}
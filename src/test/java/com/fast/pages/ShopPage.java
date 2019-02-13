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

    @FindBy(css = "a[href*='beanie-with-logo']")
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

    @FindBy(css = "aside form")
    private WebElementFacade searchBarLateral;

    @FindBy(css = ".product")
    List<WebElementFacade> listProductsPage1;

    public void clickOnShopButtonMainMenu() {
        clickOn(clickOnShopButtonMainMenu);
    }

    public boolean selectBeltForProduct() {
        for (WebElementFacade product : listProductsPage1) {
            if (product.getText().contains("Belt")){
                product.findElement(By.cssSelector("img")).click();
            return true;
        }
    }
    return false;
}

    public boolean selectHoodieElseProduct() {
        for (WebElementFacade product : listProductsPage1) {
            if (product.getText().contains("Octopus is not on this page."))
                clickOn(product);

            else {
                product.getText().contains("Zipper");
                System.out.println("y work?");
                clickOn(product);
            }
            return true;
        }
        return false;
    }

    public void selectCapElseIfProduct() {
        for (WebElementFacade product : listProductsPage1) {
            if (product.getText().contains("Fork is not on this page."))
                clickOn(product);
            else if (product.getText().contains("Neither is knife.")) {
                clickOn(product);
//            } else {
//                clickOn(searchBarLateral);
//                typeInto(searchBarLateral, "Cap"); //adaugat buton pt enter dupa inserare produs
//            }

        } else {
            clickOn(searchBarLateral);
                searchBarLateral.typeAndEnter("Cap"); //adaugat buton pt enter dupa inserare produs
        }

        }
    }


        public void selectIndex3OfProduct () {//de sters
        listProductsPage1.add(viewAlbumProduct);
        listProductsPage1.add(readMore_AtmBWycWProduct);
        listProductsPage1.add(viewtBeanieProduct);
        listProductsPage1.add(viewBeanieWithLogoProduct);
        listProductsPage1.add(viewBeltProduct);
        listProductsPage1.add(view_bzZDKvQo_Product7);
        listProductsPage1.add(view_bzZDKvQo_Product78);
        listProductsPage1.add(viewCapProduct);
        listProductsPage1.add(view_dYhklAZh_Product);
        listProductsPage1.add(view_EMTxZNTx_Product);
        listProductsPage1.add(view_gamiehg_Product);
        listProductsPage1.add(readMore_hghjg_Product);
        listProductsPage1.add(selectOptions_Hoodie);
        listProductsPage1.add(view_hoodieWithLogoProduct);
        listProductsPage1.add(view_hoodieWithZipperProduct);
        listProductsPage1.add(view_huwaxbto_Product);
        listProductsPage1.get(3);

            }

            public void clickOnBeanieWithLogoProduct () {
                clickOn(viewBeanieWithLogoProduct);
            }

            public void addToCartBeanieWithLogo () {
                clickOn(addToCartButtonSingleProduct);
            }

        }
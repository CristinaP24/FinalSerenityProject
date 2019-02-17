package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://qa3.fasttrackit.org:8008")
public class CartPage extends PageObject {

    @FindBy (css = "a[href*='shop']")
    private WebElementFacade shopButton;

    @FindBy (className = "wc-proceed-to-checkout")
    private WebElementFacade proceedToCheckoutButton;

    @FindBy (css = "button[name*='update_cart']")
    private WebElementFacade updateCartButton;

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

    @FindBy (css = "button wc-forward")
    private WebElementFacade viewCartButton;


    @FindBy (css = ".product-price .amount")
    private WebElementFacade productPriceShown;

    @FindBy (css = "input[id*='quantity']")
    private  WebElementFacade quantityBoxShown;

    @FindBy (css = " .product-subtotal .amount")
    private WebElementFacade productTotalUp;

    @FindBy (css = ".cart-subtotal .amount")
    private WebElementFacade cartSubtotal;

    @FindBy (css = ".order-total .amount")
    private WebElementFacade orderTotal;

    //@FindBy (css = ".product-remove a")
    @FindBy (css = "a[href*='cart?remove']")
    private WebElementFacade removeProductFromCart;

    @FindBy (css = "[role='alert']")
    private WebElementFacade removeProductCartConfirm;

    @FindBy (css = ".woocommerce-message")
    private WebElementFacade addProductCartConfirmMessage;

    public void clickOnShopButton (){ clickOn(shopButton); }

    public void addBeanieToCartProduct (){clickOn(addToCartBeanieProduct);}

    public void viewShoppingCartButton (){clickOn(viewShoppingCartButton);}

    public void viewCapProduct (){clickOn(viewCapProduct);}

    public void proceedToCheckoutButton (){
        clickOn(proceedToCheckoutButton);
    waitABit(6000);}


    public void updateCartButton (){clickOn(updateCartButton);}


    public void click3QtyBox ()
    {clickOn(clickQtyBox);
    typeInto(clickQtyBox, "3");}

    public void addToCartButton_10000 ()
    {clickOn(clickQtyBox);
    typeInto(clickQtyBox, "-10000");}

    public void clickQtyBox (){
        clickOn(clickQtyBox);
    }

    public void clickAddtoCartButton ()
    {   waitFor(addToCartButton);
        clickOn(addToCartButton);}

    public void viewCartButton (){clickOn(viewCartButton);}

    public void checkQtyCartIf (){

        String price =  productPriceShown.getText().trim();
        String priceFin = price.replace(",", "").replace(" lei", "");
        int priceX = Integer.valueOf(priceFin); //scoate valoare int din strig

        String priceTotalUp = productTotalUp.getText().trim();
        String priceFinTotalUp = priceTotalUp.replace(",", "").replace(" lei", "");
        int priceY = Integer.valueOf(priceFinTotalUp);

        String priceCartSubtotal = cartSubtotal.getText().trim();
        String priceFinCartSubtotal = priceCartSubtotal.replace(",", "").replace(" lei", "");
        int priceZ = Integer.valueOf(priceFinCartSubtotal);


        String qtyBox = quantityBoxShown.getValue();
        int qtyBoxConvert = Integer.valueOf(qtyBox);

        int subtotal = priceX * qtyBoxConvert;

        if ((subtotal==priceZ)&&(priceY==subtotal)&&(priceZ==priceY)){
            System.out.println("Mergi, mai!");
            //clickOn(proceedToCheckoutButton);
        }
   }
   public void removeProductFromCart (){
        waitFor(removeProductFromCart);
        clickOn(removeProductFromCart);
   }

    public boolean removeProductCartConfirm (){
        waitFor(removeProductCartConfirm);
        return removeProductCartConfirm.containsText("removed");
    }

    public boolean addProductCartConfirmMessage (){
        waitFor(addProductCartConfirmMessage);
        return addProductCartConfirmMessage.containsText("has been added to your cart.");
    }


}


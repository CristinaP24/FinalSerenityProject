package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


@DefaultUrl("http://qa3.fasttrackit.org:8008")
public class AdminDashboardPage extends PageObject {


    @FindBy(css = "#wp-admin-bar-dashboard")
    private WebElementFacade clickAdminRootMenu;

    @FindBy(css = "li#wp-admin-bar-site-name.menupop")
    private WebElementFacade dashboardAdminRootMenu;

    @FindBy(id = "toplevel_page_woocommerce")
    private WebElementFacade clickWooCommerceCateg;

    @FindBy(id = "toplevel_page_woocommerce")
    private WebElementFacade clickOrders;

    @FindBy(css = "#order_date .sorting-indicator")
    private WebElementFacade sortingDateArrow;

    @FindBy(css = "th.check-column")
    private WebElementFacade checkBoxTick;

    @FindBy(css = " .order_number column-order_number has-row-actions column-primar")
    private WebElementFacade orders;

    @FindBy(id = "bulk-action-selector-top")
    private WebElementFacade bulkActionDropdown;

    @FindBy(id = "bulk-action-selector-top option[value*=mark_on-hold]")
    private WebElementFacade changeStatusOnHold;

    @FindBy(id = "doaction")
    private WebElementFacade applyButton;

    @FindBy(className = ".updated")
    private WebElementFacade statusChangeMessage;

    @FindBy(css = ".wp-menu-name")


    List<WebElementFacade> mainMenuCategories;

    @FindBy (css = "#menu-posts-product a[href*='post-new']")
    private WebElementFacade addNewProductButton;

    @FindBy(css = "#titlewrap [type=text]")
    private WebElementFacade enterProductNameField;

    @FindBy(css = " .order_number column-order_number has-row-actions column-primar")
    List<WebElementFacade> listOrders;

    @FindBy (id = "_regular_price")
    private WebElementFacade enterRegularPriceField;

    @FindBy (id = "_sale_price")
    private WebElementFacade enterSalePriceField;

    @FindBy (css = "a[href*='#inventory']")
    private WebElementFacade inventoryCategory;

    @FindBy (id = "_sku")
private WebElementFacade skuCode;

    @FindBy (id = "_manage_stock")
    private WebElementFacade manageStockCheckBox;

    @FindBy (id = "_stock")
    private WebElementFacade setStockNumber;

    @FindBy (css = "a[href='#product_attributes']")
    private WebElementFacade attributesCategory;

    @FindBy (css = ".attribute_taxonomy")
   private WebElementFacade customProductAttribute;

    @FindBy (css = ".attribute_taxonomy [value='pa_color']")
    private WebElementFacade selectColorAttribute;

    @FindBy (css = ".attribute_taxonomy [value='pa_size']")
    private WebElementFacade selectSizeAttribute;

    @FindBy (css = ".button.add_attribute")
    private WebElementFacade addAttributeProdButton;

    @FindBy (css = ".select_all_attributes")
    private WebElementFacade selectAllAttributesButton;

    @FindBy (css = ".button.save_attributes")
    private WebElementFacade saveAtrributesButton;

    @FindBy (css = "#product_attributes > div.product_attributes.wc-metaboxes.ui-sortable > div:nth-child(2) > div > table > tbody > tr:nth-child(1) > td:nth-child(2) > span > span.selection > span > ul > li > input")
    private WebElementFacade selectColorDd;

    @FindBy (id = "in-product_cat-213")
    private WebElementFacade checkAccessoriesCategory;

    @FindBy (css = "#publishing-action [type*='hidden']")
    private WebElementFacade hiddenPublishButton;

    @FindBy (css = "#publishing-action .button")
    private WebElementFacade clickPublishButton;

    public void clickWooCommerceCateg() {
        clickOn(clickWooCommerceCateg);
    }

    public void selectOrdersDropDown() {
        bulkActionDropdown.selectByVisibleText("Change status to on-hold");
    }

    public boolean selectFirst5Orders() {

        for (WebElementFacade orders : listOrders) {
            int size = listOrders.size();
            if (size <= 13) {
                clickOn(checkBoxTick);
                return true;
            }
        }
        return false;
    }

    public void applyButton() {
        clickOn(applyButton);
        waitABit(3000);
    }

    public boolean checkStatusChangeMessage() {
        waitABit(5000);
        return statusChangeMessage.containsText(" order statuses changed.");
    }

    public void selectDashboardRootMenu() {

        Actions action = new Actions(getDriver());
        WebElementFacade e = dashboardAdminRootMenu;
        action.moveToElement(e).perform();

    }

    public void setClickAdminRootMenu() {
        clickOn(clickAdminRootMenu);
    }



    public boolean selectMainMenuCategories() {
        Actions action = new Actions(getDriver());
        for (WebElementFacade category : mainMenuCategories) {
            if (category.getText().contains("Products")) {
                WebElementFacade e = category;
                action.moveToElement(e).perform();
                return true;
            }
        }
        return false;

    }

    public void clickAddNewProductButton (){
        clickOn(addNewProductButton);
    }

    public void enterProductNameField (){
        typeInto(enterProductNameField, "Veritaserum Potion");
    }


    public void enterRegularPriceField (){
        typeInto(enterRegularPriceField, "25");
    }

    public void enterSalePriceField (){
        typeInto(enterSalePriceField, "20");
    }

    public void inventoryCategory (){
        clickOn(inventoryCategory);
    }

    public void skuCode (){
        typeInto(skuCode, "serum-truth77");
    }

    public void manageStockCheckBox (){
        clickOn(manageStockCheckBox);
    }

    public void setStockNumber (){
        typeInto(setStockNumber, "50");
    }

    public void attributesCategory (){
        clickOn(attributesCategory);
    }

    public void customProductAttributeDd (){
        Actions action = new Actions(getDriver());
        WebElementFacade e = customProductAttribute;
        action.moveToElement(e).perform();
    }

    public void selectColorAttribute (){
        clickOn(selectColorAttribute);
    }


    public void addAttributeProdButton (){
        clickOn(addAttributeProdButton);
    }

    public void saveAtrributesButton (){
        clickOn(saveAtrributesButton);
    }

    public void selectColorDd (){
        waitABit(3000);
        clickOn(selectAllAttributesButton);

    }

    public void clickAccessoriesCategory () {
        clickOn(checkAccessoriesCategory);
    }



    public void setClickPublishButton (){
        ;//("#publishing-action [type*='hidden']");
       //hiddenPublishButton.isDisplayed();
        waitABit(5000);
       clickOn(clickPublishButton);

    }

}

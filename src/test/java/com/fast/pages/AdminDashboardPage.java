package com.fast.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

//@DefaultUrl("http://qa3.fasttrackit.org:8008/wp-admin/")

@DefaultUrl("http://qa3.fasttrackit.org:8008")
public class AdminDashboardPage extends PageObject {
    Actions action;

    @FindBy (css = "#wp-admin-bar-dashboard")
    private WebElementFacade clickAdminRootMenu;


    @FindBy (css = "li#wp-admin-bar-site-name.menupop")
    private WebElementFacade dashboardAdminRootMenu;

    @FindBy (id = "#toplevel_page_woocommerce")
    private WebElementFacade clickWooCommerceCateg;

    @FindBy(id = "#toplevel_page_woocommerce")
    private WebElementFacade clickOrders;

    @FindBy (css = "#order_date .sorting-indicator")
    private WebElementFacade sortingDateArrow;

    @FindBy (id = "cb-select-2167")
    private WebElementFacade firstOrderCb;

    @FindBy (id = "cb-select-2166")
    private WebElementFacade secondOrderCb;

    @FindBy (id = "cb-select-2168")
    private WebElementFacade thirdOrderCb;

    @FindBy (id = "cb-select-2169")
    private WebElementFacade fourthOrderCb;

    @FindBy (id = "cb-select-2170")
    private WebElementFacade fifthOrderCb;

    @FindBy (css = " .order_number column-order_number has-row-actions column-primar")
    private WebElementFacade orders;

    @FindBy (id = "#bulk-action-selector-top")
    private WebElementFacade bulkActionDropdown;

    @FindBy (id = "#bulk-action-selector-top option[value*=mark_on-hold]")
    private WebElementFacade changeStatusOnHold;

    @FindBy (id = "#doaction")
    private WebElementFacade applyButton;

    @FindBy (className = ".updated")
    private WebElementFacade statusChangeMessage;

    @FindBy(css = " .order_number column-order_number has-row-actions column-primar")
    List<WebElementFacade> listOrders;



    public void clickWooCommerceCateg (){
        clickOn(clickWooCommerceCateg);
    }

    public void selectOrdersDropDown (){
        clickOrders.selectByVisibleText("Orders");
    }


    public boolean selectFirst5Orders() {

        for (WebElementFacade orders : listOrders) {
            int size = listOrders.size();
            if(size<=5){
                clickOn(firstOrderCb);
                clickOn(secondOrderCb);
                clickOn(thirdOrderCb);
                clickOn(fourthOrderCb);
                clickOn(fifthOrderCb);

                return true;
            }
        }
        return false;
    }
public void selectBulkActionDropdown (){
        clickOn(bulkActionDropdown);

}

public void selectStatusOnHold (){
changeStatusOnHold.selectByVisibleText("Change status to on-hold");
}

public void applyButton (){
        clickOn(applyButton);
}
public boolean checkStatusChangeMessage (){
        waitFor(statusChangeMessage);
        return statusChangeMessage.containsText("order statuses changed.");
}

public void selectDashboardRootMenu (){

    WebElement e = dashboardAdminRootMenu;
    action.moveToElement(e).perform();

}
 public void setClickAdminRootMenu (){
        clickOn(clickAdminRootMenu);
 }
}

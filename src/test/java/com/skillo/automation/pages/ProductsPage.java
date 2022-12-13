package com.skillo.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends BasePage {

    @FindBy(css = ".inventory_list .inventory_item")
    List<WebElement> products;

    @FindBy(css = ".inventory_list .inventory_item .inventory_item_name")
    List<WebElement> productNames;

    public void getProductNames() {
        waitElementVisible(products.get(0));
        for (WebElement productNameElement: productNames) {
            System.out.println(productNameElement.getText());
        }
    }

}

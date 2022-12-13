package com.skillo.automation.pages;

import com.skillo.automation.utils.Browser;
import org.openqa.selenium.support.PageFactory;

public class Pages {
    public static LoginPage loginPage() {
        return PageFactory.initElements(Browser.driver(), LoginPage.class);
    }

    public static ProductsPage productsPage() {
        return PageFactory.initElements(Browser.driver(), ProductsPage.class);
    }
}

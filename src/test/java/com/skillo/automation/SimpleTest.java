package com.skillo.automation;

import com.skillo.automation.pages.Pages;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleTest extends TestBase {

    @BeforeClass
    public void setup() {
        Pages.loginPage().login("standard_user", "secret_sauce");
    }

    @Test
    public void test() {

        Pages.productsPage().getProductNames();
    }

}

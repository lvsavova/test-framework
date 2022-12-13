package com.skillo.automation;


import com.skillo.automation.utils.Browser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
    @BeforeClass
    public void init() {
        Browser.Initialize();
    }

    @AfterClass
    public void cleanup() {
        if (Browser.driver() != null) {
            Browser.driver().quit();
        }
    }
}

package com.skillo.automation.pages;

import com.skillo.automation.utils.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    public WebElement usernameField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(id = "login-button")
    public WebElement submitBtn;

    public void login(String username, String password) {
        Browser.goTo("https://www.saucedemo.com/");
        typeText(usernameField, username);
        typeText(passwordField, password);
        clickElement(submitBtn);
    }

}

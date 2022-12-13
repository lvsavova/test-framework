package com.skillo.automation.pages;

import com.skillo.automation.utils.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    private final int globalWait = 20;

    public void waitElementClickable(WebElement element) {
        new WebDriverWait(Browser.driver(), Duration.ofSeconds(globalWait))
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitElementVisible(WebElement element) {
        new WebDriverWait(Browser.driver(), Duration.ofSeconds(globalWait))
                .until(ExpectedConditions.visibilityOf(element));
    }
    public void clickElement(WebElement element) {
        waitElementClickable(element);
        element.click();
    }

    public void typeText(WebElement element, String text) {
        waitElementClickable(element);
        element.sendKeys(text);
        new WebDriverWait(Browser.driver(), Duration.ofSeconds(globalWait))
                .until(ExpectedConditions.textToBePresentInElementValue(element, text));
    }

    public void closeDriver() {
        Browser.driver().close();
    }
}

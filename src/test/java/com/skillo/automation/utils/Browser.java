package com.skillo.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Browser {
    private static WebDriver webDriver;

    public static void Initialize () {
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public static WebDriver driver() {
        return webDriver;
    }

    public static String getTitle() {
        return webDriver.getTitle();
    }

    public static void goTo(String url) {
        webDriver.get(url);
    }

    public static void close() {
        webDriver.close();
    }
}

package com.skillo.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class PrimitiveTest {

    WebDriver driver;

    @Test
    public void test() {
        this.driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
//        driver.findElement(By.cssSelector(".form_input[name=user-name]")).sendKeys("standard_user");
//        driver.findElement(By.name("password")).sendKeys("secret_sauce");
//        driver.findElement(By.id("login-button")).click();
//        driver.findElement(By.xpath("//*[text()='Get started free']")).click();

    }

    @AfterClass
    public void cleanup() {
        driver.quit();
    }
}

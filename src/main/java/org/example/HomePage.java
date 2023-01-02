package org.example;

import org.openqa.selenium.WebDriver;

public abstract class HomePage {

    public WebDriver webDriver;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }


}
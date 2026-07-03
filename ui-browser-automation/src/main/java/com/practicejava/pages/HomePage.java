package com.practicejava.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public String clickSearchButton(){
        By search = By.cssSelector(".primaryBtn.font24.latoBold.widgetSearchBtn");
        clickElement(search);
        return "Search Button Clicked";
    }

}

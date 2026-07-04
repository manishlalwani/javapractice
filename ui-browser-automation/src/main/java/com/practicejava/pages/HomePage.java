package com.practicejava.pages;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private static final Logger logger = LoggerFactory.getLogger(HomePage.class);

    private String searchCssLocator = ".primaryBtn.font24.latoBold.widgetSearchBtn";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        logger.info("Getting Page Title");
        return driver.getTitle();
    }

    public String clickSearchButton() {
        By search = By.cssSelector(searchCssLocator);
        click(search);
        logger.info("Clicked Search Button");
        return "Search Button Clicked";
    }

}

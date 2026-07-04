package com.practicejava.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.practicejava.drivers.DriverFactory;
import com.practicejava.framework.FrameworkConstants;

public class BaseTest {

    protected WebDriver driver;
    private DriverFactory factory;

    @BeforeMethod
    public void setUp() {
        System.out.println("Before Test");

        factory = new DriverFactory();
        driver = factory.getDriver();
        driver.get(FrameworkConstants.APP_URL);

    }

    @AfterMethod
    public void tearDown() {
        if (driver != null)
            driver.quit();
        System.out.println("Test Case Completed");
    }
}

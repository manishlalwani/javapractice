package com.practicejava.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.practicejava.pages.HomePage;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHomePageTitleTest() throws InterruptedException {
        System.out.println("Test Case 1");
        HomePage homePage = new HomePage(driver);
        String title = homePage.getTitle();
        Assert.assertEquals(title, "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday");

    }

    @Test
    public void verifySearchButtonTest() throws InterruptedException {
        System.out.println("Test Case 2");
        HomePage homePage = new HomePage(driver);
        String title = homePage.clickSearchButton();
        Assert.assertEquals(title, "Search Button Clicked");

    }

}

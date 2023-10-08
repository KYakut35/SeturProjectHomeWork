package com.setur.tests;

import com.setur.driver.BaseTest;
import com.setur.methods.BasePage;
import com.setur.pages.EntrancePage;
import com.setur.pages.SearchPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


public class TestCheckUrlWriteCitySelectDateSelectAdultCountScrollAndCheck extends BaseTest {

    BasePage basePage = new BasePage();
    EntrancePage entrancePage = new EntrancePage(driver);
    SearchPage searchPage = new SearchPage(driver);

    @Test
    @Order(1) // Task 1 and 2
    public void testCheckUrl() throws InterruptedException {
        Assertions.assertTrue(basePage.checkURL("https://www.setur.com.tr/"));
        entrancePage.cleanThePageFromPopUps();
    }

    @Test
    @Order(2) // Task 3 , 4 , 5 , 6 , 7
    public void testSetSearchOptions() throws InterruptedException {
        entrancePage.selectCityDatePerson();
    }

    @Test
    @Order(3) // Task 8
    public void testCheckNewUrl() throws InterruptedException {
        Assertions.assertTrue(searchPage.checkUrl("Antalya"));
    }

    @Test
    @Order(4) // Task 9 and 10
    public void testCompareSearchResults() throws InterruptedException {
        searchPage.compareHotelCount();
    }

}

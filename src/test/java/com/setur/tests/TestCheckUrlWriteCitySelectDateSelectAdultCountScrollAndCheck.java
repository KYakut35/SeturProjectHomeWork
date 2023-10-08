package com.setur.tests;

import com.setur.driver.BaseTest;
import com.setur.methods.BasePage;
import com.setur.pages.EntrancePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


public class TestCheckUrlWriteCitySelectDateSelectAdultCountScrollAndCheck extends BaseTest {

    BasePage basePage = new BasePage();
    EntrancePage entrancePage = new EntrancePage(driver);

    @Test
    @Order(1)
    public void testCheckUrl() {
        Assertions.assertTrue(basePage.checkURL("https://www.setur.com.tr/"));
        entrancePage.cleanThePageFromPopUps();
    }

    @Test
    @Order(2)
    public void testSetSearchOptions() throws InterruptedException {
        entrancePage.cleanThePageFromPopUps();
    }




}

package com.setur.pages;

import com.setur.methods.BasePage;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
    }

    public boolean checkUrl(String searchWord) throws InterruptedException {
        Thread.sleep(1000);
        if (driver.getCurrentUrl().contains(searchWord)){
            return true;
        }
        else {
            return false;
        }
    }

    //Antalya (511) locator
    ////span[contains(@class,'ctpZFK')]




}

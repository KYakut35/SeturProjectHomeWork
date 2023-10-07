package com.setur.pages;

import com.setur.methods.BasePage;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {

    public void SearchPage(WebDriver driver) {
    }

    public boolean checkUrl(String searchWord) {
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

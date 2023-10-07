package com.setur.pages;

import com.setur.methods.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.ArrayList;
import java.util.List;

public class EntrancePage extends BasePage {

    public  EntrancePage(WebDriver driver) {
    }




    public void cleanThePageFromPopUps() {
        //click(By.xpath("//span[contains(@class,\"close\")]"));
        click(By.xpath("//a[contains(@id,\"ButtonLevelOptinDec\")]"));
        click(By.xpath("//span[contains(@class,\"d0bnog-0 dAkGPW\")]"));
    }

    public void checkHotelTab() {
        findElement(By.xpath("//*[@width='16' and @height='16' and @class=\"styled__StyledCustomIcon-sc-d0bnog-0 ezXXOW\"]"));
    }

    public void selectCityDatePerson() throws InterruptedException {
        List<WebElement> menuElements = findAllElements(By.xpath("//div[@role=\"button\" and @tabindex=\"-1\"]"));
        Thread.sleep(1000);
        menuElements.get(0).click();
        menuElements.get(0).sendKeys("Antalya");
        Thread.sleep(1000);
        menuElements.get(1).click();
        Thread.sleep(1000);
    }



}

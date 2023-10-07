package com.setur.pages;

import com.setur.methods.BasePage;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EntrancePage extends BasePage {

    public  EntrancePage(WebDriver driver) {

    }

    public void cleanThePageFromPopUps() {
        click(By.xpath("//span[contains(@class,\"close\")]"));
        click(By.xpath("//a[contains(@id,\"ButtonLevelOptinDec\")]"));
        click(By.xpath("//span[contains(@class,\"d0bnog-0 dAkGPW\")]"));
    }


}

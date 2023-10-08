package com.setur.pages;

import com.setur.methods.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class EntrancePage extends BasePage {

    public  EntrancePage(WebDriver driver) {
    }

    public void cleanThePageFromPopUps() {
        //click(By.xpath("//span[contains(@class,\"close\")]"));
        click(By.xpath("//a[contains(@id,\"ButtonLevelOptinDec\")]"));
        click(By.xpath("//span[contains(@class,\"d0bnog-0 dAkGPW\")]"));
    }

    public boolean compareStrings(String s1 , String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        else {
            return false;
        }
    }

    public void selectCityDatePerson() throws InterruptedException {
        Thread.sleep(1000);
        List<WebElement> menuElements = findAllElements(By.xpath("//div[@role='button']"));
        menuElements.get(0).sendKeys("Antalya");
        Thread.sleep(1000);

        menuElements.get(1).click();
        for (int i=0;i<5;i++) {
            click(By.xpath("//button[contains(@class,'NavNext')]"));
            Thread.sleep(500);
        }

        click(By.xpath("//td[contains(@aria-label,' 1 Nisan 2024')]"));
        Thread.sleep(500);
        click(By.xpath("//td[contains(@aria-label,' 7 Nisan 2024')]"));
        Thread.sleep(500);

        menuElements.get(2).click();

        List<WebElement> adultElements = findAllElements(By.xpath("//button[@data-testid='increment-button']"));
        List<WebElement> countElements = findAllElements(By.xpath("//span[@data-testid='count-label']"));

        String counter = countElements.get(0).getText();
        adultElements.get(0).click();
        String newCounter = countElements.get(0).getText();
        compareStrings(counter,newCounter);
        Thread.sleep(500);

        click(By.xpath("//button[contains(@class,'1i7jkmi')]"));

    }

}

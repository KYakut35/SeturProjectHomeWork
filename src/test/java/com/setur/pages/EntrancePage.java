package com.setur.pages;

import com.setur.methods.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class EntrancePage extends BasePage {

    public  EntrancePage(WebDriver driver) {
    }

    public void cleanThePageFromPopUps() throws InterruptedException{
        Thread.sleep(1000);
        click(By.xpath("//span[contains(@class,\"close\")]")); // Pop up close button locator in the middle of the website.
        click(By.xpath("//a[contains(@id,\"ButtonLevelOptinDec\")]")); // Pop up close button in the top of the website.
        click(By.xpath("//span[contains(@class,\"d0bnog-0 dAkGPW\")]")); // Pop up close button for ChatGPT adv.
    }

    public boolean compareStrings(String s1 , String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        else {
            return false;
        }
    }

    /*
        I found locators from the inspect page, usually using xpath. Since there is no element with id or name attribute on the given site,
        some xpath locators I wrote did not work. However, when searching on the Inspect page, the same locators I used were found
        on the page. So I was extremely slow. Even though I couldn't take the test, I tried to do all the tasks given in the homework.
        I used Junit and Log4J.
     */

    public void selectCityDatePerson() throws InterruptedException {
        Thread.sleep(1000);
        List<WebElement> menuElements = findAllElements(By.xpath("//div[@role='button']")); // For 3 options of main search menu
        menuElements.get(0).sendKeys("Antalya"); // City or Hotel Tab element
        Thread.sleep(1000);
        List<WebElement> dropDownMenu = findAllElements(By.xpath("//div[contains(@class,'jMlpuL')]")); // After writing the city , dropdown menu appears
        dropDownMenu.get(0).click();
        Thread.sleep(1000);

        menuElements.get(1).click(); // Date Element
        for (int i=0;i<5;i++) { // Navigating 5 times for to get April month
            click(By.xpath("//button[contains(@class,'NavNext')]"));
            Thread.sleep(500);
        }

        click(By.xpath("//td[contains(@aria-label,' 1 Nisan 2024')]"));
        Thread.sleep(500);
        click(By.xpath("//td[contains(@aria-label,' 7 Nisan 2024')]"));
        Thread.sleep(500);

        menuElements.get(2).click(); // Person selection element

        List<WebElement> adultElements = findAllElements(By.xpath("//button[@data-testid='increment-button']")); // Same locator for adult and child increment button so that  I used first one
        List<WebElement> countElements = findAllElements(By.xpath("//span[@data-testid='count-label']")); // Same with above

        String counter = countElements.get(0).getText();
        adultElements.get(0).click(); // Using first element
        String newCounter = countElements.get(0).getText();
        compareStrings(counter,newCounter); // Using first element
        Thread.sleep(500);

        click(By.xpath("//button[contains(@class,'1i7jkmi')]")); // Search button element
    }

}

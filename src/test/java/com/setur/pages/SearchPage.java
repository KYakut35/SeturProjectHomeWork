package com.setur.pages;

import com.setur.methods.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
    }

    public boolean checkUrl(String searchWord) throws InterruptedException { // Task 8
        Thread.sleep(1000);
        if (driver.getCurrentUrl().contains(searchWord)){
            return true;
        }
        else {
            return false;
        }
    }

    public void compareHotelCount() throws InterruptedException{
        Thread.sleep(1000);
        String hotelCount = findElement(By.xpath("//span[contains(@class,'1d4zq1b-21')]")).getText(); // For Getting Total Number of Hotels
        hotelCount = hotelCount.replaceAll("[^0-9]",""); // Only taking the numbers
        System.out.println(hotelCount);

        Thread.sleep(1000);
        click(By.xpath("//div[contains(@data-testid,'show')]")); // Show Regions Button element
        Thread.sleep(500);

        scrollWithAction(By.xpath("//div[contains(@class,'xe39ep-3')]"));
        List<WebElement> regions = findAllElements(By.xpath("//div[contains(@class,'xe39ep-3')]")); // All regions with same locator

        Random random = new Random();
        int randomIndex = random.nextInt(regions.size()); // Getting random index for Task 9
        regions.get(randomIndex).click();

        scrollWithAction(By.xpath("//span[contains(@class,'g6lxf7-3')]")); // Scrolling down for the Given element
        String compareHotelCount = findElement(By.xpath("//span[contains(@class,'g6lxf7-3')]")).getText(); // Getting Count for comparison
        if (hotelCount.equals(compareHotelCount)) { // Comparing for Task 10
            System.out.println("Hotel counts correct");
        }
    }








}

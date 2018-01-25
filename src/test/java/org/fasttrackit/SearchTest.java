package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {

    public void searchTestWithOneKeywordTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\webdrive\\webdriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.id("search")).sendKeys("vase" + Keys.ENTER);
        //  driver.findElement(By.name("q")).sendKeys("q"+ Keys.ENTER);
        driver.findElement(By.linkText("Add to Wishlist")).click();
    }
}

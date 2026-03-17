package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandlingTest {

    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/iframe");

        Thread.sleep(2000);

        // -------- 1. Switch using INDEX --------
        driver.switchTo().frame(0);
        System.out.println("Switched using INDEX");

        WebElement textBox = driver.findElement(By.id("tinymce"));
        textBox.clear();
        textBox.sendKeys("Hello using index");

        Thread.sleep(2000);

        // Switch back to main page
        driver.switchTo().defaultContent();

        // -------- 2. Switch using ID/NAME --------
        driver.switchTo().frame("mce_0_ifr");
        System.out.println("Switched using ID/NAME");

        WebElement textBox2 = driver.findElement(By.id("tinymce"));
        textBox2.clear();
        textBox2.sendKeys("Hello using name/id");

        Thread.sleep(2000);

        driver.switchTo().defaultContent();

        // -------- 3. Switch using WebElement --------
        WebElement frameElement = driver.findElement(By.cssSelector("iframe"));
        driver.switchTo().frame(frameElement);
        System.out.println("Switched using WebElement");

        WebElement textBox3 = driver.findElement(By.id("tinymce"));
        textBox3.clear();
        textBox3.sendKeys("Hello using WebElement");

        Thread.sleep(3000);

        driver.quit();
    }
}
package com.example.tests;

import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileInputStream;

public class DataDrivenLoginTest {

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("testdata.xlsx");
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheetAt(0);

        int rows = sheet.getPhysicalNumberOfRows();

        for (int i = 1; i < rows; i++) {

            Row row = sheet.getRow(i);
            String username = row.getCell(0).getStringCellValue();
            String password = row.getCell(1).getStringCellValue();

            System.out.println("Running test with: " + username + " / " + password);

            // Setup driver
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            try {
                driver.get("https://the-internet.herokuapp.com/login");

                Thread.sleep(2000);

                // Enter username & password
                driver.findElement(By.id("username")).clear();
                driver.findElement(By.id("username")).sendKeys(username);

                driver.findElement(By.id("password")).clear();
                driver.findElement(By.id("password")).sendKeys(password);

                Thread.sleep(2000);

                // Click login
                driver.findElement(By.cssSelector("button[type='submit']")).click();

                Thread.sleep(3000);

                // Validate result
                String message = driver.findElement(By.id("flash")).getText();

                if (message.contains("You logged into a secure area")) {
                    System.out.println("✅ Login SUCCESS for: " + username);
                } else {
                    System.out.println("❌ Login FAILED for: " + username);
                }

            } catch (Exception e) {
                System.out.println("Error occurred for user: " + username);
                e.printStackTrace();
            } finally {
                driver.quit();
            }
        }

        workbook.close();
        fis.close();
    }
}
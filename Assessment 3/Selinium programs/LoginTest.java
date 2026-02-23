package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LoginTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/login");
            driver.findElement(By.id("username")).sendKeys("tomsmith");
            driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            String successMessage = driver.findElement(By.id("flash")).getText();
            if (successMessage.contains("You logged into a secure area!")) {
                System.out.println("TEST PASSED: Login Successful");
            } else {
                System.out.println("TEST FAILED: Login Unsuccessful");
            }
        } catch (Exception e) {
            System.out.println("Test Failed due to Exception: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
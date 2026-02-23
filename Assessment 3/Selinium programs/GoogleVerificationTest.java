package assessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class GoogleVerificationTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();
            driver.get("https://www.google.com");
            String actualTitle = driver.getTitle();
            String expectedTitle = "Google";
            if (actualTitle.equals(expectedTitle)) {
                System.out.println("Title Verification Passed");
            } else {
                System.out.println("Title Verification Failed");
                System.out.println("Actual Title: " + actualTitle);
            }
            String currentURL = driver.getCurrentUrl();
            if (currentURL.contains("google.co.in")) {
                System.out.println("Redirection Verification Passed");
                System.out.println("Current URL: " + currentURL);
            } else {
                System.out.println("Redirection Verification Failed");
                System.out.println("Current URL: " + currentURL);
            }
        } finally {
            driver.quit();
        }
    }
}
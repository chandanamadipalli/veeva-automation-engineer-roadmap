package assessment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class FilterListSearchTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("data:text/html," +
                "<html><body>" +
                "<input type='text' id='searchBox' placeholder='Search here...' onkeyup='filterList()'>" +
                "<ul id='list'>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "<li>JavaScript</li>" +
                "<li>C++</li>" +
                "<li>Selenium</li>" +
                "</ul>" +
                "<script>" +
                "function filterList() {" +
                "var input = document.getElementById('searchBox');" +
                "var filter = input.value.toLowerCase();" +
                "var ul = document.getElementById('list');" +
                "var li = ul.getElementsByTagName('li');" +
                "for (var i = 0; i < li.length; i++) {" +
                "var txtValue = li[i].textContent || li[i].innerText;" +
                "if (txtValue.toLowerCase().indexOf(filter) > -1) {" +
                "li[i].style.display = '';" +
                "} else {" +
                "li[i].style.display = 'none';" +
                "}" +
                "}" +
                "}" +
                "</script>" +

                "</body></html>");
        System.out.println("Type manually in the search box to filter list.");
        System.out.println("Close the browser manually when done.");
    }
}
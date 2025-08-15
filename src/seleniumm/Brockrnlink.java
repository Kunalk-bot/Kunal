package seleniumm;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Brockrnlink {

    public static void main(String[] args) throws IOException {

        // Set ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Locate all footer links
        List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));

        // Use SoftAssert so all links are verified before failing
        SoftAssert softAssert = new SoftAssert();

        for (WebElement link : links) {
            String url = link.getAttribute("href");

            try {
                HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
                conn.setRequestMethod("HEAD");
                conn.connect();
                int responseCode = conn.getResponseCode();

                System.out.println(link.getText() + " --> " + responseCode);

                // Assert response code
                softAssert.assertTrue(responseCode < 400,
                        "🔴 Broken Link: " + link.getText() + " --> " + responseCode);

            } catch (Exception e) {
                softAssert.fail("⚠️ Error for link: " + link.getText() + " --> " + e.getMessage());
            }
        }

        driver.quit();

        // Collate all soft assertion results
        softAssert.assertAll();
    }
}

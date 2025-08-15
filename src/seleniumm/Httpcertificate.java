package seleniumm;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.apache.commons.io.FileUtils;

public class Httpcertificate {

    public static void main(String[] args) throws IOException {

        // Set Firefox options to accept insecure certificates
        FirefoxOptions options = new FirefoxOptions();
        options.setAcceptInsecureCerts(true);

        // Set GeckoDriver path
        System.setProperty("webdriver.gecko.driver", "D:\\EclipsStuff\\Drivers\\geckodriver.exe");

        // Initialize WebDriver with options
        WebDriver driver = new FirefoxDriver(options);

        // Open site with expired SSL
        driver.get("https://expired.badssl.com/");

        // Take screenshot
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\KUNAL\\Desktop\\Screenshot\\Selescreenshot.png");
        FileUtils.copyFile(src, dest);

        System.out.println("Screenshot saved successfully!");

        driver.quit();
    }
}

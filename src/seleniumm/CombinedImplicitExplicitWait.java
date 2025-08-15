package seleniumm;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import java.time.Duration;

	public class CombinedImplicitExplicitWait {
	    public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();

	        // ✅ Set global Implicit Wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        // Open any test site
	        driver.get("https://example.com");

	        // ✅ Implicit wait applies here
	        WebElement inputBox = driver.findElement(By.id("searchInput"));
	        inputBox.sendKeys("Selenium");

	        // ✅ Explicit wait with loop for retrying the click
	        boolean clicked = false;
	        for (int i = 0; i < 3; i++) {
	            try {
	                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	                WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.id("searchBtn")));
	                button.click();
	                System.out.println("Clicked on attempt " + (i + 1));
	                clicked = true;
	                break;
	            } catch (Exception e) {
	                System.out.println("Attempt " + (i + 1) + ": Button not clickable yet.");
	            }
	        }

	        if (!clicked) {
	            System.out.println("Failed to click the button after retries.");
	        }

	        driver.quit();
	    }
	}




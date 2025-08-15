package seleniumm;



	import java.util.List;
	import java.util.stream.Collectors;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;

	public class Lambdastram {

	    public static void main(String[] args) {
	        // Set path to ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        // Navigate to GreenKart offers page
	        driver.get("https://rahulshettyacademy.com/greenkart/#/offers");

	        // Enter "Rice" into search field
	        driver.findElement(By.id("search-field")).sendKeys("Rice");

	        // Wait briefly to allow table to update (optional: use WebDriverWait instead)
	        try {
	            Thread.sleep(2000); // not recommended for real tests, use explicit wait
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Get all veggie name elements in the first column
	        List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));

	        // Filter list: only those that contain "Rice"
	        List<WebElement> filteredList = veggies.stream()
	                .filter(veggie -> veggie.getText().contains("Rice"))
	                .collect(Collectors.toList());

	        // Assert all visible results contain "Rice"
	        Assert.assertEquals(veggies.size(), filteredList.size(), "Not all rows contain 'Rice'");

	        driver.quit();
	    }
	}

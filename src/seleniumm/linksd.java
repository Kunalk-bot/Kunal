package seleniumm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\browser\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qaclickacademy.com/");
		System.out.println(driver.findElement(By.tagName("a")).getSize());
		WebElement footerdriver = driver.findElement(By.id("footer-part"));
		System.out.println (footerdriver.findElement(By.tagName("a")).getSize());
				}
}
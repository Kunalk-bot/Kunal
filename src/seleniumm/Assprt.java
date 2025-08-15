package seleniumm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.By;
import org.testng.Assert;

public class Assprt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\browser\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id*='friendsandfamily'")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily'")).isSelected());
		System.out.println(driver.findElement(By.cssSelector("Input[type='checkbox']")).getSize());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily'")).isSelected());
		System.out.println("6");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily'")).isSelected());
		System.out.println("5");
		}

}

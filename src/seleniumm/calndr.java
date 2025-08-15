package seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calndr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\browser\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		System.out.println(driver.findElement(By.cssSelector(".custom_date_pic required home-date-pick valid")).getAttribute("Style"));

	}

}

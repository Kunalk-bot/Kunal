package seleniumm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class actn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\browser\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("https://www.ebay.com");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("gh-ac"))).click().sendKeys("name").build().perform();
		a.moveToElement(driver.findElement(By.id("gh-ac"))).click().keyDown(Keys.SHIFT).sendKeys("mobile").doubleClick().contextClick().build().perform();
	*/
		//driver.get("https://www.amazon.in/");// for action code
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize(); // Maximizes the browser window

	//	Actions a =new Actions (driver);
		//a.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		
		
             //// java script executor
		
		JavascriptExecutor js=  (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop = 5000");
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum = 0;
		for(int i=0;i<values.size();i++)
		{
		sum= sum + Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);
		
		int total= Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		System.out.println(total);
		
		

		
		
		
	  //  Assert.assertEquals(sum, total );
		
	}

}

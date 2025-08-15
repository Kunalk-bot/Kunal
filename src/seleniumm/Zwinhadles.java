package seleniumm;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Zwinhadles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//////////////////////////////////not switching to child//////////////////////////
		System.setProperty("WebDriver.gecko.driver", "C:\\Users\\DELL\\eclipse-workspace\\browser\\geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> winhan= driver.getWindowHandles();
		Iterator<String>itr =winhan.iterator();
		String parentwin = itr.next();
		String childwin  = itr.next();
		
		driver.switchTo().window(childwin);
		String emailid = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split("")[0].trim();
		driver.switchTo().window(parentwin);
		driver.findElement(By.id("username")).sendKeys(emailid);		
	}
		
		

	

}

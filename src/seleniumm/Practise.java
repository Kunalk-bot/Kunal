package seleniumm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practise {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver ,  Duration.ofSeconds(0));
		WebElement elem = wait.until((ExpectedConditions.elementToBeClickable(By.id(""))));

	}

}

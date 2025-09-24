package seleniumm;

import java.awt.Checkbox;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {
	public static WebDriver driver ;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 500)");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

       List <WebElement> checkboxes= driver.findElements(By.xpath("//input[@class='form-check-input' and  @type='checkbox']"));
//       for (WebElement Checkbox:checkboxes) {
//    	   Checkbox.click();
//    	   Checkbox.click();
//    	    }
//       for (int i=4 ;i<checkboxes.size();i++) {        //////select last 3
//    	   checkboxes.get(i).click();
//    	   checkboxes.get(i).click();
//
//    	    }
       for (int i=0 ;i<3;i++) {/////// select first 3
    	   checkboxes.get(i).click();
    	   if(checkboxes.get(i).isSelected()) {//////////// if  for unselect
    		   checkboxes.get(i).click();
    		   
    		   
    	   }
    	    }
       
       
       
       
       
       

	}

}

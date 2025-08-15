package seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage2 {
	
	WebDriver driver;
	loginpage2( WebDriver d)
	{
		////without page factory
		driver = d;
	}
		
		By useenrmae  = By.id("user-name");
		By password  = By.id("password");
		By loginbtn =By.id("login-button");
				
           public void enterusername2(String uname) 
           {
			driver.findElement(useenrmae).sendKeys(uname);
		}
           
           public void enterpasswrd2(String pass)
           {
            driver.findElement(password).sendKeys(pass);
            }
           
            public void clickloginbutton2() {
           	driver.findElement(loginbtn).click();   
	
                   }
}



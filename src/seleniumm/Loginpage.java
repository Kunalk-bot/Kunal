package seleniumm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
	//using pagefacatory
	Loginpage (WebDriver d )
	{
		driver=d;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(id="user-name")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="login-button")
	WebElement loginbtn;
	
	public void enterusername(String uname) {
		username.sendKeys("uname");
	}
	public void enterpasswrd(String pass) {
		password.sendKeys("password");
	}
		
		public void clickloginbutton() {
			loginbtn.click();
		}
		}

package seleniumm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pageobjctmodel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\browser\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();
		
		Loginpage pg = new Loginpage(driver);
				
	    driver.get("https://www.saucedemo.com/v1/");
	    pg.enterusername("standard_user");
	    pg.enterpasswrd("secret_sauce");
	    pg.clickloginbutton();
		
		loginpage2 pg2=new  loginpage2(driver);
	    driver.get("https://www.saucedemo.com/v1/");
	    pg2.enterusername2("standard_user");
	    pg2.enterpasswrd2("secret_sauce");
	    pg2.clickloginbutton2();


	}

}

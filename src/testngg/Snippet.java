package testngg;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Snippet {
	@BeforeTest 
	public void eduloan() {
		System.out.println("edu befortest  day");
	
		}
	@Test 
	public void schlloan() {
		System.out.println("schl test  day");
		}
	
	@Test 
	public void schlloann() {
		Assert.assertTrue(false);
		}
	
	@AfterTest 
	public void bussiness () {
		System.out.println("bussiness after  day");
		}
}


package testngg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {
	@BeforeTest 
	public void catloan() {
		System.out.println("bbcarloan befortest  day");
	
		}
	@Test 
	public void bikeloan() {
		System.out.println("bike test  day");
		}
	
	@BeforeSuite
	public void bfsuite() {
		System.out.println("im  bfsuite");}
	@AfterSuite
	public void aftsuite() {
		System.out.println("im after suit");}
	
	
	 @Test(groups= {"smoke"})
 
	public void bikeloan2() {
		System.out.println("bike test  day");
		}@Test 
	public void bikeloane() {
			System.out.println("bike test  day");
			}
	@AfterTest 
	public void chopper () {
		System.out.println("chopper after  day");
		}
	
	@BeforeMethod
	public void Beforemethod() {
		System.out.println("bf method");
		}
	
	@AfterMethod 
	public void aftermethod () {
		System.out.println(" after  method");
		}
	
	@BeforeClass 
	public void Beforeclass() {
		System.out.println("im @Beforeclass");}
		@AfterClass
		public void Afterclass() {
			System.out.println("im  @Beforeclass");}





}

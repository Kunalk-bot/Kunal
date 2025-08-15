package testngg;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

 

public class Tsttng {
	
	 @Test(groups= {"smoke"})
	public  void   group() {
		
		System.out.println("this is group ");
		
	}
	  @Parameters({"URLA","usernameA","keyA"})
       @Test
		public  void   groupj(String urln , String usename ,int APIkeys) 
     {
		System.out.println(urln);
		System.out.println(usename);
		System.out.println(APIkeys);}

	 
	 @Test(dependsOnMethods={"groupc"})
		public  void   groupa() {
			
			System.out.println("this is groupz ");
			
		}
	 @Test(dependsOnMethods={"groupc","groupa"})
		public  void   groupb() {
			
			System.out.println("this is groupb ");
			
		}
	 @Test
		public  void   groupc() {
			
			System.out.println("this is group c");
			
		}
	 @Test(enabled=false)
		public  void   groupd() {
			
			System.out.println("this is group c");
			
		}
	 
	 @Test(enabled=true)
		public  void   groupe() {
			
			System.out.println("this is group c");
			
		}
	 
	 @Test(priority =2)
		public  void   groupf() {
			
			System.out.println("this is group c");
			
		}
	       @Test(priority =1)
		public  void   groupg() {
			
			System.out.println("this is group c");
			
		}
	      
	    
				}
		 
	 
	 






package testngg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tstr {
	  @Test
		public void getdata()
		{
	  		System.out.println("gtestdata");

		}
	      @BeforeTest
	      public void getdata2()
	  	{
	    		System.out.println("gbefore testtster");

	  	}
	      
	      @AfterTest
	      public void getdata1()
	  	{
	    		System.out.println("gafter testtsytre ");

	  	}

	}



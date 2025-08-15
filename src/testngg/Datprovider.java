package testngg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datprovider {
	@Test(dataProvider="getdata")
	public void user(String username, String passwrod) {
		System.out.println(username);
		System.out.println(passwrod);

		
	}

	     @DataProvider
		public Object[][] getdata(){
		Object[][] data= new Object[3][2];
		data[0][0]="firstusername ";
		data[0][1]="firtpasssword ";
		data[1][0]="secondusername ";
		data[1][1]="secondpassowrd ";
		data[2][0]="secodnusername ";
		data[2][1]="secondpassword ";
		return data;
		}

		
		
	}


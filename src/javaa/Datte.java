package javaa;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		Calendar c =  Calendar.getInstance();/////differant way of creating object
		SimpleDateFormat  sdf = new SimpleDateFormat("M/dd//yyyys  HH:mm:SS");
		System.out.println(sdf.format(d));
		System.out.println(sdf.format(c.getTime()));
		System.out.println(c.getFirstDayOfWeek());
		System.out.println(c.getTimeInMillis());



		
		

	}

}

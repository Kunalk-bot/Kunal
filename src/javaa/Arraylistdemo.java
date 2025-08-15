package javaa;
import java.util.ArrayList;

public class Arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("kunal");
		a.add("sanket");
		System.out.println(a);
		a.add(0, "rahul");
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		a.get(0);
		System.out.println(a);
		System.out.println(a.contains("neha"));



	}

}

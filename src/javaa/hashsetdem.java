package javaa;
import java.util.HashSet;
import java.util.Iterator;

public class hashsetdem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> h= new  HashSet<String>();
		h.add("name");
		h.add("sanket");
		h.add("kunal");
		h.add("java");
		h.add("selenium");

		h.isEmpty();
		System.out.println(h);
		h.remove("Sanket");
		System.out.println(h);
		
		Iterator <String> i =h.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		

	}

}

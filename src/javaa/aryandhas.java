package javaa;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class aryandhas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList <String> a = new ArrayList<String> ();
//		a.add("kunal");
//		a.add("sanket");
//		a.add("golu");
//		a.add("golu");
//		a.add("tan");
//		System.out.println(a);
//		a.remove("tan");
//		a.remove(2);
//		System.out.println(a);
//		System.out.println(a.size());
		
		//HASHSET FRO ADD DEUPLICCATE VALUES
			HashSet<String> h = new HashSet<String>();
		h.add("kunal");
		h.add("sanket");
		h.add("golu");
		h.add("golu");
		h.add("tan");
		System.out.println(h);
		h.remove("tan");
		h.remove(2);
		System.out.println(h);
	    Iterator<String> i=h.iterator();
	   
	   System.out.println( i.next());
	   System.out.println( i.next());
	   while(i.hasNext())
	    {
		   System.out.println( i.next());
		  

	    }

		

	}

}

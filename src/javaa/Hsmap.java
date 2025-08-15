package javaa;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hsmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <Integer, String > hm= new HashMap <Integer, String >();//used to put value on  location
		hm.put(0, "kunal");
		hm.put(2, "sanket");
		hm.put(25, "kqueioe");
		System.out.println(hm.get(25));
		hm.remove(2);
		System.out.println(hm.get(25));
		System.out.println(hm.get(0));
		Set sn= hm.entrySet();
		Iterator  it =sn.iterator();
		
		while(it.hasNext()) {
			Map.Entry mp= (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());


			
			
		}



	}

}

package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Write a Java program to remove all of the mappings from a map.

public class HashMap_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		has3();
	}

	public static void has3() {
		HashMap<Integer, String> h=new HashMap<>();
		h.put(0, "italy");
		h.put(1, "india");
		h.put(2, "iran");
		h.put(3, "iraq");
		h.put(4, "istanbul");
		System.out.println(h);
		int size=h.size();
		System.out.println(size);
		
		h.clear();
			
			System.out.println(h);
			
			
		
		/*Set s1=h.entrySet();
		Iterator it=s1.iterator();
		while(it.hasNext()) {
			Map.Entry m1=(Map.Entry)it.next();
			m1
			
		}*/
	}
}

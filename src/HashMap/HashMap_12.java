package HashMap;

import java.util.Collection;
//Write a Java program to get a collection view of the values contained in this map.
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		has12();
	}
	public static void has12() {
		HashMap<Integer, String> h=new HashMap<>();
		h.put(0, "italy");
		h.put(1, "india");
		h.put(2, "iran");
		h.put(3, "iraq");
		h.put(4, "istanbul");
		System.out.println(h);
		//int size=h.size();
		System.out.println(h.size());
		System.out.println(h.values());
		//Without Iterator
		//Collection<Integer>w=h.keySet();
		Collection<String> s=h.values();
		System.out.println(s);
		
		Set s1=h.entrySet();
		
		//With Iterator
	
               Iterator it= s1.iterator();
		
		while(it.hasNext()) {
			Map.Entry m1=(Map.Entry)it.next();	
			//m1.getValue();
			//System.out.println("The Student name is:" +m1.getKey() +" and subject is : "  +m1.getValue() );
			System.out.println("The Collection of values into Hashmap is:- " +m1.getValue());
					}
	
		
	}

}

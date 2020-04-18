package HashMap;

import java.util.HashMap;
import java.util.Set;

//Write a Java program to get a set view of the keys contained in this map.
public class HashMap_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		has11();
	}
	
	public static void has11() {
		HashMap<Integer, String> h=new HashMap<Integer, String>();
		h.put(0, "italy");
		h.put(1, "india");
		h.put(2, "iran");
		h.put(3, "iraq");
		h.put(4, "istanbul");
		System.out.println(h);
		int size=h.size();
		System.out.println(size);
		
		Set s=h.keySet();
		
		System.out.println("The Obtained KeySet from HashMap is:- " +s);
		
		
		System.out.println("The Obtained values from HashMap is:- " +h.values());
		
		
	}
	
	

}

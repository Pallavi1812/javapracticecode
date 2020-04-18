package HashMap;

import java.util.HashMap;

//Write a Java program to copy all of the mappings from the specified map to another map.

public class HashMap_3 {

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
		
		
		HashMap<Integer, String> h1=new HashMap<>();
		  h1=(HashMap<Integer, String>) h.clone();
		  System.out.println(h1);
		
		
	}

}

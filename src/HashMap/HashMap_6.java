package HashMap;

import java.util.HashMap;

//Write a Java program to get a shallow copy of a HashMap instance.
public class HashMap_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashmap6();
	}
	
	public static void hashmap6() {
		HashMap<Integer, String> h=new HashMap<>();
		h.put(0, "italy");
		h.put(1, "india");
		h.put(2, "iran");
		h.put(3, "iraq");
		h.put(4, "istanbul");
		System.out.println(h);
		int size=h.size();
		System.out.println(size);
		
		Object h1=h.clone();
		System.out.println(h1);
		
		
		
	}

}

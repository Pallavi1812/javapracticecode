package HashSet;

import java.util.HashSet;

//Write a Java program to test a hash set is empty or not.

public class HashSet_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emptyHashSet();
		notEmptyHashSet();
	}
	
	public static void emptyHashSet() {
		 
		 
		 HashSet h=new HashSet();
		 h.add(12);// ADDED values into the empty hashset
			h.add("singapore");
			h.add(13);
			h.add("france");
			h.add("Africa");
			h.add(13);
			
			System.out.println(h.isEmpty());
			
	}
	
	public static void notEmptyHashSet() {
		 
		 
		 HashSet h1=new HashSet();
	
			
			System.out.println(h1.isEmpty());
			
	}

}

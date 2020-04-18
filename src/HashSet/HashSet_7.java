package HashSet;

//Write a Java program to convert a hash set to an array. 

import java.util.HashSet;

public class HashSet_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayHashSet();
	}
	
	public static void arrayHashSet() {
		 
		 Object[] ar;
		 HashSet h=new HashSet();
		
		 h.add(12);// ADDED values into the empty hashset
			h.add("singapore");
			h.add(13);
			h.add("france");
			h.add("Africa");
			h.add(13);
			
		Object[] h1=h.toArray();
		System.out.println(h);
			
	}

}

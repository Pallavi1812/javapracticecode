package HashSet;

import java.util.HashSet;

// Write a Java program to clone a hash set to another hash set. 

public class HashSet_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cloneHashSet();
	}  
	
	 
	public static void cloneHashSet() {
		 
		 
		 HashSet h=new HashSet();
		 HashSet h1=new HashSet();
		 h.add(12);// ADDED values into the empty hashset
			h.add("singapore");
			h.add(13);
			h.add("france");
			h.add("Africa");
			h.add(13);
			
			h1= (HashSet) h.clone();
			
			
			System.out.println(h1);
	}
}

package HashSet;

import java.util.HashSet;

//Write a Java program to empty an hash set. 



public class HashSet_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iterateHashSet();
	}
      
	public static void iterateHashSet() {
		 
		 
		 HashSet h=new HashSet();
		 h.add(12);// ADDED values into the empty hashset
			h.add("singapore");
			h.add(13);
			h.add("france");
			h.add("Africa");
			h.add(13);
			
			System.out.println(h.remove(13));
			System.out.println(h);
			
	}
}

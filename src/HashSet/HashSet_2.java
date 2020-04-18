package HashSet;

import java.util.HashSet;
import java.util.Iterator;

//Write a Java program to iterate through all elements in a hash list. 

public class HashSet_2 {

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
			
			Iterator it=h.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
				
			}
		 
	}
	

}

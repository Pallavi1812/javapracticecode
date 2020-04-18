package HashSet;

import java.util.ArrayList;
import java.util.HashSet;

// Write a Java program to append the specified element to the end of a hash set.

public class HashSet_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashappend();
	}
	public static void hashappend() {   //Create a method of hashset 
		 
	
		
		
		HashSet h=new HashSet(); // Creating the empty hashset
		h.add(12);// ADDED values into the empty hashset
		h.add("singapore");
		h.add(13);
		h.add("france");
		h.add("Africa");
		System.out.println(h.add(13)); //it will print false
		
		System.out.println("The element added into the end of the hashset is: " +h);   // printing the hashset
		
	}

}

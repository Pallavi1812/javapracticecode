package HashSet;

import java.util.HashSet;

//Write a Java program to compare two sets and retain elements which are same on both sets. 

public class HashSet_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayHashSet();
	}
	
	public static void arrayHashSet() {
		 
		// Object[] ar;
		 HashSet h=new HashSet();
		
		 h.add("12");// ADDED values into the empty hashset
			h.add("singapore");
			h.add("13");
			h.add("france");
			h.add("Africa");
			h.add("13");
			
			//removing all the element oboolean b=h.removeAll(h);
			System.out.println(h);
			
			HashSet h1=new HashSet();
			h1.add("12");// ADDED values into the empty hashset
			h1.add("singapore");
			h1.add("20");
			h1.add("america");
			h1.add("Africa");
			h1.add("13");
			System.out.println(h1);
			boolean b=h.equals(h1);
			System.out.println(b);
			if(b==true) {
				System.out.println("Both the HashSets are totally equal");
				
			}
			else {
				System.out.println("Both the hashsets are not equal");
				h.retainAll(h1);
				System.out.println(h);
			   
			}
			
			
	}

}

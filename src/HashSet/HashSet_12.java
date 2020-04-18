package HashSet;

import java.util.HashSet;
import java.util.Iterator;

//Write a Java program to remove all of the elements from a hash set.

public class HashSet_12 {

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
			
			//removing all the element of hashSet in once
			boolean b=h.removeAll(h);
			//System.out.println(b);
			
			HashSet h1=new HashSet();
			h1.add("12");// ADDED values into the empty hashset
			h1.add("singapore");
			h1.add("13");
			h1.add("france");
			h1.add("Africa");
			//h1.add("13");
			
			//h1.remove("12"); //Always take into the form of object and must need to pass values into multiple quotes
			
			/*for(int i=0;i<h1.size();i++) {
				String d=h1.getClass();
				boolean b1=h1.remove(i);
				
				System.out.println(b1);
				
			}
			System.out.println(h1);*/
			Iterator it=h1.iterator();
			
			while(it.hasNext()) {
				String s=(String) h1.iterator().next();
				
				System.out.println(h1.remove(s));
				
			}
			
			//boolean b1=h1.remove(h1);
		//System.out.println(b1);
			
		/* it=h1.iterator();
		
			while(it.hasNext()) {
				System.out.println(it.next());
			
			}*/
			
			
			
			
			
	}

}

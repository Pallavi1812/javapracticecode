package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//Write a Java program to get the number of elements in a hash set. 

public class HashSet_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iterateHashSet();
	}
	
	public static void iterateHashSet() {
		
		int ar[]= {18,14,13};
	//	Collection c=
		 
		 
		 HashSet h=new HashSet();
		 HashSet h1=new HashSet();
		 ArrayList<String> a=new ArrayList();
		 a.add("12");
		 a.add("root");
		 
		 h.add(12);// ADDED values into the empty hashset
			h.add("singapore");
			h.add(13);
			h.add("france");
			h.add("Africa");
			h.add(13);
			
			h1.addAll(h);
			h1.addAll(a);
			
			
			
			Iterator it=h.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
				
			}
			
	}

}

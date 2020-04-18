package HashSet;

//Write a Java program to compare two hash set. 
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static <E> void convertHashSet() {
		 
		 HashSet h=new HashSet();
		 HashSet h1=new HashSet();
		
		 h.add(12);// ADDED values into the empty hashset
			h.add("singapore");
			h.add(13);
			h.add("france");
			h.add("Africa");
			h.add(13);
			
			System.out.println(h);
			
			h1.add(12);// ADDED values into the empty hashset
			h1.add("singapore");
			h1.add(13);
			h1.add("france");
			h1.add("Africa");
			h1.add(13);
			System.out.println(h1);
			
			
			boolean b=h.equals(h1);
			System.out.println("The boolean result after comparining both the hashsets:" +b);
			
	}

}

package HashSet;

// Write a Java program to convert a hash set to a tree set. 



import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_8 {

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
			
			Set<String> hashSetToTreeSet = new TreeSet<String>(h); //Converting the hashset into treeSet with the help of set
			for(String s:hashSetToTreeSet) {
				System.out.println("The converted tree set from hashset is:" +s);
			}
			
			
			
	}

}

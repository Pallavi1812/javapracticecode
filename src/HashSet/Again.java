package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> h1=new HashSet<String>();
		h1.add("12");// ADDED values into the empty hashset
		h1.add("singapore");
		h1.add("13");
		h1.add("france");
		h1.add("Africa");
		
		Iterator it=h1.iterator();
		System.out.println(h1);
		
		while(it.hasNext()) {
					
			h1.remove(it.next());
			
			
			
		}
		System.out.println(h1);
	}

}

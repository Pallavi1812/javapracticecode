package HashSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class map1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		HAS();
	}
	
	public static String Buffermethod() throws NumberFormatException, IOException {
		BufferedReader B=new BufferedReader(new InputStreamReader(System.in));
	//	System.out.println("Please provide your key");
		String value=B.readLine();
		return value;
		
		}
	
	public static void HAS() throws NumberFormatException, IOException {
		HashMap<String, String> m=new HashMap<String, String>(3,(float) 0.75);
		for(int i=0;i<2;i++) {
			System.out.println("Please provide your student name");
			String key=Buffermethod();
			System.out.println("Please provide your Subject");
			String val=Buffermethod();
			m.put(key, val);
		}
				Set s1=m.entrySet();
		System.out.println(s1);
		
		Iterator it=s1.iterator();
		
		while(it.hasNext()) {
			Map.Entry m1=(Map.Entry)it.next();			
			System.out.println("The Student name is:" +m1.getKey() +" and subject is : "  +m1.getValue() );
					}
		
	
		
		
		
		
	}

}

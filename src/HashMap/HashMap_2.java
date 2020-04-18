package HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Write a Java program to count the number of key-value (size) mappings in a map.

public class HashMap_2 {
	
	static BufferedReader B=new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		HAS10();
	}
	
	public static  String Buffermethod(String input) throws NumberFormatException, IOException {
		System.out.println(input);
		String value=B.readLine();
		return value;
		
		}
	
	public static int Buffermethod1(String input) throws NumberFormatException, IOException {
		System.out.println(input);
		int value=Integer.parseInt(B.readLine());
		return value;
		
		}
	
	public static void HAS10() throws NumberFormatException, IOException {
		HashMap<Integer, String> m=new HashMap<Integer, String>(3,(float) 0.75);
	//	HashMap<> m=new HashMap<>(3,(float) 0.75);
		for(int i=0;i<2;i++) {
			int key=Buffermethod1("Please provide your Employee id");
			String val=Buffermethod("Please provide your employee name");
			m.put(key, val);
			
		}
		Set s1=m.entrySet();
		System.out.println(s1);
		int count=s1.size();
		System.out.println(count);
		
         
}
	
	public static void HAS100() throws NumberFormatException, IOException {
		HashMap m=new HashMap(2,(float) 0.75);
	//	HashMap<> m=new HashMap<>(3,(float) 0.75);
		for(int i=0;i<2;i++) {
			String key=Buffermethod("Please provide your Employee id");
			String val=Buffermethod("Please provide your employee name");
			m.put(key, val);
			
		}
		Set s1=m.entrySet();
		System.out.println(s1);
		int count=s1.size();
		System.out.println(count);
		
         
}
}
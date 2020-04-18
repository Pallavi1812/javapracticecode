package HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.lang.model.element.Element;

//Write a Java program to get the value of a specified key in a map.

public class HashMap_10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		HAS10();
	}
	
	public static  String Buffermethod() throws NumberFormatException, IOException {
		BufferedReader B=new BufferedReader(new InputStreamReader(System.in));
	//	System.out.println("Please provide your key");
		String value=B.readLine();
		return value;
		
		}
	
	public static void HAS10() throws NumberFormatException, IOException {
		HashMap<String, String> m=new HashMap<String, String>(3,(float) 0.75);
	//	HashMap<> m=new HashMap<>(3,(float) 0.75);
		for(int i=0;i<2;i++) {
			System.out.println("Please provide your Employee id ");
			String key=Buffermethod();
			System.out.println("Please provide your employee name");
			String val=Buffermethod();
			m.put(key, val);
			
		}
		System.out.println(m);
		Set s1=m.entrySet();
		for(int j=0;j<s1.size();j++) {
			String val1=(String)m.get(j);
			System.out.println(val1);
			System.out.println("Value for key "  +j +" is:- " + val1);
		}
		


	}}

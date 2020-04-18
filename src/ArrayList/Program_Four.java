package ArrayList;

import java.util.ArrayList;

//Write a Java program to retrieve an element (at a specified index) from a given array list.  
public class Program_Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		retrieveAnElement();
	}
	
	public static void retrieveAnElement() {
		
		ArrayList<String> list=new ArrayList<>();
		list.add("Italy");
		list.add("India");
		list.add("Istanbul");
		list.add("Iran");
		list.get(1);
		
		System.out.println(list.get(1));
		
	}

}

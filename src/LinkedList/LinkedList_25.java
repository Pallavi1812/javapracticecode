package LinkedList;

import java.util.LinkedList;

public class LinkedList_25 {
	
	// Write a Java program to test an linked list is empty or not. 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testAnElement();

	}
	
	public static void testAnElement() {
		
		boolean b= true;
		LinkedList<String> list=new LinkedList<>();
		list.add("Pink");
		list.add("Black");
		list.add("Blue");
		list.add(2, "Red");
		list.set(2, "Orange"); 
		 b=list.isEmpty();
		System.out.println(b);

	}
}

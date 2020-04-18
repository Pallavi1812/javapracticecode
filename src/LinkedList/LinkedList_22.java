package LinkedList;

import java.util.LinkedList;

//Write a Java program to check if a particular element exists in a linked list. 
public class LinkedList_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convertIntoArray();
	}
	
	public static void convertIntoArray() {
		LinkedList  <String> list=new LinkedList<>();
		
		list.add("Italy");
		list.add("India");
		list.add("Istanbul");
		list.add("Iran");
		
		boolean b=list.contains("Ita");
		System.out.println(b);
		
	}

}

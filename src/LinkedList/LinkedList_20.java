package LinkedList;

import java.util.LinkedList;

// Write a Java program to retrieve but does not remove, the first element of a linked list. 

public class LinkedList_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		retrievefromArray();

	}
	public static void retrievefromArray() {
		LinkedList  <String> list=new LinkedList<>();
		
		list.add("Italy");
		list.add("India");
		list.add("Istanbul");
		list.add("Iran");
		
		
		System.out.println(list.getFirst());
		
		
	}

}

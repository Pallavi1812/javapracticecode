package LinkedList;

import java.util.LinkedList;

public class LinkedList_26 {
	
	//Write a Java program to replace an element in a linked list. 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceAnElement();

	}
	
	public static void ReplaceAnElement() {
		LinkedList<String> list=new LinkedList<>();
		list.add("Pink");
		list.add("Black");
		list.add("Blue");
		list.add(2, "Red");
		list.set(2, "Orange");
		
		System.out.println(list);
	}

}

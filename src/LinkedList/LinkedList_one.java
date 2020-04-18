package LinkedList;

import java.util.LinkedList;

// Write a Java program to append the specified element to the end of a linked list.

public class LinkedList_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> list=new LinkedList<>();
		list.addLast(7);
		list.add(2);
		list.addLast(4);
		list.add(3);
		list.addFirst(5);
		
		System.out.println(list);
		//5, 2,3,7,4
		

	}
	


}

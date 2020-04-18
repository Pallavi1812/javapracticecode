package LinkedList;

import java.util.LinkedList;

//Write a Java program to join two linked lists.  
public class LinkedList_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		join();

	}

	public static void join() {
		LinkedList  <String> list=new LinkedList<>();
		LinkedList  <String> list1=new LinkedList<>();
		
		list.add("Italy");
		list.add("India");
		list.add("Istanbul");
		list.add("Iran");
		
		list1.add("America");
		list1.add("Africa");
		list1.add("Antartica");
		
	    list.addAll(list1);
	    
	    System.out.println(list);
		
		
		
	
		
	}

}

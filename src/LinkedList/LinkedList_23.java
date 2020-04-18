package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Write a Java program to convert a linked list to array list.

public class LinkedList_23 {

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
		
		List<String> list1 = new ArrayList<String>(list);
		
		for(String s:list1) {
			System.out.println(s);
			
		}
		
		
		
	}

}

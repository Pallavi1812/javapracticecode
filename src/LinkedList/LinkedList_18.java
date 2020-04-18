package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

//Write a Java program to clone an linked list to another linked list. 
public class LinkedList_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clone();
	}
	
	public static void Clone() {
		LinkedList  <String> list=new LinkedList<>();
		
		
		list.add("Italy");
		list.add("India");
		list.add("Istanbul");
		list.add("Iran");
		
		
		LinkedList<String> arrayListClone =  (LinkedList<String>) list.clone();
		System.out.println(arrayListClone);
	
		
	}

}

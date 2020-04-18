package LinkedList;


import java.util.LinkedList;

public class LinkedList_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompareTwoLists();
	}
	//Write a Java program to compare two linked lists.
	public static void CompareTwoLists() {
		LinkedList  <String> list=new LinkedList<>();
		LinkedList  <String> list1=new LinkedList<>();
		
		list.add("Italy");
		list.add("India");
		list.add("Istanbul");
		list.add("Iran");
		
		list1.add("America");
		list1.add("Africa");
		list1.add("Australia");
		list1.add("Antartica");
		
		boolean b=list.equals(list1);
		System.out.println(b);
	}

}

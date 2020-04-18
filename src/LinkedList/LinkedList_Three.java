package LinkedList;

import java.util.LinkedList;

//. Write a Java program to iterate through all elements in a linked list starting at the specified position. 

public class LinkedList_Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList<Integer> list=new LinkedList<>();
		
		int c = 0;
		for(int i=0;i<5;i++) {
			 c=2*i;
			 list.add(i, c);
			
			
		}
		System.out.println(list);

	}

}

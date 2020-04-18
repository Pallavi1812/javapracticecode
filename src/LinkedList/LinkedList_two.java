package LinkedList;

import java.util.LinkedList;

//Write a Java program to iterate through all elements in a linked list. 

public class LinkedList_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<>();
		
		int c = 0;
		for(int i=0;i<5;i++) {
			 c=2*i;
			 list.add(c);
			
		}
		
		System.out.println(list);
		reverseOrder();
		
		

	}




/*    Question:- Write a Java program to iterate a linked list in reverse order.
 *    Description:- 
 * 
 * 
 * 
	*/
       public static void reverseOrder() {
    	   LinkedList<Integer> list=new LinkedList<>();
   		
   		int c = 0;
   		for(int i=0;i<5;i++) {
   			 c=2*i;
   			 
   			 list.addLast(c);
   			 list.descendingIterator();
   			
   		}
   		System.out.println(list);
	
}}

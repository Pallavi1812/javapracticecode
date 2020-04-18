package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

//Write a Java program to remove the third element from a array list

public class Program_Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//removeTheThirdElement();
		//searchAnElement();
		//sortAnElement();
		//CopyArrayList();
		//shuffleAnElement();
		//CompareArraylist();
		//joinArraylist();
		//emptythearraylist();
		//checkemptythearraylist();
		//increasesize();
		replaceelement();
	}
	
	//Write a Java program to replace the second element of a ArrayList with the specified element.
	public  static void replaceelement() {
		ArrayList<String> list=new ArrayList<>();
		list.add("Italy");
		list.add("India");
		list.add("Istanbul");
		list.add("Iran");
		
	    //Collections.replaceAll(list, "India", "France");
	    System.out.println( Collections.replaceAll(list, "India", "France"));
	    
	}
	
	//Write a Java program to increase the size of an array list.
	public  static void increasesize() {
		ArrayList<String> list=new ArrayList<>();
		list.add("Italy");
		list.add("India");
		list.add("Istanbul");
		list.add("Iran");
		
	System.out.println(list.size());
	//System.out.println();
//	System.out.println(list.ensureCapacity(String));
	}
	
	
	//Write a Java program to test an array list is empty or not.
	public  static void  checkemptythearraylist() {
		ArrayList<String> list=new ArrayList<>();
		list.add("Italy");
		list.add("India");
		list.add("Istanbul");
		list.add("Iran");
		
		boolean b=list.removeAll(list);
		System.out.println(b);
	}
	
	//Write a Java program to empty an array list.
	public  static void  emptythearraylist() {
		ArrayList<String> list=new ArrayList<>();
		list.add("Italy");
		list.add("India");
		list.add("Istanbul");
		list.add("Iran");
		
		list.removeAll(list);
		System.out.println(list);
	}
	
	
	public  static void  removeTheThirdElement() {
		ArrayList<String> list=new ArrayList<>();
		list.add("Italy");
		list.add("India");
		list.add("Istanbul");
		list.add("Iran");
		
		System.out.println(list.remove(2));
	}
	
	//Write a Java program to search an element in a array list.  
	public  static void  searchAnElement() {
		ArrayList<String> list=new ArrayList<>();
		list.add("Italy");
		list.add("India");
		list.add("Istanbul");
		list.add("Iran");
		
		System.out.println(list.get(3));
	}
	
	//Write a Java program to sort a given array list. 
	public  static void  sortAnElement() {
		ArrayList<String> list=new ArrayList<>();
		list.add("Italy");
		list.add("India");
		list.add("Istanbul");
		list.add("Iran");
		
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}
	
	//Write a Java program to copy one array list into another. 
	public  static void  CopyArrayList() {
		ArrayList<String> list=new ArrayList<>();
		list.add("Italy");
		list.add("India");
		list.add("Istanbul");
		list.add("Iran");
		System.out.println(list);
		 ArrayList<String> arrayListClone =  (ArrayList<String>) list.clone();
         
	        System.out.println(arrayListClone);   
		
		
	}
	
	//Write a Java program to shuffle elements in a array list. 
	public  static void  shuffleAnElement() {
		ArrayList<String> list=new ArrayList<>();
		list.add("Italy");
		list.add("India");
		list.add("Istanbul");
		list.add("Iran");
		
		Collections.shuffle(list);
		System.out.println(list);
		
		
		Collections.shuffle(list, new Random());
		
		System.out.println(list);
	}
	
	//Write a Java program to extract a portion of a array list.  
	public static void extractAportion() {
		ArrayList<String> list=new ArrayList<>();
		list.add("Italy");
		list.add("India");
		list.add("Istanbul");
		list.add("Iran");
		
		//System.out.println(list.get(2));
		list.subList(1, 2);
	}
	
	//Write a Java program to compare two array lists.  
	public  static void  CompareArraylist() {
		ArrayList<String> list=new ArrayList<>();
		list.add("Italy");
		list.add("India");
		list.add("Istanbul");
		list.add("Iran");
		ArrayList<String> list1=new ArrayList<>();
		list1.add("America");
		list1.add("Africa");
		list1.add("Australia");
		list1.add("Antartica");
		
	 
		
		boolean b=list.equals(list1);
		System.out.println(b);
		
	}
	
	//Write a Java program of swap two elements in an array list. 
	
	public  static void  swapArraylist() {
		ArrayList<String> list=new ArrayList<>();
		list.add("Italy");
		list.add("India");
		list.add("Istanbul");
		list.add("Iran");
		ArrayList<String> list1=new ArrayList<>();
		list1.add("America");
		list1.add("Africa");
		list1.add("Australia");
		list1.add("Antartica");
	
	}
	
	//Write a Java program to join two array lists.  
	public  static void  joinArraylist() {
		ArrayList<String> list=new ArrayList<>();
		list.add("Italy");
		list.add("India");
		list.add("Istanbul");
		list.add("Iran");
		ArrayList<String> list1=new ArrayList<>();
		list1.add("America");
		list1.add("Africa");
		list1.add("Australia");
		list1.add("Antartica");
		
		list.addAll(list1);
		System.out.println(list);
	}
}

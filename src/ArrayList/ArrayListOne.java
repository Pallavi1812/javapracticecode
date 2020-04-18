package ArrayList;

import java.util.ArrayList;

//Write a Java program to create a new array list, add some colors (string) and print out the collection. 
public class ArrayListOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddColour();
	}
	
	public static void AddColour() {
		ArrayList<String> list=new ArrayList<>();
		
		list.add("RED");
		list.add("White");
		list.add("Black");
		list.add("White");
		list.add("Blue");
		list.add("Brown");
	
		
		System.out.println(list);
		System.out.println(list.size());
	}

}

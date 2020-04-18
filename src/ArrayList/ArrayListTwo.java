package ArrayList;

import java.util.ArrayList;

import javax.lang.model.element.Element;



//Write a Java program to insert an element into the array list at the first position.
public class ArrayListTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertAnElement();
		
	}
	
	public static void insertAnElement() {
		ArrayList<String> list=new ArrayList<>();
		
		list.add(0,"train");
		
		for(String i:list) {
			System.out.println(i);
			
		}
		
	}

}

package ArrayList;

import java.util.ArrayList;

//Write a Java program to update specific array element by given element.  
public class ArrayListThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<>();
		list.add("Italy");
		list.add("America");
		list.add("India");
		list.add(1, "Africa");
		
		for(String i:list) {
			System.out.println(i);
		}
				

	}

}

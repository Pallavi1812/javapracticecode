package ArrayList;

import java.util.ArrayList;

//Write a Java program to iterate through all elements in a array list.  
public class Program_Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iterateAllElements();
	}
	
	public static void iterateAllElements() {
		ArrayList<Integer> list=new ArrayList<>();
		
		for(int i=0;i<=10;i++) {
			list.add(i);
			System.out.println(list);
			
			//for(int s:list) {
				//System.out.println(s);
			//	
			//}
			
		}
	}

}

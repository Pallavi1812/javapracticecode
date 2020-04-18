package Number_System;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Integer_store {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		
		storeIntoArray();
		//userInput();
	}
	
	public static int userInput() throws NumberFormatException, IOException {
		BufferedReader B=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Provide your value");
		int value=Integer.parseInt(B.readLine());
		return value;	
	}
	
	public static void storeIntoArray() throws NumberFormatException, IOException {
		
		 int a,i;
		 int array[]=new int[10];
		 for(i=0;i<array.length;i++) {
			
			 a= userInput();
			// System.out.println(a);
			 array[i]=a;
		 }
			for(i=0;i<array.length;i++) {
				System.out.println(array[i]);
				
			}
			
	}
		
		}
	
	
	   



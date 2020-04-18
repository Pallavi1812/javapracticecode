package Number_System;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayIntegerInput {
	
	//Take 10 integer inputs from user and store them in an array. Again ask user to give a number.
	//Now, tell user whether that number is present in array or not.

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		comaprison();
	}
	
	public static int buffer() throws NumberFormatException, IOException {
	BufferedReader B=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Please provide integer value");
	int value=Integer.parseInt(B.readLine());
	//System.out.println(value);
	return value;
	}

	
	static void comaprison() throws NumberFormatException, IOException {
		int ar[]=new int [5];
		//int a=buffer();
		int i;
		 
		for( i=0;i<5;i++) {
			 ar[i]=buffer();
			
			//System.out.println("{");
			System.out.println(ar[i] );
			
		}
		int c=buffer();
		System.out.println(c);
		for(int j=0;j<ar.length;j++) {
		if(c==ar[j]) {
			System.out.println("Number is present into an array");
			
		}
		else {
			System.out.println("Number is not present into an array");
		}
		//return (ar[i]);
		
	}
}
}
//package OOPS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StoreIntoArray extends B1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int a[]=new int[5];
		
		B1 b1=new B1();
		//int j;
		
		for(int j=0;j<a.length;j++) {
			
			int i=b1.IntegerInput("Please provide your value");
			a[j]=i;
			
			
			
			
		}
		System.out.println(Arrays.toString(a));
		
		
		

	}

}

 class B1 {
	
	public int IntegerInput(String input) throws NumberFormatException, IOException {
		BufferedReader B=new BufferedReader(new InputStreamReader(System.in));
		System.out.println(input);
		int value=Integer.parseInt(B.readLine());
		return value;
		
		
	}

	

}



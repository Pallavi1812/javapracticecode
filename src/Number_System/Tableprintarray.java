package Number_System;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tableprintarray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int s =buffer();
		int d[]= forloop(s);
		again(d);
		
		//buffer();
		}
	
	static int buffer() throws NumberFormatException, IOException {
		BufferedReader B=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please provide your value");
		int a=Integer.parseInt(B.readLine());
		return a;
	}
	
	static int[] forloop(int a) {
		int tablevalue[]=new int[11];
		for(int i=1;i<=10;i++) {
			int c=a*i;
			tablevalue[i]=c;
		}
		return tablevalue;
	}
	
	static void again(int tablevalue[]) {
		for (int j=1;j<tablevalue.length;j++) {
			System.out.println(tablevalue[j]);
			
		}
		//return tablevalue;
	}
}
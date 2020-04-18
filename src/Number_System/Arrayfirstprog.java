package Number_System;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrayfirstprog {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int tablevalue[]=new int[11];
		BufferedReader B=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please provide your value");
		int a=Integer.parseInt(B.readLine());
		for(int i=1;i<=10;i++) {
			int c=a*i;
			tablevalue[i]=c;
		}

		for (int j=1;j<tablevalue.length;j++) {
			
			System.out.println(tablevalue[j]);
		}
		
		
	}

}

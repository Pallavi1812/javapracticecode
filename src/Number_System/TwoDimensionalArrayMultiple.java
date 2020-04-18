package Number_System;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDimensionalArrayMultiple {

	static BufferedReader B=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//table(a[i],b[j]);
		table();
	}
	
	static int userinput() throws NumberFormatException, IOException {
		System.out.println("Please provide your first value");
		int value=Integer.parseInt(B.readLine());
		return value;
	}

	
	static void table() throws NumberFormatException, IOException {
		int table[][]= new int [2][11];
		
		int a =userinput();
		int b =userinput();
		
		for (int i =0;i<=10;i++) {
			table[0][i]=a*i;
			
		}
		for (int j =0;j<=10;j++) {
			table[1][j]=b*j;	
		}
		System.out.print("{");
		for (int l =0;l<11;l++) {
			/*
			for (int m =0;m<table[l].length;m++) {
				
				System.out.println(table[l][m]); [66,88,66,88,99,99,8]
			}*/
			
			//System.out.println(table[0][l]*table[1][l]);
			System.out.print(table[0][l]*table[1][l]+",");
			
		}
		
		System.out.print("}");
		
		
		
	}
	
	}

	
		
	
	
	



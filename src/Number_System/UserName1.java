package Number_System;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserName1 {
	String g;
	String h;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		storeInArray();
	}
	
	static void userInput() throws NumberFormatException, IOException {
		Scanner S2=new Scanner(System.in);
        System.out.println(S2);
        String input2 = S2.nextLine();
		storeInArray(input2);
		
	}
	
	static String storeInArray(String a) {
		String ar[][][]=new String [1][2][2];
		for(int i=0;i<ar.length;i++) {
			System.out.println("Enter your first name");
			 String e=a;
			System.out.println(e);
			
			System.out.println("Enter your last name");
		     String f=a;
			System.out.println(f);
			
		}
		return ();
		
		
	}

}

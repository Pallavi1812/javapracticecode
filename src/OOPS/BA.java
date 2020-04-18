package OOPS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BA {
	
	public static int IntegerInput(String input) throws NumberFormatException, IOException {
		BufferedReader B=new BufferedReader(new InputStreamReader(System.in));
		System.out.println(input);
		int value=Integer.parseInt(B.readLine());
		return value;
		
		
	}

	

}



package OOPS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Abstract_Practice {

	public static void main(String[] args) throws NumberFormatException, IOException {
		SelectionThroughBufferReader();
		

	}
	static void SelectionThroughBufferReader() throws NumberFormatException, IOException {
   	 BufferedReader B=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 1 for username" +"\n"+ "Enter 2 for OTP" +"\n"+ "Enter 3 for Passkey" );
		int value=Integer.parseInt(B.readLine());
		declareMethods dm= new defineMethods();
		
		 if(value==1) {
   		 B=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Provide your username");
			String username=B.readLine();
			dm.provideValue(username);
			
			
			
		}
		else if(value==2) {
			B=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Provide your OTP");
			int OTP=Integer.parseInt(B.readLine());
			dm.provideValue(OTP);
		}
		else if(value==3) {
			B=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Provide your passkey");
			float passkey=Float.parseFloat(B.readLine());
			dm.provideValue(passkey);
		}
		else{
			dm.provideValue();
		}
    }
	
	
}
	
	


abstract class declareMethods{
	
	static void provideValue() {
		System.out.println("Please open your bank account");
		}
	
	abstract void provideValue(String username);
	abstract void provideValue(int OTP);
	abstract void provideValue(float passkey);
}




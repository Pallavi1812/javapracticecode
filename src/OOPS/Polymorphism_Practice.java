package OOPS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Polymorphism_Practice extends SBI {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		SelectionThroughBufferReader();
	}

     static void provideValue(String username) {
    	 System.out.println("Login with Username successfully");
    	 
     }
     
       static void provideValue(int OTP) {
    	   System.out.println("Login with OTP successfully");
    	 
     }

        static void provideValue(float passkey) {
        	 System.out.println("Login with passkey successfully");
	 
          }
        
       //static void provideValue() {
        //	System.out.println("Please open your bank account");
      //  }
     
     
        static void SelectionThroughBufferReader() throws NumberFormatException, IOException {
    	 BufferedReader B=new BufferedReader(new InputStreamReader(System.in));
 		System.out.println("Enter 1 for username" +"\n"+ "Enter 2 for OTP" +"\n"+ "Enter 3 for Passkey" );
 		int value=Integer.parseInt(B.readLine());
 		
 		 if(value==1) {
    		 B=new BufferedReader(new InputStreamReader(System.in));
 			System.out.println("Provide your username");
 			String username=B.readLine();
 			provideValue(username);
 			
 			
 			
 		}
 		else if(value==2) {
 			B=new BufferedReader(new InputStreamReader(System.in));
 			System.out.println("Provide your OTP");
 			int OTP=Integer.parseInt(B.readLine());
 			provideValue(OTP);
 		}
 		else if(value==3) {
 			B=new BufferedReader(new InputStreamReader(System.in));
 			System.out.println("Provide your passkey");
 			float passkey=Float.parseFloat(B.readLine());
 			provideValue(passkey);
 		}
 		else{
 			provideValue();
 		}
     }
	
	
}

      class SBI{
	static void provideValue() {
		System.out.println("Please open your SBI account for better transactions");
	}
}


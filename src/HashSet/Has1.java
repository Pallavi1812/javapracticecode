package HashSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Has1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Hash1();
	}
	public static int Buffermethod() throws NumberFormatException, IOException {
		BufferedReader B=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please provide your value");
		int value=Integer.parseInt(B.readLine());
		return value;
	}
	
	/*public static void Hash() throws NumberFormatException, IOException {
		HashSet h=new HashSet();
		int c;
		boolean f=true;
		
		while(f==true) {
			c=Buffermethod();
			//System.out.println(c);
			
			boolean f1=h.add(c);
			System.out.println(c);
			
			if(f1==false) {
				f1=f;
				System.out.println("You entered a duplicate value");
				break;
				
			}
			else {
				
				System.out.println("Your value is as per expectation");
			}
		
			
		}
		
		
	}
    */
	
	public static void Hash1() throws NumberFormatException, IOException {
		HashSet h1=new HashSet();
		int c;
		boolean f=true;
		
		while(f==true) {
			c=Buffermethod();
			//System.out.println(c);
			
			boolean f1 = false;
			
			
			if(f1==false) {
				f1=f;
				System.out.println("You entered a duplicate value");
				break;
				
			}
			else {
				h1.add(c);
				System.out.println(c);
				System.out.println("Your value is as per expectation");
			}
		
			
		}
		
		
	}
}

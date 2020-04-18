package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Buffer_Reader {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		// TODO Auto-generated method stub
		//int g = 0;
		Buffermethod();  //Call the Buffered Method
		

	}
	
	//Create a method in which taking value from user 
	public static void Buffermethod() throws NumberFormatException, IOException {
		BufferedReader B=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please provide your value for Comparison");
		int value=Integer.parseInt(B.readLine());
		loop(value);
		
	}//method closed Buffermethod
	
	//Create a method in which using nested if for value comparison
	public static void loop(int K) throws NumberFormatException, IOException {
		
		
		//while(C==false) {
			if(K<10) {
				for(int j = 1;j<=10;j++) {
					int s=j*K;
					System.out.println(s);
				}}
				
				else if(K==10) {  //User provide equal value then will come in this loop
					System.out.println("Please provide a value less than 10");
					Buffermethod();
					
				}
				else if(K>10) {   //user provide greater value from then will come in this loop
					System.out.println("Not accepting this value! Please provide a value less than 10");
					Buffermethod();
					
				}
				
				
			}	     
		}  //Program Closed


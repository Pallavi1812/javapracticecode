package random_number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class rand {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		puzzle();

	}
	
	public static int random() {
		Random rand=new Random();
		int randomnumber= rand.nextInt(50);
		System.out.println(randomnumber);
		return randomnumber;
		//comparison(Value);
		
	}
	
	public static int Userinput() throws NumberFormatException, IOException {
		c
		//comparison(value1);
	
		}
	
	public static void comparison(int randomnumber, int guessnumber ) throws NumberFormatException, IOException {
		boolean S=false;
		
		   while(S==false) {
			   
		 Userinput();
			if(randomnumber==guessnumber) {
				System.out.println("you have guessed a correct number");
				S=true;
			}
			
			
				
			else if (randomnumber>guessnumber){
				System.out.println("Please select a bigger value ");
				//Userinput();
				 do {
				
					if(randomnumber==guessnumber) {
						System.out.println("you have guessed a correct number");
						S=true;
					}
					else if(randomnumber<guessnumber) {
						Userinput();
						System.out.println("Please select a smaller value");
				     }
					else if (randomnumber>guessnumber){
						Userinput();
						
						System.out.println("Please select a bigger value ");
					}
				 }
				 while(randomnumber!=guessnumber);
				 System.out.println("Number still not matched");
					
				 
					 
				} 
				 
			
			else if(randomnumber<guessnumber) {
				
				
					System.out.println("Please select a smaller value");
					while(S=false) {
						Userinput();
					}
				
				    
				
			
				
				}
		   }
		}
		
			
			
			
		
		
			
		
			
		
			
		
	
	
	private static void While(boolean b) {
		// TODO Auto-generated method stub
		
	}

	public static void puzzle() throws NumberFormatException, IOException {
		 int a=random();
		 int b=Userinput();
		 comparison(a,b);
	}
	}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AList {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		userInput();
	}
	
	public static int Buffermethod() throws NumberFormatException, IOException {
		BufferedReader B=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please provide your value");
		int value=Integer.parseInt(B.readLine());
		return value;
	}
	
	public static void userInput() throws NumberFormatException, IOException {
		int ar;
		ArrayList<Integer> list= new ArrayList();
	//	boolean b=false;
		
		
		for (int i=0;i<=10;i++) {
					  ar=Buffermethod();
					  list.add(ar);
					  
					  if(ar>100) {     //exception handling
						  //list.add(ar);
						  break;  //Out from the if loop if condition didn't match
						  
					  }
					 
				
				}
			
			for(Integer a:list) {      //For each loop
			System.out.println(a);     // Printing the values 
			
		}
		
		
	  
		
			}
	
	

}

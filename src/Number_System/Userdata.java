package Number_System;

import java.util.Scanner;

public class Userdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//userinput();
		storeIntoArray();
	}

	
	static String userValue(String h) {
		Scanner S2=new Scanner(System.in);
        System.out.println(h);
        String input2 = S2.nextLine();
		return input2;
		
	}
	
	
	
	
	
	static void storeIntoArray() {
		String array[][][]= new String[1][3][3];
		//String array[][][]= new String[i][j][k];
		for (int i=0;i<array.length;i++) {
		    
		     for (int j=0;j<array[i].length;j++) {
					
					for (int k=0;k<array[i][j].length;k++) {
						  if(k==0) {
							  array[i][j][k]= userValue("Enter a user name");  
						  }
						  
						  else if(k==1) {
							  array[i][j][k]= userValue("Enter a place of birth");  
						  }
						  else if(k==2) {
							  array[i][j][k]= userValue("Enter a date of birth");  
						  }
						  
					
					}
					
				}
			
		}
		
		for (int i=0;i<array.length;i++) {
		    
		     for (int j=0;j<array[i].length;j++) {
		    	 for (int k=0;k<array[i][j].length;k++) {
					
		    	 System.out.println(array[i][j][k]);
						  
					
					}
					
				}
			
		}
		
		
		
		 
	}

}

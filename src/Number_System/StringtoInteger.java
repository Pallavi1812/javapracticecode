package Number_System;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringtoInteger {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		String a="13443";
		int g=167;
		int b=Integer.parseInt(a);
		System.out.println(b);
		
		int c=Integer.parseUnsignedInt(a);
		System.out.println(c);
		bufferreader();
		String k=Integer.toBinaryString(g);
		System.out.println(k);
		String d=Integer.toOctalString(g);
		System.out.println(d);
		
		

	}
	
	 static void bufferreader() throws NumberFormatException, IOException {
		 BufferedReader B=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Provide any octal number");
		 int octalnum=Integer.parseInt(B.readLine());
		 octdec(octalnum);
	 }
	 
	 public static void octdec(int f) {
		
	 }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LinkedList_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		PrintValues();
	}

	
	public static int Buffermethod() throws NumberFormatException, IOException {
		BufferedReader B=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please provide your value");
		int value=Integer.parseInt(B.readLine());
		return value;
		
	}
	
	public static void PrintValues() throws NumberFormatException, IOException {
		
		LinkedList<Integer> list=new LinkedList<>();
		for(int i=0;i<=10;i++) {
			int value1=Buffermethod();
			list.add(value1);
		
			
		}
		System.out.println("The first value is"+ list.getFirst());
		System.out.println("The Last value is"+ list.getLast());
			
		}
	}
		


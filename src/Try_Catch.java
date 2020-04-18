import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Try_Catch {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		TryCatch1();
	}
	
	public static int Buffermethod(String input) throws NumberFormatException, IOException {
		BufferedReader B=new BufferedReader(new InputStreamReader(System.in));
		System.out.println(input);
		int value=Integer.parseInt(B.readLine());
		return value;
		
		
	}
	
	public static void TryCatch1() throws NumberFormatException, IOException {
		int a=Buffermethod("Please provide your first value");
		
		int b=Buffermethod("Please provide your second value");
		
		try {
			  int s=a*b;
			 System.out.println(s/0);
		}
		catch(Exception e) {
			 System.out.println(e);
		}
		
		
		
	}

}

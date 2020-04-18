package Collections_Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetPractice {

public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
MyMethod();
}

// Take User Input 
static void MyMethod() throws IOException {
HashSet<String> h = new HashSet();
boolean flag = true;
String b, c;
while (flag == true) {
System.out.println("While Block value: " + flag);
InputStreamReader r = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(r);
System.out.println("Please enter Value: ");
String a = br.readLine();

if (h.contains(a)) {
System.out.println("You have entered duplicate value.");
System.out.println("Dou you want to enter next value? Enter 1 (Yes) or 0(No):");
InputStreamReader r1 = new InputStreamReader(System.in);
BufferedReader br1 = new BufferedReader(r1);
//Integer.parseInt(br1.readLine());
b=br1.readLine();
//b = Integer.parseInt(br1.readLine());
System.out.println("Value of b: " + b);
c = "Yes";
         if(b.matches(c)) {
        	 flag = false;
System.out.println("If block change: " + flag);

}
    else {
    flag = true;
     System.out.println("Else block change: " + flag);
     }
      } else {
   System.out.println("vjhbfken");
    h.add(a);
}
}
}
}

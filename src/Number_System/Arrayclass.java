package Number_System;

public class Arrayclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[5];
		String b[]=new String[5];
		
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		
		
		b[0]="Pallavi";
		b[1]="Raj";
		b[2]="Vineet";
		b[3]="Pallavi1";
		b[4]="Pallavi2";
		
		for(int i=0;i<b.length;i++) {
			System.out.println("The details of employee is:" + b[i]+"="+a[i]);

		}
		
	}

}

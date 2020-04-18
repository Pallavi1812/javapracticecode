package OOPS;

public class Inheritance_1 extends B  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B i=new B();
		i.m1();
		i.m2();
	}
	
	

}
class B{
public static void m1() {
	System.out.println("Learning Inheritance");
}

public static void m2() {
	int a=2;
	int b=a*10;
	System.out.println(b);
}}
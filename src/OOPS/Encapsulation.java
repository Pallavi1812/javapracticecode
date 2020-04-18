package OOPS;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account2 a=new Account2();
		System.out.println(a.getS1());
		System.out.println(a.setS1("500"));

	}

}


class Account{
	private int balance= 200;
	
	public int getbalance() {
		
		return balance;
		
	}
	
	public int setbalance(int amount) {
		this.balance=this.balance+amount;
		return balance;
		
	}
}

class Account2{
	private String s1="300";

	public String getS1() {
		return s1;
	}

	public String setS1(String s1) {
		this.s1 = s1;
		return s1;
	}
}

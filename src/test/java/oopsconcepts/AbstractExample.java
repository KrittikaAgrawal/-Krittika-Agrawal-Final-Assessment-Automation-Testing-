package oopsconcepts;
abstract class Bank{ //abstract class
	// This is a program for abstract class for oops concepts
	abstract void moneywidhraw(); //abstract method money
	void money() {
		System.out.println("Money in your account is: "+ 50000);
	}
}
public class AbstractExample extends Bank{ // abstract class inheriting
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractExample obj = new AbstractExample();//creating object of class
		obj.moneywidhraw(); //calling function
	}
	void moneywidhraw() { //abstract class Bank method defination
		System.out.println("Money widhrawed is: "+5000);
		money();
	}
}

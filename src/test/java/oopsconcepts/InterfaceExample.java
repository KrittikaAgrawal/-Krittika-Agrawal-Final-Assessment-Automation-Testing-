package oopsconcepts;
//This is a program for Interface for oops concepts
interface Healthcare{ //interface initialization
	void company();
}
interface Database{ //interface initialization
	void customers();
}
public class InterfaceExample implements Healthcare,Database { //interfaces implements 
	public static void main(String[] args) {
		InterfaceExample obj = new InterfaceExample(); //object creation
		obj.company(); //calling method 1
		obj.customers(); //calling method 2
	}
	public void company() { //interface defination for method-1
		System.out.println("Comapny Name is: Medilife");
	}
	public void customers() { //interface defination for method-2
		System.out.println("Number of customers registered are : "+ 10000);
	}
}

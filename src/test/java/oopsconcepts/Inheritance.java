package oopsconcepts;
//This is a program for Inheritance-Multilevel for oops concepts
class AddBen{// Parent class for Login
	void verifyamount() {
		System.out.println("The bank balance amount is : "+ 50000);
	}
}
class Login extends AddBen{ //Parent Class for Inheritance
	void verifylogin() 
	{
		System.out.println("Login Successful: \nCongratulations!!!");
		verifyamount();
	}
}
public class Inheritance extends Login {//child class for Login
	void verifyaddben(int x)
	{
		System.out.println("Ben. verified successfully!!");
		verifylogin();
	}
	public static void main(String[] args) {
		Inheritance obj = new Inheritance(); //creating an object for class
		obj.verifyaddben(12345);//verifying login for class
	}
}

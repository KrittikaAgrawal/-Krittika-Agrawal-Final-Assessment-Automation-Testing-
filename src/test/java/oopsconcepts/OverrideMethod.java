package oopsconcepts;
//This is a program for Method Overriding for oops concepts
class Medical{
	void printing() { //printing method overriding
		System.out.println(" This is the Medical Policy!!");
}
}
class Claim extends Medical{ //child class of Medical
	void printing() { //printing method overriding
		super.printing(); //super keyword used to access overriding method
		System.out.println(" The claim made is : 50000. ");
}
}
public class OverrideMethod extends Claim{ //child class of Claim
	void printing() { //printing method overriding
		super.printing();//super keyword used to access overriding method
		System.out.println(" Thanks for registering!");
	}
	public static void main(String[] args) {
		OverrideMethod obj = new OverrideMethod();//creating object of class
		obj.printing(); //calling printing function
	}
}

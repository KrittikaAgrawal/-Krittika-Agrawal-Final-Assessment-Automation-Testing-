package oopsconcepts;
//This is a program for Method Overloading for oops concepts
public class OverloadingMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingMethod obj = new OverloadingMethod();// object creation
		int sum = obj.add(2, 3); //method calling with two int parameters
		System.out.println("Addition of two int numbers is: "+ sum);
		int sum1 = obj.add(2, 3, 5); //method calling with three int parameters
		System.out.println("Addition of three int numbers is: "+ sum1);
		float sum2= obj.add(10f, 11f); //method calling with two float parameters
		System.out.println("Addition of two float numbers is: "+ sum2);
	}
	int add(int a, int b) //method defination with two int parameters
	{
		return(a+b);
	}
	int add(int a, int b, int c) //method defination with three int parameters
	{
		return(a+b+c);
	}
	float add(float a, float b) //method defination with two float parameters
	{
		return(a+b);
	}
}

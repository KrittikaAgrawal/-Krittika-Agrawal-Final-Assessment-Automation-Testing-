package oopsconcepts;
public class OverloadingMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingMethod obj = new OverloadingMethod();
		int sum = obj.add(2, 3);
		System.out.println("Addition of two int numbers is: "+ sum);
		int sum1 = obj.add(2, 3, 5);
		System.out.println("Addition of three int numbers is: "+ sum1);
		float sum2= obj.add(10f, 11f);
		System.out.println("Addition of two float numbers is: "+ sum2);
	}
	int add(int a, int b)
	{
		return(a+b);
	}
	int add(int a, int b, int c)
	{
		return(a+b+c);
	}
	float add(float a, float b)
	{
		return(a+b);
	}
}

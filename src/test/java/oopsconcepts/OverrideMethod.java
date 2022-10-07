package oopsconcepts;
class Animal{
	void printing() {
		System.out.println(" This is the Grandfather Class!!");
}
}
class Animal1 extends Animal{
	void printing() {
		super.printing();
		System.out.println(" This is the Father Class!!");
}
}
public class OverrideMethod extends Animal1{
	void printing() {
		super.printing();
		System.out.println(" This is the Child Class!!");
	}
	public static void main(String[] args) {
		OverrideMethod obj = new OverrideMethod();
		obj.printing();
	}
}

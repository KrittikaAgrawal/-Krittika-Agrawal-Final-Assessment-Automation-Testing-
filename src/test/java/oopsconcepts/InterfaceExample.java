package oopsconcepts;
interface Interface1{
	void m1();
}
interface Interface2{
	void m2();
}
public class InterfaceExample implements Interface1,Interface2 {
	public static void main(String[] args) {
		InterfaceExample obj = new InterfaceExample();
		obj.m1();
		obj.m2();
	}
	public void m1() {
		System.out.println("M1 CODE");
	}
	public void m2() {
		System.out.println("M2 CODE");
	}
}

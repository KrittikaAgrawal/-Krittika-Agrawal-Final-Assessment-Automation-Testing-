package oopsconcepts;
abstract class Abc{
	abstract void m1();
	void m2() {
		System.out.println("M2 CODE");
	}
}
public class AbstractExample extends Abc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractExample obj = new AbstractExample();
		obj.m1();
	}
	void m1() {
		System.out.println("M1 CODE");
		m2();
	}
}

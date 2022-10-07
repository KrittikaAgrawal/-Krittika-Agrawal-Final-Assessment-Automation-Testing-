package oopsconcepts;
class Parent{  
private void msgprivate(){// private method to class Parent
	System.out.println("Hello this is the private access modifier of class Parent!");
} 
protected void msgprotected(){//protected member to Class Parent
	System.out.println("Hello this is the protected access modifier of class Parent!");
}  
void msgdefault(){ //default method
	System.out.println("Hello this is the default access modifier of class Parent!");}  
} 
public class AccessModifiers extends Parent {
	private void printing(int x ) { // private method to class AcessModifiers i.e. the derived class
		System.out.println("The value of x in Private is : "+ x);
	}
	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		obj.printing(100);
		obj.msgprotected();
		obj.msgdefault();
	}

}

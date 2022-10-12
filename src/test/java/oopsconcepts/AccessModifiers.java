package oopsconcepts;
//This is a program for Access Modifiers for oops concepts
class Banking{  
private void account(){// private method to class Banking
	System.out.println("Your account number is: "+ 12345);
} 
protected void customer(){//protected member to Class Banking
	System.out.println("Hello customer your bank balance is: "+ 50555);
}  
void customeracc(){ //default method
	System.out.println("Hello dear customer to our banking services!!");}  
} 
public class AccessModifiers extends Banking {
	private void printing(int x ) { // private method to class AcessModifiers i.e. the derived class
		System.out.println("Hello Krittika");
	}
	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();//creating object of class
		obj.printing(100); //calling functions of classes
		obj.customer();
		obj.customeracc();
	}

}

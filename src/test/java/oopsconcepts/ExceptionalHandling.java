package oopsconcepts;
public class ExceptionalHandling  {
	//This is a program for Exceptional Handling for oops concepts
	public static void main(String[] args) {
		int bankingaccount=0;
		int a[]= new int[7]; //array declaration
		try { //try block
			a[10] = 100/bankingaccount; //division by 0 error and array index out of range error
		}
		catch(ArrayIndexOutOfBoundsException e) { //catch blocks for exceptions
			System.out.println("Index out of range");
			System.out.println("Banking Amount is: 0000.0"); //Banking amount is 0
		}
		catch(ArithmeticException e) { //catch blocks for exceptions
			System.out.println("Arithmetic Exception occured");
			System.out.println("The account amount is 0, so money can not be widhrawn."); //Banking amount is 0
		}
		catch(Exception e) { //catch blocks for exceptions
			System.out.println("Exception occured");
		}
		finally { //finally block for execution finally
			System.out.println("Thanks for using our services!!");
		}
	}
}



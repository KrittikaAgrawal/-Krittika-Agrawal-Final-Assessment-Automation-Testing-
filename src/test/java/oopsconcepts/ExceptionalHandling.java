package oopsconcepts;
public class ExceptionalHandling  {

	public static void main(String[] args) {
		int a[]= new int[7];
		try {
			a[10] = 100/0;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of range");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occured");
		}
		catch(Exception e) {
			System.out.println("Exception occured");
		}
		finally {
			System.out.println("This is the finally block!!");
		}
	}
}



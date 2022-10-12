package oopsconcepts;
import java.util.*;
//This is a program for collections for oops concepts
public class CollectionsExamples {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// ArrayList
		Collection values=new ArrayList();//creating object of arraylist class
		values.add("Name: Krittika"); //adding values to arrays
		values.add("Bank: HDFC");
		values.add("Bank Amount: "+10000);
		Iterator i= values.iterator(); //iterating over values of array
		while(i.hasNext())
		{
			System.out.println("Array List: "+ i.next()); //printing values
		}
		values.remove("Bank: HDFC"); // removing values
		for(Object i1 : values)
		{
			System.out.println(i1);
		}
		// LinkedList
		LinkedList<String> ll = new LinkedList<String>();//creating object of linkedlist class
        ll.add("Name: Krittika"); //adding values to linkedlist
        ll.add("Bank: HDFC");
        ll.addLast("Bank Amount: "+10000); //adding values to last to linkedlist
        ll.addFirst("Hi");//adding values to first to linkedlist
        System.out.println("Linked list: "+ll);
        ll.remove("Hi"); //removing values to linkedlist
        ll.removeFirst(); //removing first values to linkedlist
        ll.removeLast(); //removing last values to linkedlist
        System.out.println(ll); //printing
        //VectorList
        Vector<Integer> v = new Vector<Integer>(); //creating object of vector class
        for (int j = 1; j <= 5; j++)
            v.add(j); //adding values to vectorlist
        System.out.println("Vector list: "+v);
        v.remove(3); //removing values to vectorlist
        System.out.println(v);
        for (int k = 0; k < v.size(); k++)
            System.out.print(v.get(k) + " "); //printing
        //Hashset
        HashSet<String> set = new HashSet<String>(); //creating object of class
        set.add("Name: Krittika"); //adding values to HashSet
        set.add("Bank: HDFC");
        set.add("Bank Amount: "+10000); 
        set.add("Hi");
		System.out.println("\nHashSet: " + set);
		set.remove("HI"); //removing values to HashSet
		System.out.println("HashSet after removing elements: " + set); //printing
		//LinkedHashSet
		LinkedHashSet<String> linkedset = new LinkedHashSet<String>(); //creating object of class
		linkedset.add("Name: Krittika"); //adding values to LinkedHashSet
		linkedset.add("Bank: HDFC");
		linkedset.add("Bank Amount: "+10000); 
		linkedset.add("Hi");
		System.out.println("Size of LinkedHashSet = "+ linkedset.size()); //size of LinkedHashSet
		System.out.println("Original LinkedHashSet:"+ linkedset); //printing
		System.out.println("Removing Bank: HDFC from LinkedHashSet:"+ linkedset.remove("Bank: HDFC")); //removing values to LinkedHashSet
		System.out.println("Trying to Remove Z which is not "+ "present: " + linkedset.remove("Z"));
		System.out.println("Checking if Hi is present="+ linkedset.contains("Hi")); //checking for contains condition
		System.out.println("Updated LinkedHashSet: "+ linkedset); //printing

    }
}


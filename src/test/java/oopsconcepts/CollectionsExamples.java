package oopsconcepts;
import java.util.*;
public class CollectionsExamples {
	public static void main(String[] args) {
		// ArrayList
		Collection values=new ArrayList();
		values.add("Krittika");
		values.add(1);
		values.add(33.22);
		Iterator i= values.iterator();
		while(i.hasNext())
		{
			System.out.println("Array List: "+ i.next());
		}
		values.remove(33.22);
		for(Object i1 : values)
		{
			System.out.println(i1);
		}
		values.add(2);
		for(Object i1 : values)
		{
			System.out.println(i1);
		}
		// LinkedList
		LinkedList<String> ll = new LinkedList<String>();
        ll.add("Krittika");
        ll.add("Agrawal");
        ll.addLast("Ran");
        ll.addFirst("Anil");
        ll.add(2, "Harish");
        System.out.println("Linked list: "+ll);
        ll.remove("Anil");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        //VectorList
        Vector<Integer> v = new Vector<Integer>();
        for (int j = 1; j <= 5; j++)
            v.add(j);
        System.out.println("Vector list: "+v);
        v.remove(3);
        System.out.println(v);
        for (int k = 0; k < v.size(); k++)
            System.out.print(v.get(k) + " ");
        //Hashset
        HashSet<String> set = new HashSet<String>();
		set.add("HI");
		set.add("To");
		set.add("ALL");
		set.add("For");
		set.add("READ");
		System.out.println("\nHashSet: " + set);
		set.remove("HI");
		System.out.println("HashSet after removing elements: " + set);
		//LinkedHashSet
		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
		linkedset.add("A");
		linkedset.add("B");
		linkedset.add("C");
		linkedset.add("D");
		linkedset.add("A");
		linkedset.add("E");
		System.out.println("Size of LinkedHashSet = "+ linkedset.size());
		System.out.println("Original LinkedHashSet:"+ linkedset);
		System.out.println("Removing D from LinkedHashSet:"+ linkedset.remove("D"));
		System.out.println("Trying to Remove Z which is not "+ "present: " + linkedset.remove("Z"));
		System.out.println("Checking if A is present="+ linkedset.contains("A"));
		System.out.println("Updated LinkedHashSet: "+ linkedset);


    }
}


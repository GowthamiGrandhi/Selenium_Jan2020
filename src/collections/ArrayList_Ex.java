package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Ex {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>(); // creating array list
		
		list.add("Venky");
		list.add("Gow");
		list.add("Venky");
		list.add("Gow");
		list.add("Leela");
		
		//Traversing list through Iterator
		Iterator ite = list.iterator();
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
}

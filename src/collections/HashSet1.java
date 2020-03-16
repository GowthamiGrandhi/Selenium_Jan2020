package collections;

import java.util.HashSet;
import java.util.Iterator;


public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet<String> SetA = new HashSet<String>();
		SetA.add("pj");
		SetA.add("SV");
		SetA.add("pj");
		SetA.add("SV");
		SetA.add("RM");
		
		//access via iterator
		Iterator ite = SetA.iterator();
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}

}

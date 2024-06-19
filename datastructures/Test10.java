package datastructures;

import java.util.Iterator;
import java.util.LinkedList;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Jack");
		ll.add("Alex");
		ll.add("Vincent");
		ll.add("Robert");
		
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

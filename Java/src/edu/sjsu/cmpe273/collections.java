//Use Linkedlist!

package edu.sjsu.cmpe273;

import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class collections {

	public static <G> boolean checklinkedlist(G element) {
		LinkedList list = new LinkedList();
		list.add(45);
		list.add(21);
		list.add("hardik");
		list.add("this is good");
		list.add(2, "element");
		list.addFirst(1);
		list.addLast("last");

		System.out.println(list);

		list.removeLast();
		list.remove(3);

		System.out.println(list);

		// get and set objetcs

		Object toadd = list.get(1);

		list.set(3, toadd + " instead of hardik!");
		System.out.println(list);

		if (list.contains(element)) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (checklinkedlist(21)) {
			System.out.println("Match found!");
		} else
			System.out.println("sorry");

	}

}

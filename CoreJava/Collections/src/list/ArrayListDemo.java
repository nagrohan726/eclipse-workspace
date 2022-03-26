package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

//		ArrayList list = new ArrayList();
//		list.add(new Integer(20));
//		list.add(10);	// since java 1.5 because of autoboxing it's possible to add primitive type values as well
//		list.add(30.45);
//		list.add("Hello");

		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(new Integer(20));
		list.add(Integer.valueOf(20)); // alternative for above deprecation
		list.add(10); // since java 1.5 because of autoboxing it's possible to add primitive type
						// values as well
		list.add((int) 30.45);
//		list.add("Hello");

//		System.out.println(list);

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
//			itr.remove();
		}
//		System.out.println(list);

	}

}

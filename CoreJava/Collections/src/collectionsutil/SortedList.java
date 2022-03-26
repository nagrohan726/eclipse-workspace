package collectionsutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>();

		l.add("Z");
		l.add("A");
		l.add("X");
		l.add("B");

		System.out.println("Before Sorting: " + l);

		Collections.sort(l);
//		Collections.sort(l, new MyComparator());

		System.out.println("After Sorting: " + l);

//		int result = Collections.binarySearch(l, "X");	// requires sorted list
		int result = Collections.binarySearch(l, "C"); // if key not present in list
														// search result returns insertion point
														// that is, where key could be inserted
														// starts with -1, so -3 is 3rd position
		System.out.println("Index is: " + result);

	}

}

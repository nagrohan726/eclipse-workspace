package set;

import java.util.Set;
import java.util.TreeSet;

import comparator.StringComparator;

public class StringTreeSet {

	public static void main(String[] args) {

//		Set<String> set = new TreeSet<>(); // chronological alphabets
//
//		set.add("abc");
//		set.add("xyz");
//		set.add("def");
//		set.add("mno");
//
//		for (String obj : set) {
//			System.out.println(obj);
//		}

		Set<String> set = new TreeSet<>(new StringComparator());

		set.add("abcxyz");
		set.add("xyzabcde");
		set.add("defzzzzzzzzzzzzzz");
		set.add("mno");

		for (String obj : set) {
			System.out.println(obj);
		}

	}

}

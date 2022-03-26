package navigable;

import java.util.TreeSet;

public class NavigableTreeSetDemo {

	public static void main(String[] args) {

		TreeSet<Integer> s = new TreeSet<>();

		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);

		System.out.println(s);

		System.out.println(s.ceiling(20)); // lowest number greater than or equal to 20
		System.out.println(s.higher(40)); // lowest number greater than 40
		System.out.println(s.floor(10)); // highest number less than or equal to 10
		System.out.println(s.lower(30)); // highest number less than 30
		System.out.println(s.pollFirst()); // removes and returns first element or null if empty
		System.out.println(s);
		System.out.println(s.pollLast()); // removes and returns last element or null if empty
		System.out.println(s);
		System.out.println(s.descendingSet()); // descending order
		System.out.println(s);

	}

}

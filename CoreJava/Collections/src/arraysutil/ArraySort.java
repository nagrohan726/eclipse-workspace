package arraysutil;

import java.util.Arrays;
import java.util.List;

public class ArraySort {

	public static void main(String[] args) {

		int[] a = { 40, 10, 15, 7 };

		System.out.println("Before sort");
		for (int element : a) {
			System.out.println(element);
		}

		Arrays.sort(a);

		System.out.println("After sort");
		for (int element : a) {
			System.out.println(element);
		}

		System.out.println();
		String[] s = { "V", "A", "Z", "P" };

		Arrays.sort(s, new ArrayComparator());

		for (String string : s) {
			System.out.println(string);
		}

		List<String> list = Arrays.asList(s);
		s[1] = "Y"; // list reflects the array
//		list.add("O");	// UnsupportedOperationException	// cannot perform operations that changes the array
		System.out.println(list);

	}

}

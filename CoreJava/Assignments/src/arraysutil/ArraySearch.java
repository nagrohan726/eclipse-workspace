package arraysutil;

import java.util.Arrays;

public class ArraySearch {

	public static void main(String[] args) {

		String[] s = { "V", "A", "Z", "P" };

		int result = Arrays.binarySearch(s, "Z");
		System.out.println("Index is: " + result);

		Arrays.sort(s);
		result = Arrays.binarySearch(s, "Z");
		System.out.println("Index is: " + result);

	}

}

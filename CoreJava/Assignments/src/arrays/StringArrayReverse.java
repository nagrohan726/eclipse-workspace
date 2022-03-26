package arrays;

public class StringArrayReverse {

	public static void main(String[] args) {

		String arr[] = { "You", "make", "your", "own", "destiny" };

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}

package mostwanted;

public class IllegalArgumentDemo {

	public static int sum(int a, int b) {
		if (a == 0 || b == 0) {
			throw new IllegalArgumentException("a and b should not be 0");
		}
		return a + b;
	}

	public static void main(String[] args) {

		Thread thread = new Thread();
		thread.setPriority(10); // Max value
//		thread.setPriority(100);

		sum(0, 5);
	}

}

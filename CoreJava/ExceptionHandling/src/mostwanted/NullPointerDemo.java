package mostwanted;

public class NullPointerDemo {

	public static void main(String[] args) {

		String s = "Hello";
		System.out.println(s.length());

		String n = null;
		if (n != null) {
			System.out.println(n.length());
		}
	}

}

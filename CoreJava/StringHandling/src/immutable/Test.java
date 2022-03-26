package immutable;

public class Test {

	public static void main(String[] args) {

		User user = new User(1, "John");
		System.out.println(user);

		String s = new String("Rohan");
		System.out.println(s);

//		Integer i = new Integer(30);
		Integer i = Integer.valueOf(30); // alternative for above deprecation - returns Integer object
		System.out.println(i);
	}

}

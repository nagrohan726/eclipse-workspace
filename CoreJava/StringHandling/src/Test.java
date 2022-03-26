
public class Test {

	public static void main(String[] args) {

		Product product = new Product(1, "iPhone");
		System.out.println(product);

		String s = "123";
//		Integer i = new Integer(456);
		Integer i = Integer.valueOf(456); // alternative for above deprecation

		System.out.println(s);
		System.out.println(i);
	}

}

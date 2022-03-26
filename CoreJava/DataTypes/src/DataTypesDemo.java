
public class DataTypesDemo {

	public static void main(String[] args) {

		byte a = -50;
		short b = 150;
		int c = 10000;
		long d = 100000;
		char e = 'A';

		float f = 1.23f;
		double g = 12345.6789;

		byte h = 20;

//		int result = a + h;
		byte result = (byte) (a + h);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(result);

	}

}

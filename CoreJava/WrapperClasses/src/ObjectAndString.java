
public class ObjectAndString {

	public static void main(String[] args) {

		long x = 100000;
		Long y = Long.valueOf(x);
		String s = y.toString();
		Long z = Long.valueOf(s);

	}

}


public class Constructors {

	public static void main(String[] args) {

		long l = 10000;
//		Long a = new Long(l);
		Long a = Long.valueOf(l);

		System.out.println(a);

		String s = "2000";
//		Long b = new Long(s);
		Long b = Long.valueOf(s);

		System.out.println(b);

	}

}

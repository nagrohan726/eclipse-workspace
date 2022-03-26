
public class Test {

	static ArrayIndexOOBDemo a;

	public static void main(String[] args) {

		try {
			Test.a.method1();
		} catch (NullPointerException e) {
//			e.printStackTrace();
			System.out.println("Create object before reference");
		}
		System.out.println("Rest of the code");
	}

}

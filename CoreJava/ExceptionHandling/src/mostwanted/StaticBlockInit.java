package mostwanted;

public class StaticBlockInit {

	static { // ExceptionInInitializerError - Because static block gets executed when the
				// class is initializing
		int i = 20 / 0;
		System.out.println(i);
	}

	public static void main(String[] args) {

	}
}

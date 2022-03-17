package finalconcepts;

public /* final */ class A {

	final static float pi = 3.14f;

//	A() {
//		pi = 3.14f;	// need to remove from declaration to assign value in constructor / not with static keyword
//	}

	public final void displayValue() {
		System.out.println(A.pi);
	}

	public static void main(String[] args) {
		final A a1 = new A();
		System.out.println(A.pi);
//		a1 = new A();
//		a1.pi = 3.234f;

	}
}

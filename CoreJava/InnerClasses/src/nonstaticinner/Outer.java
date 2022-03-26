package nonstaticinner;

public class Outer {

	private static int x = 50;
	private int y = 70;

	void f1() {
		System.out.println("Outer Class's Non-Static Method");
	}

	class Inner {

		private int y = 30;

		void f2() {
			System.out.println("Inner Class's Non-Static Method");

			System.out.println("Outer Class's x: " + Outer.x);
			System.out.println("Outer Class's y: " + Outer.this.y);
			System.out.println("Inner Class's y: " + this.y);
		}

		static void f3() {
			System.out.println("Inner Class's Static Method");
		}
	}

	public static void main(String[] args) {

		Outer outer = new Outer();
		outer.f1();

		Outer.Inner inner = new Outer().new Inner();
		inner.f2();

//		Outer.Inner inner2 = outer.new Inner();
		Inner inner2 = outer.new Inner();
		inner2.f2();

		Inner.f3();
	}
}

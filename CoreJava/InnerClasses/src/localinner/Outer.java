package localinner;

public class Outer {
	void f1() {
		System.out.println("Inside Outer's f1()");

		class LocalInner {
			void f2() {
				System.out.println("Inside LocalInner's f2()");
			}
		}
		LocalInner inner = new LocalInner();
		inner.f2();
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.f1();

	}
}

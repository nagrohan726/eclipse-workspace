package moreinheritanceconcepts;

public class Child extends Parent {

	int c, d;

	Child(int a, int b, int c, int d) {
		super(a, b); // should be the 1st statement in the constructor
		this.c = c;
		this.d = d;
	}

	void displayDetails() {
		System.out.println("Parent's a: " + super.a);
		System.out.println("Parent's b: " + super.b);
		System.out.println("Child's c: " + c);
		System.out.println("Child's d: " + d);
	}

	void f1() {
		super.f1();
//		System.out.println(this);
//		System.out.println(super);
		System.out.println("Inside child's f1()");
	}
}

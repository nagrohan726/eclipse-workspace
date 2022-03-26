
public class MyImmutable {

	int x;

	public MyImmutable(int x) {
		this.x = x;
	}

	public MyImmutable change(int x) {
		if (this.x == x) {
			return this;
		} else {
			return new MyImmutable(x);
		}
	}

	public static void main(String[] args) {

		MyImmutable m1 = new MyImmutable(20);
		MyImmutable m2 = m1.change(20);

		System.out.println(m1 == m2);

		MyImmutable m3 = m2.change(30);
		System.out.println(m3 == m2);

	}

}

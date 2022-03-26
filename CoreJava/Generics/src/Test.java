
public class Test {

	public static void main(String[] args) {

		MyGenericClass<String> s = new MyGenericClass<>("Rohan");
		s.display();
		System.out.println(s.getObject());

		MyGenericClass<Integer> i = new MyGenericClass<>(123);
		i.display();
		System.out.println(i.getObject());

		MyGenericClass<Double> d = new MyGenericClass<>(23.25);
		d.display();
		System.out.println(d.getObject());

	}

}

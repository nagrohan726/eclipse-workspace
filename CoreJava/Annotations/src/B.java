import java.util.ArrayList;
import java.util.List;

public class B {

//	@SuppressWarnings(value = { "deprecation" })
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public static void main(String[] args) {

//		@SuppressWarnings("deprecation")
		A a = new A();
		a.myMethod();
		a.myMethod2();
		System.out.println(a);

		System.out.println(a.field1);

		List list = new ArrayList();
		System.out.println(list);

	}

}

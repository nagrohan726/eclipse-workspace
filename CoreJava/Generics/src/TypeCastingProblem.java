import java.util.ArrayList;
import java.util.List;

public class TypeCastingProblem {

	public static void main(String[] args) {

		String[] s = new String[10];
		s[0] = "John";
		s[1] = "Rob";
//		s[2] = 123;

//		List l = new ArrayList();
//		l.add("John");
//		l.add("Rob");
//		l.add(123);
//		
//		String name = (String) l.get(0);
//		String name1 = (String) l.get(1);
//		String name2 = (String) l.get(2);

		List<String> l = new ArrayList<>(); // RHS <String> optional
		l.add("John");
		l.add("Rob");
//		l.add(123);

		String name = (String) l.get(0);
		String name1 = (String) l.get(1);
//		String name2 = (String) l.get(2);

		System.out.println(name);
		System.out.println(name1);

	}

}

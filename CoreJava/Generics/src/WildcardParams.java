import java.util.ArrayList;

public class WildcardParams {

	public static void main(String[] args) {
		WildcardParams wcp = new WildcardParams();
//		wcp.myMethod(new ArrayList<String>());
//		wcp.myMethod(new ArrayList<MyClass>());
		wcp.myMethod(new ArrayList<A>());
	}

//	public void myMethod(ArrayList<?> l) {
//		l.add(null);	// ? allows only null
////		l.add("Rohan");
//	}

//	public void myMethod(ArrayList<? extends Thread> l) {
//		l.add(null); // ? allows only null
//	}

	public void myMethod(ArrayList<? super B> l) {
		l.add(null); // ? allows only null
		l.add(new B()); // super allows to add objects
	}

}

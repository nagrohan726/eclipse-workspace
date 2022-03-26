
public class AnyRunnableTest {

	public static void main(String[] args) {

//		AnyRunnable<Thread> t = new AnyRunnable<>();
//		AnyRunnable<String> s = new AnyRunnable<String>();	// not possible due to restriction

		AnyRunnable<MyClass> t = new AnyRunnable<MyClass>();

	}

}

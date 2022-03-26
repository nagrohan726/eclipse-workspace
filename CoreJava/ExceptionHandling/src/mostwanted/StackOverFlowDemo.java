package mostwanted;

public class StackOverFlowDemo {

//	static byte count;

	public static void method1() {
//		while (count < 50) {
//			count++;
		System.out.println("method1");
		method2();
//		}
//		System.out.println(count++);
	}

	public static void method2() {
//		while (count < 50) {
//			count++;
		System.out.println("method2");
		method1();
//		}
//		System.out.println(count++);
	}

	public static void main(String[] args) {
		method1();
	}
}

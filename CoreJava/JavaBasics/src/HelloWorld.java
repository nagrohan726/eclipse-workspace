
public class HelloWorld {

	public static void main(String[] args) {
		HelloWorld.factorial(1);

		System.out.println("Hello World!");

		/*
		 * for (int i = 0; i < args.length; i++) { //
		 * System.out.println("Command Line Arg: " + args[i]);
		 * 
		 * num1 = }
		 */

//		int num1 = Integer.parseInt(args[0]);
//		int num2 = Integer.parseInt(args[1]);
//		System.out.println("The sum of 2 numbers is " + (num1 + num2));

		HelloWorld h1 = new HelloWorld();
		HelloWorld h2 = new HelloWorld();

//		h1.factorial(1);
//		h2.factorial(2);

		HelloWorld.factorial(2);

	}

	public static void factorial(int n) {
		System.out.println("Can't process");
	}

	static {
		System.out.println("Static Block2");
	}

	static {
		System.out.println("Static Block1");
	}

}

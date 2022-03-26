package multithreading;

public class MainThread {

	public static void main(String[] args) {

		EvenNumbersThread et = new EvenNumbersThread();
		OddNumbersThread ot = new OddNumbersThread();

		new Thread(et).start();
		new Thread(ot).start();
	}

}

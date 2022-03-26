package multithreading;

public class OddNumbersThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 10; i += 2) {
			System.out.print(i + "\t");
		}
	}
}

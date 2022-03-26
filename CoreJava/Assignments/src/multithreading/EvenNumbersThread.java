package multithreading;

public class EvenNumbersThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i += 2) {
			System.out.print(i + "\t");
		}
	}
}

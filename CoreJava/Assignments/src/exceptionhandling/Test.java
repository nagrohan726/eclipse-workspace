package exceptionhandling;

public class Test {

	public static void main(String[] args) /* throws InterruptedException */ {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			throw new MyThreadException();
//			throw new MyThreadException("Interrupted");
		}
	}

}

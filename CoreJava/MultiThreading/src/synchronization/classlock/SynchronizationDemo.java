package synchronization.classlock;

public class SynchronizationDemo {

	public static void main(String[] args) {

		MyThread t1 = new MyThread("Rohan");
		MyThread t2 = new MyThread("Khushboo");

		t1.start();
		t2.start();
	}
}

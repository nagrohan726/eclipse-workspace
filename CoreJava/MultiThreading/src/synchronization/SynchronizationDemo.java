package synchronization;

public class SynchronizationDemo {

	public static void main(String[] args) {
		DisplayMessage dm = new DisplayMessage();

		MyThread t1 = new MyThread(dm, "Rohan");
		MyThread t2 = new MyThread(dm, "Khushboo");

		t1.start();
		t2.start();
	}
}

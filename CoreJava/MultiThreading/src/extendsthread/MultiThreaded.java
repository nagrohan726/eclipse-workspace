package extendsthread;

public class MultiThreaded extends Thread {
	public static void main(String[] args) throws InterruptedException {
		MultiThreaded mt = new MultiThreaded();
		mt.setPriority(MAX_PRIORITY); // 10 ; MIN -> 1 ; NORM -> 5
		mt.setName("mt");
		mt.start();

		MultiThreaded mt1 = new MultiThreaded();
		mt1.setPriority(MIN_PRIORITY); // 10 ; MIN -> 1 ; NORM -> 5
		mt1.setName("mt1");
		mt1.start();

//		Thread currentThread = Thread.currentThread();
//		System.out.println("Thread Name: " + currentThread.getName());

//		for (int j = 1; j <= 200; j++) {
//			System.out.print("j: " + j + "\t");
//			Thread.sleep(1000);
//		}
	}

	public void run() {

		System.out.println("Thread Name: " + Thread.currentThread().getName());

//		Thread currentThread = Thread.currentThread();
//		System.out.println("Thread Name: " + currentThread.getName());
//		currentThread.setName("Print 200 numbers");
//		System.out.println("Thread Name: " + currentThread.getName());

//		for (int i = 1; i <= 200; i++) {
//			System.out.print("i: " + i + "\t");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				System.out.println("Child Thread Exiting");
//			}
//		}
//		System.out.println();
	}
}

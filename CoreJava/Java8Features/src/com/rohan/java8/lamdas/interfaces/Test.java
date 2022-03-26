package com.rohan.java8.lamdas.interfaces;

public class Test {

	public static void main(String[] args) throws InterruptedException {

//		Runnable r = new MyRunnableImpl();
//		Thread t = new Thread(r);
//		t.start();

		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
			Thread.sleep(1000);
		}
	}

}

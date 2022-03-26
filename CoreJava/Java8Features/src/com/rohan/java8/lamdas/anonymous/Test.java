package com.rohan.java8.lamdas.anonymous;

public class Test {

	public static void main(String[] args) throws InterruptedException {

//		Thread t = new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				for (int i = 1; i <= 10; i++) {
//					System.out.println("Child Thread");
//				}
//			}
//		});
//		t.start();

		Thread t = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Child Thread");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
			Thread.sleep(1000);
		}
	}

}

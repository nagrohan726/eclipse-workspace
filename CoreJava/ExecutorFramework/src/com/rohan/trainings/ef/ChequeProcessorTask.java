package com.rohan.trainings.ef;

public class ChequeProcessorTask implements Runnable {

	String name;

	public ChequeProcessorTask(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(
				name + " Cheque Processor has began processing the cheque " + Thread.currentThread().getName());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(
				name + " Cheque Processor has completed processing the cheque " + Thread.currentThread().getName());
	}

}

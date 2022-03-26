package com.rohan.trainings.ef;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {

		ChequeProcessorTask[] cps = { new ChequeProcessorTask("ATM"), new ChequeProcessorTask("Bank"),
				new ChequeProcessorTask("Mobile"), new ChequeProcessorTask("Web") };

		ExecutorService service = Executors.newFixedThreadPool(2);

		for (ChequeProcessorTask chequeProcessorTask : cps) {
			service.submit(chequeProcessorTask);
		}

		service.shutdown();
	}

}

package concurrentcollections;

import java.util.concurrent.BlockingQueue;

public class OrderProducer implements Runnable {

	private BlockingQueue<String> queue;

	OrderProducer(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			queue.put("MacBook Pro");
			queue.put("Dell Laptop");
			queue.put("iPhone");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

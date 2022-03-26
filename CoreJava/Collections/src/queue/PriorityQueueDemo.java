package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		Queue<Integer> q = new PriorityQueue<>(); // Queue doesn't allow duplicates
													// Priorty Queue guarantees order only first time
													// Once we start removing, order may mess up
													// if order required, tree set should be used.
		System.out.println(q.peek()); // Null
//		System.out.println(q.element());	// No such element exception

		for (int i = 20; i <= 30; i++) {
			q.offer(i); // inserts in sorted order
		}

		System.out.println(q);

		System.out.println(q.poll()); // removes first element or returns Null
		System.out.println(q);

		System.out.println(q.remove()); // Removes first element or returns No such Element exception
		System.out.println(q);

	}

}

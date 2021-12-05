package com.bl.collectionframework;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String[] args) {
		doQueueDemo();
	}

	private static void doQueueDemo() {
		System.out.println("\n In doQueueDemo");
		PriorityQueue<String> queue = new PriorityQueue<>();

		queue.add("Navya shree");
		queue.add("Anokhi sha");
		queue.add("Aradhiya sha");
		queue.add("Adiya sha");
		queue.add("Harshita sha");
		queue.add("prita Raj");

		System.out.println("head:" + queue.element());
		System.out.println("head:" + queue.peek());
		System.out.println("iterating the queue elements:");
		Iterator itr = queue.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("after removing two elements: ");
		Iterator<String> itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}

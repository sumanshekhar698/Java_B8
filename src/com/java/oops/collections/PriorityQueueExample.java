package com.java.oops.collections;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<Integer>();//internally it will use minHeap

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(Collections.reverseOrder());//internally it will use maxHeap
		priorityQueue.add(53);
		priorityQueue.add(34);
		priorityQueue.add(3);
		priorityQueue.add(2);
		priorityQueue.add(23);
		priorityQueue.add(34);
		priorityQueue.add(65);
		priorityQueue.add(53);
		System.out.println(priorityQueue);

		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);

		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);

		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);


		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);


		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
		
		System.out.println(priorityQueue.peek());
		System.out.println(priorityQueue);

	}

}

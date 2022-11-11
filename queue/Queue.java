package fes.aragon.queue;

import java.util.ArrayList;

public class Queue<T> {

	private ArrayList<T> queue;

	public Queue() {
		this.queue = new ArrayList<>();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public int length() {
		return queue.size();
	}

	public void enqueue(T element) {
		queue.add(element);
	}

	public T dequeue() {
		T element;
		if (this.isEmpty()) {
			element = null;
		} else {
			element = queue.get(0);
			queue.remove(0);
		}
		return element;
	}
	
	
	public String toString() {
		return "- Queue: " + this.queue + " -";
	}
}

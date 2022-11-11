package fes.aragon.priority.queue;

import fes.aragon.queue.Queue;

public class BoundedPriorityQueue<T> {

	private Queue[] queue;
	private int length, lengthLevels;
	
	public BoundedPriorityQueue(int priorityLevels) {
		this.length = 0;
		this.lengthLevels = priorityLevels;
		this.queue = new Queue[priorityLevels];
		for (int i = 0; i < priorityLevels; i++) {
			queue[i] = new Queue<>();
		}
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public int lenght() {
		return length;
	}
	
	public T enqueue (int priority, T element) {
		if (priority < lengthLevels) {
			queue[priority].enqueue(element);
			length++;
		} else {
			System.out.println("Fuera del rango de niveles.");
		}
		return element;
	}
	
	public T dequeue() {
		boolean aux = true;
		T element = null;;
		
		for (int i = 0; aux && length > 0; i++) {
			if (!queue[i].isEmpty()) {
				element = (T) queue[i].dequeue();
				aux = false;
			}
		}
		length--;
		return element;
	}
	
	
	public String toString() {
		return "- Bounded Priority Queue is: " + elements() + " with " + (lengthLevels - 1) + " priority levels. -";
	}
	
	private String elements() {
		String string = "";
		for (int i = 1; i < lengthLevels; i++) {
			string += queue[i];
		}
		return string;
	}
}

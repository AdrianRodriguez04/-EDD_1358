package fes.aragon.priority.queue;

public class Test {

	public static void main(String[] args) {
		
		BoundedPriorityQueue queue = new BoundedPriorityQueue<>(6);
		
		queue.enqueue(4, "Maestre");
		queue.enqueue(2, "Niños");
		queue.enqueue(4, "Mecánico");
		queue.enqueue(3, "Hombres");
		queue.enqueue(4, "Vigia");
		queue.enqueue(5, "Capitán");
		queue.enqueue(4, "Timonel");
		queue.enqueue(3, "Mujeres");
		queue.enqueue(2, "3ra Edad");
		queue.enqueue(1, "Niñas");
		
		System.out.println(queue);
	}
}

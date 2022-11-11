package fes.aragon.queue;

public class Test {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new Queue<>();
		
		queue.enqueue(1234);
		queue.enqueue(4656);
		queue.enqueue(14);
		queue.enqueue(642);
		queue.enqueue(1);
		queue.enqueue(95843);
		queue.enqueue(0);
		
		System.out.println(queue);
		
		queue.dequeue();
		queue.dequeue();
		System.out.println(queue.dequeue());
		
		System.out.println(queue);
	}
}

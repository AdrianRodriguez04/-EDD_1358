package fes.aragon.hashtable;

import java.util.ArrayList;

import fes.aragon.pilas.Stack;
import fes.aragon.queue.Queue;

public class HashTableADT<T> {

	private ArrayList<Queue> table;

	public HashTableADT(Integer tableSize) {
		table = new ArrayList<>();
		for (int i = 0; i < tableSize; i++) {
			table.add(new Queue<>());
		}
	}

	public void add(int key, T data) {
		Queue aux = table.get(this.masterKey(key));
		aux.enqueue(new Key(key, data));
	}

	public T valueOf(int key) {
		T data = null;
		Queue temporary = table.get(masterKey(key));
		Queue dataSave = new Queue<>();
		Key currentKey = (Key) temporary.dequeue();
		dataSave.enqueue(currentKey);
		boolean centinel = true;
		
		while (centinel) {
			if(currentKey.getKey() == key || dataSave.isEmpty()) {
				centinel = false;
				if(!dataSave.isEmpty()) {
					data = (T) currentKey.getElement();
				}
			} else {
				currentKey = (Key) temporary.dequeue();
				dataSave.enqueue(currentKey);
			}
		}
		
		while(!dataSave.isEmpty()) {
			temporary.enqueue(dataSave.dequeue());
		}
		
		return data;
	}

	public void remove(int key) {
		Queue temporary = table.get(masterKey(key));
		Stack cave = new Stack<>();
		boolean centinel = true;
		Key currentKey = null;

		try {
			currentKey = (Key) temporary.dequeue();
			cave.push(currentKey);
		} catch (ClassCastException e) {
			centinel = false;
		}

		while(centinel) {
			if(currentKey.getKey() == key || cave.isEmpty()) {
				centinel = false;
				if (!cave.isEmpty()) {
					cave.pop();
				} 
			} else {
				currentKey = (Key) temporary.dequeue();
				cave.push(currentKey);
			}
		}
		
		while (!cave.isEmpty()) {
			temporary.enqueue(cave.pop());
		}
	}

	private int masterKey(int key) {
		return key % table.size();
	}

	@Override
	public String toString() {
		return "HashTableADT [table=" + table + "]";
	}
	
	

}

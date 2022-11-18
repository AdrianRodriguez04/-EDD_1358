package fes.aragon.hashtable;

public class Key<T> {

	private int key;
	private T element;
	
	public Key(int key, T element) {
		this.key = key;
		this.element = element;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}
	
	public String toString() {
		return "Key: " + this.key + ". Data: " + this.element;
	}
}

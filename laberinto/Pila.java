package fes.aragon.juego.laberinto;

import fes.aragon.lista.ligada.Nodo;

public class Pila<T> {

	private Nodo<T> top;
	private int longitud;
	
	public Pila() {
		this.top = null;
		this.longitud = 0;
	}
	
	public int getLongitud() {
		return longitud;
	}
	
	public boolean estaVacia() {
		return top == null;
	}
	
	public void push(T valor) {
		Nodo nuevo = new Nodo<T>(valor, top);
		this.top = nuevo;
		this.longitud++;
	}
	
	public T pop() {
		T aux;
		if (this.estaVacia()) {
			return null;
		} else {
			aux = top.getDato();
			top = top.getSiguiente();
			this.longitud--;
			return aux;
		}
	}
	
	public T peek() {
		if (this.estaVacia()) {
			return null;
		} else {
			return top.getDato();
		}
	}
	
	public void imprimir() {
		Nodo currNode = this.top;
		while (currNode != null) {
			System.out.print(currNode);
			currNode = currNode.getSiguiente();
		}
		System.out.println("");
	}
}

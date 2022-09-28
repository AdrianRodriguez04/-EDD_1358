package fes.aragon.lista.doblemente.ligada;

public class ListaDoblementeLigada<T> {

	NodoDoble<T> head;
	int tamaño;

	public ListaDoblementeLigada() {
		this.head = null;
		this.tamaño = 0;
	}

	public boolean estaVacia() {
		return this.head == null;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void agregarAlFinal(T valor) {
		NodoDoble nuevo = new NodoDoble(valor);
		if (this.estaVacia()) {
			this.head = nuevo;
		} else {
			NodoDoble aux = this.head;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			nuevo.setAnterior(aux);
			aux.setSiguiente(nuevo);
			aux = null;
			nuevo = null;
		}
	}

	public void actualizarValor(T valorAntiguo, T valorNuevo) {

		NodoDoble<T> nuevo = this.head;

		while (nuevo.getSiguiente() != null) {

			if (nuevo.getDato() == valorAntiguo) {
				nuevo.setDato(valorNuevo);
				break;
			} else {
				if (nuevo.getDato() != valorAntiguo) {
					nuevo = nuevo.getSiguiente();
				}
				if (nuevo.getDato() == valorAntiguo) {
					nuevo.setDato(valorNuevo);
					break;
				}
			}
		}
	}

	public void agregarAlInicio(T valor) {
		NodoDoble nuevo = new NodoDoble(valor);
		if (this.estaVacia()) {
			this.head = nuevo;
		} else {
			nuevo.setSiguiente(this.head);
			head.setAnterior(nuevo);
			this.head = nuevo;
		}
	}

	public void agregarDespuesDe(int posicion, T valor) {
		NodoDoble<T> nuevo = new NodoDoble(valor);
		NodoDoble<T> aux = this.head;
		for (int i = 1; i <= posicion - 1; i++) {
			aux = aux.getSiguiente();
		}
		nuevo.setSiguiente(aux.getSiguiente());
		aux.getSiguiente().setAnterior(nuevo);
		aux.setSiguiente(nuevo);
		nuevo = null;
		aux = null;
	}

	public void eliminar(int posicion) {
		NodoDoble aux = this.head;
		for (int contador = 1; contador <= posicion - 1; contador++) {
			aux = aux.getSiguiente();
		}

		aux.setSiguiente(aux.getSiguiente().getSiguiente());
		aux = null;
	}

	public int buscarValor(T valor) {
		NodoDoble<T> nuevo = this.head;
		int posicion = 1;
		while (nuevo.getSiguiente() != null) {
			if (nuevo.getDato() != valor) {
				posicion += 1;
				nuevo = nuevo.getSiguiente();
			} else {
				break;
			}
		}
		return posicion;
	}

	public void eliminarElPrimero() {
		if (this.estaVacia()) {
			System.out.println("Esta vacia, no hay nada que eliminar.");
		} else {
			NodoDoble nuevo = head.getSiguiente();
			head = nuevo;
			head.setAnterior(null);
		}
	}

	public void eliminarElFinal() {
		NodoDoble nuevo = this.head;
		int tamaño = 0;
		while (nuevo.getSiguiente() != null) {
			nuevo = nuevo.getSiguiente();
			tamaño++;
		}
		NodoDoble aux = this.head;
		for (int contador = 1; contador <= tamaño - 1; contador++) {
			aux = aux.getSiguiente();
		}
		aux.setSiguiente(aux.getSiguiente().getSiguiente());
		aux.setAnterior(aux);
		aux = null;
		nuevo = null;
	}

	public void transversal() {
		NodoDoble curr_node = this.head;
		while (curr_node != null) {
			System.out.print(curr_node);
			curr_node = curr_node.getSiguiente();
		}
		System.out.println("");
	}

}

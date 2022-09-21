package fes.aragon.juego.vida;

import java.util.ArrayList;

public class ArrayADT<T> {

	private int tamaño;
	private ArrayList<T> datos;

	public ArrayADT(int tam) {
		this.tamaño = tam;
		datos = new ArrayList<>(this.tamaño);
		for (int i = 0; i < tam; i++) {
			this.datos.add(null);
		}
	}

	public T getElemento(int indice) {
		if (comprobacion(indice)) {
			return this.datos.get(indice);
		} else {
			System.out.println("Fuera del rango");
		}
		return null;
	}

	private boolean comprobacion(int indice) {
		return indice >= 0 && indice < this.tamaño;
	}

	public void setElemento(int indice, T dato) {
		if (comprobacion(indice)) {
			this.datos.set(indice, dato);
		} else {
			System.out.println("Fuera del rango");
		}
	}

	public int getLongitud() {
		return datos.size();
	}

	public void limpiar(T dato) {
		for (int i = 0; i < this.tamaño; i++) {
			this.datos.set(i, dato);
		}
	}

	public String toString() {
		String estado = "";
		for (T dato : datos) {
			if (dato != null) {
				estado += dato.toString() + "\n";
			}
		}
		return estado;
	}

	

}

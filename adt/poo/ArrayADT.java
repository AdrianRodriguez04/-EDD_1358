package fes.aragon.adt.poo;

import java.util.ArrayList;

public class ArrayADT {

	private int tamaño;
	private ArrayList<Object> datos;
	
	public ArrayADT (int tam) {
		this.tamaño = tam;
		datos = new ArrayList<>();
		for (int i = 0; i < tam; i++) {
			datos.add(new Object());
		}
	}
	
	public Object getElemento(int indice) {
		if (indice >= 0 && indice < this.tamaño) {
			return datos.get(indice);
		}
		return null;
	}
	
	public void setElemento (Object elemento, int indice) {
		if(indice >= 0 && indice < this.tamaño) {
			datos.set(indice, elemento);
		}
	}
	
	public void getLongitud() {
		System.out.println(datos.size());
	}
	
	public void limpiar (Object dato) {
		
		int tam = this.tamaño;
		datos = new ArrayList<>();
		for (int i = 0; i < tam; i++) {
			datos.add(dato);
		}
	}
	
}

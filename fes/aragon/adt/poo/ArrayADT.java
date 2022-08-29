package fes.aragon.adt.poo;

import java.util.ArrayList;

public class ArrayADT {

	private int tama�o;
	private ArrayList<Object> datos;
	
	public ArrayADT (int tam) {
		this.tama�o = tam;
		datos = new ArrayList<>();
		for (int i = 0; i < tam; i++) {
			datos.add(new Object());
		}
	}
	
	public Object getElemento(int indice) {
		if (indice >= 0 && indice < this.tama�o) {
			return datos.get(indice);
		}
		return null;
	}
	
	public void setElemento (Object elemento, int indice) {
		if(indice >= 0 && indice < this.tama�o) {
			datos.set(indice, elemento);
		}
	}
	
	public void getLongitud() {
		System.out.println(datos.size());
	}
	
	public void limpiar (Object dato) {
		
		int tam = this.tama�o;
		datos = new ArrayList<>();
		for (int i = 0; i < tam; i++) {
			datos.add(dato);
		}
	}
	
}

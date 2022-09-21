package fes.aragon.juego.vida;

public class ArrayADT2d<T> {

	private int renglones;
	private int columnas;
	private ArrayADT<T> datosRen;
	private ArrayADT<T> datosCol;

	public ArrayADT2d(int ren, int col) {
		this.renglones = ren;
		this.columnas = col;
		this.datosRen = new ArrayADT<>(ren);
		this.datosCol = new ArrayADT<>(col);

		for (int i = 0; i < renglones; i++) {
			ArrayADT temp = new ArrayADT(columnas);
			for (int j = 0; j < columnas; j++) {
				temp.setElemento(j, null);
			}
			datosRen.setElemento(i, (T) temp);
		}
	}

	public void limpiar(T dato) {
		for (int i = 0; i < renglones; i++) {
			for (int j = 0; j < columnas; j++) {
				datosCol.setElemento(j, dato);
			}
			datosRen.setElemento(i, (T) datosCol);
		}
	}
	
	public int getRenglones() {
		return this.renglones;
	}
	
	public int getColumnas() {
		return this.columnas;
	}
	
	public void setElemento(int ren, int col, T dato) {
		if (comprobacionRenglonesColumnas(ren, col)) {
			ArrayADT temp = (ArrayADT) datosRen.getElemento(ren);
			temp.setElemento(col, dato);
			datosRen.setElemento(ren, (T) temp);
		} else {
			System.out.println("Fuera de rango");
		}
	}
	
	public T getElemento(int ren, int col) {
		if (comprobacionRenglonesColumnas(ren, col)) {
			ArrayADT temp = (ArrayADT) datosRen.getElemento(ren);
			return (T) temp.getElemento(col);
		} else {
			System.out.println("Fuera de rango");
		}
		return null;
	}
	
	public String toString(){
        return datosRen.toString();
    }
	
	private boolean comprobacionRenglonesColumnas(int ren, int col) {
		return ren >= 0 && ren < this.renglones && col >= 0 && col < this.columnas;
	}
}

package fes.aragon.juego.vida;

import java.util.ArrayList;

public class ReglasTablero {

	private ArrayADT2d<Celulas> tableroGeneral;
	private ArrayList<int[]> estado;
	private Bordes bordes;

	public ReglasTablero(int renglones, int columnas, ArrayList<int[]> estado) {
		this.tableroGeneral = new ArrayADT2d<>(renglones, columnas);
		this.bordes = new Bordes(renglones, columnas);
		this.estado = estado;

		for (int i = 0; this.bordes.bordeEnX(i); i++) {
			for (int j = 0; this.bordes.bordeEnY(j); j++) {
				Celulas temp = new Celulas(i, j, this.vida(i, j));
				tableroGeneral.setElemento(j, i, temp);
			}
		}
		actualizarVecinos(tableroGeneral.getColumnas(), tableroGeneral.getRenglones());
	}

	public boolean vida(int x, int y) {
		boolean aux = false;
		for (int i = 0; i < this.estado.size(); i++) {
			int[] comparar = this.estado.get(i);
			if (comparar[0] == x && comparar[1] == y) {
				aux = true;
			}
		}
		return aux;
	}

	public int numVecinos(int x, int y) {
		int vecinosVivos = 0;
		Celulas temp;
		if (bordes.adentro(x, y)) {
			for (int xUno = x - 1; xUno <= x + 1; xUno++) {
				for (int yUno = y - 1; yUno <= y + 1; yUno++) {
					temp = tableroGeneral.getElemento(yUno, xUno);

					if (temp.isEstado() && !(yUno == y && xUno == x)) {

						vecinosVivos++;
					}
				}
			}

		} else {

			for (int xDos = bordes.getContadorX(x); xDos < bordes.getLimiteX(y); xDos++) {
				for (int yDos = bordes.getContadorY(y); yDos < bordes.getLimiteY(y); yDos++) {
					temp = tableroGeneral.getElemento(yDos, xDos);

					if (temp.isEstado() && !(yDos == y && xDos == x)) {
						vecinosVivos++;
					}
				}
			}
		}
		return vecinosVivos;
	}

	public void actualizarVecinos(int xL, int yL) {
		Celulas tmp;
		for (int i = 0; this.bordes.bordeEnX(i); i++) {
			for (int j = 0; this.bordes.bordeEnY(j); j++) {
				tmp = tableroGeneral.getElemento(j, i);
				tmp.setVecinos(numVecinos(i, j));
			}
		}
	}

	public ArrayADT2d getGeneracion() {
		return tableroGeneral;
	}

	public void generacionSig() {
		for (int i = 0; bordes.bordeEnX(i); i++) {
			for (int j = 0; bordes.bordeEnY(j); j++) {
				Celulas temp = tableroGeneral.getElemento(j, i);
				if (temp.getVecinos() >= 4 && temp.isEstado()) {
					temp.setEstado(false);
				} else {
					if (temp.getVecinos() <= 1 && temp.isEstado()) {
						temp.setEstado(false);
					} else {
						if (temp.getVecinos() >= 2 && temp.isEstado()) {
							temp.setEstado(true);
						} else {
							if (temp.getVecinos() == 3 && temp.isEstado()) {
								temp.setEstado(true);
							}
						}
					}
				}
			}
		}
	}
}

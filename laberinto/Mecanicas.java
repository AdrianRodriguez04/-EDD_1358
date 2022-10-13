package fes.aragon.juego.laberinto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import fes.aragon.adt.dimensional.Array2D;

public class Mecanicas {

	private Array2D matriz;
	private Pila camino = new Pila();
	private int[] entrada = new int[2], salida = new int[2];

	public Mecanicas(String ruta) {
		try {
			BufferedReader lectura = new BufferedReader(new FileReader(ruta));
			int col, ren;

			col = Integer.parseInt(lectura.readLine());
			ren = Integer.parseInt(lectura.readLine());

			matriz = new Array2D(ren, col);

			for (int r = 0; r < ren; r++) {
				String linea = lectura.readLine();
				String[] comas = linea.split(",");

				for (int c = 0; c < col; c++) {
					String caracterActual = comas[c];
					if (caracterActual.equals("0")) {
						matriz.setElemento(r, c, false);
					} else if (caracterActual.equals("1")) {
						matriz.setElemento(r, c, true);
					} else if (caracterActual.equals("E")) {
						matriz.setElemento(r, c, true);
						entrada[0] = r;
						entrada[1] = c;
					} else if (caracterActual.equals("S")) {
						matriz.setElemento(r, c, true);
						salida[0] = r;
						salida[1] = c;
					}
				}
			}

		} catch (FileNotFoundException ex) {
			System.out.println("Error en la lectura del archivo");
		} catch (IOException ex) {
		}

	}
	
	
	
	public int[] reglas(int renglon, int columna, int paso) {
		int[] coordenadas = new int[2];

		if (paso == 0) {
			coordenadas[0] = renglon;
			coordenadas[1] = columna - 1;
		} else {
			if (paso == 1) {
				coordenadas[0] = renglon - 1;
				coordenadas[1] = columna;
			} else {
				if (paso == 2) {
					coordenadas[0] = renglon;
					coordenadas[1] = columna + 1;
				} else {
					if (paso == 3) {
						coordenadas[0] = renglon + 1;
						coordenadas[1] = columna;
					}
				}
			}
		}

		return coordenadas;
	}
	
	public boolean[] saltarCeros(int renglones, int columnas) {
		boolean[] direccion = { true, true, true, true };

		if (renglones == 0) {
			direccion[1] = false;
		} else {
			if (renglones == matriz.getRenglones() - 1)
				;
			direccion[3] = false;
		}

		if (columnas == 0) {
			direccion[0] = false;
		} else {
			if (columnas == matriz.getColumnas() - 1) {
				direccion[2] = false;
			}
		}

		return direccion;
	}

	public void recorridoMatriz() {
		int[] posicionActual = entrada;
		int[] afuera = { -1, -1 };
		int[] posicionAnterior = posicionActual;
		boolean aux = true;

		camino.push(posicionActual);

		do {

			int[] nuevaPosicion = siguientePaso(posicionActual, posicionAnterior);
			posicionAnterior = posicionActual;
			posicionActual = nuevaPosicion;

			if (coordenadas(posicionActual, salida)) {
				camino.push(posicionActual);
				aux = false;
			} else {
				if (coordenadas(posicionActual, afuera)) {

					int[] eliminar = (int[]) camino.pop();
					matriz.setElemento(eliminar[0], eliminar[1], false);
					posicionActual = (int[]) camino.pop();
					posicionAnterior = (int[]) camino.peek();
					camino.push(posicionActual);

					if (coordenadas(eliminar, entrada)) {
						aux = false;
						camino = null;
					}
				} else {
					camino.push(posicionActual);
				}
			}
		} while (aux);
	}

	private int[] siguientePaso(int[] coordenadaActual, int[] coordenadaAnterior) {
		boolean posicion = false;
		int renglonY = coordenadaActual[0];
		int columnaX = coordenadaActual[1];
		int[] coordenadasNuevas = null;
		boolean[] direccion = new boolean[4];

		direccion = saltarCeros(renglonY, columnaX);
		for (int contador = 0; contador <= 4; contador++) {
			if (contador < 4) {
				if (direccion[contador]) {
					coordenadasNuevas = reglas(renglonY, columnaX, contador);
					posicion = (boolean) matriz.getElemento(coordenadasNuevas[0], coordenadasNuevas[1]);
					if (posicion && !this.coordenadas(coordenadasNuevas, coordenadaAnterior)) {
						break;
					}
				} else {
					continue;
				}
			} else {
				coordenadasNuevas[0] = -1;
				coordenadasNuevas[1] = -1;
			}
		}

		return coordenadasNuevas;
	}

	public void solucion() {
		if (camino == null) {
			System.out.println("No es posible salir...");
		} else {
			System.out.printf("SOLUCIÓN EN %d PASOS.\n\nCAMINO:\n\n", camino.getLongitud());
			Pila pilaAux = new Pila();
			while (camino.getLongitud() != 0) {
				int[] cord = (int[]) camino.pop();
				pilaAux.push(cord);

				System.out.println("[ " + cord[0] + " ]" + "[ " + cord[1] + " ]");
			}

			camino = pilaAux;
		}
	}

	private boolean coordenadas(int[] coordenadaNueva, int[] coordenadaVieja) {
		return (coordenadaNueva[0] == coordenadaVieja[0]) && (coordenadaNueva[1] == coordenadaVieja[1]);
	}

}

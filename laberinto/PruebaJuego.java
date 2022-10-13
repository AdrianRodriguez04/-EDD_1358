package fes.aragon.juego.laberinto;

public class PruebaJuego {

	public static void main(String[] args) {
		
		Mecanicas laberinto = new Mecanicas("C:\\FES\\Espacio_de_trabajo\\EstructuraDeDatos\\src\\fes\\aragon\\juego\\laberinto\\Laberito.csv");
		
		laberinto.recorridoMatriz();
		laberinto.solucion();
	}
}
